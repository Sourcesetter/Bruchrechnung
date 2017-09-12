package com.fraccalc;

public class Bruch {
    // Angabe der Klassenattribute
    private int zaehler;
    private int nenner;

    // Liste der Methoden der Klasse
    int getZaehler(){
        return(zaehler);
    }
    void setZaehler(int z){
        zaehler = z;
    }
    int getNenner(){
        return(nenner);
    }
    void setNenner(int n){
        if(n == 0){
            System.out.println("Bruch: Fehlermeldung! Nenner darf nicht gleich 0 sein");
            System.out.println("Bruch: Setze Nenner auf 1.");
            nenner = 1;
        }
        else{
            nenner = n;
        }
    }

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }
    String Bruchstring(){
        return zaehler + "/" + nenner;
    }

    void kuerzen(){
        int m, n, r; // lokale Variablen
        m = zaehler;
        n = nenner;
        r = m % n;
        while ( r > 0){
            m = n;
            n = r;
            r = m % n;
        }
        zaehler = zaehler / n; // in n steht jetzt der ggT
        nenner = nenner / n;
    }

    void erweitern(int a){
        // Methode mit einfachen Parameter
        zaehler *= a;
        nenner *= a;
    }


    Bruch multipliziere(Bruch b){
        // Methode mit einer Klasse als Parameter
        Bruch a = new Bruch();
        a.zaehler = zaehler * b.zaehler;
        a.nenner  = nenner *  b.nenner;
        a.kuerzen();
        return(a);
    }

    Bruch plus(Bruch b){
        // Addiert zwei Brueche
        int merker=nenner;
        Bruch a = new Bruch();
        this.erweitern(b.nenner);
        b.erweitern(merker);
        a.zaehler = zaehler + b.zaehler;
        a.nenner = b.nenner;
        a.kuerzen();
        return(a);
    }

    Bruch minus(Bruch b){
        // Subtrahiert zwei Brueche
        int merker=nenner;
        Bruch a = new Bruch();
        this.erweitern(b.nenner);
        b.erweitern(merker);
        a.zaehler = zaehler - b.zaehler;
        a.nenner = b.nenner;
        a.kuerzen();
        return(a);
    }


    void setze (int z){
        // Siehe unten 2. Methode setzen
        zaehler = z;
        nenner = 1;
    }
    void setze (int z, int n){
        // 2. Methode setzen mit gleichem Namen
        // Möglich, wenn die Methoden sich im Parametersatz unterscheiden
        zaehler = z;
        nenner = n;
    }

    void gekuerztausgeben(){
        // Man kann innerhalb einer Klasse auch die Methoden der Klasse
        // aufrufen.
        kuerzen();
        ausgeben();
    }

    double dezimalwert(){
        return zaehler/(double) nenner;
    }

    int signum(){
        // Vorzeichenbestimmung eines Bruchs
        // Nutzung einer Selbstreferenz bei Methoden
        if(this.dezimalwert() == 0){
            return 0;
        }
        if(this.dezimalwert() > 0){
            return 1;
        }
        return -1;
    }

    // Konstruktoren
    Bruch(int z, int n){
        // UEeberladen des Default-Konstruktors
        int hz, hn, r;
        if (n == 0){
            System.out.println("Bruch: Fehler! Der Nenner darf nicht 0 sein!");
        }
        else{
            hz = z;
            hn = n;
            r = hz % hn;
            while(r > 0){
                hz = hn;
                hn = r;
                r = hz % hn;
            } // in hn steht jetzt der ggT
            zaehler = z / hn;
            nenner =  n / hn;
        }
    }
    Bruch(){
        // Ueberladen des Default-Konstruktors Bruch () mit einer
        // gleichnamigen Methode, die mathematisch sauber vorbelegt.
        this(0,1);
    }
    Bruch(int n){
        this(n,1);
    }

    boolean equals(Bruch x){
        // prueft die mathematische Gleichheit zweier Brueche
        Bruch a = new Bruch(this.zaehler, this.nenner);
        Bruch b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if((a.getZaehler()==b.getZaehler()) && (a.getNenner() == b.getNenner())){
            return(true);
        }
        else{
            return(false);
        }
    }

}
