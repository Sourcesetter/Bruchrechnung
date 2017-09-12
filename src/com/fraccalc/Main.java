package com.fraccalc;

public class Main {

    public static void main(String[] args) {
	// Testprogramm zum Ausprobieren der Methoden der Bruch-Klasse.

        // System.out.print("Hallo Welt - Bruch!");

        int helferlein = 5;

        Bruch b = new Bruch();
        b.setze(3, 12);


        Bruch a = new Bruch(3,4);
        Bruch c = new Bruch();
        Bruch d = new Bruch();

        // Bruch_mit_Seriennummer aS = new Bruch_mit_Seriennummer();
        // Bruch_mit_Seriennummer bS = new Bruch_mit_Seriennummer(3,4);
        // Bruch_mit_Seriennummer cS = new Bruch_mit_Seriennummer(3);


        b.ausgeben();
        System.out.println("\n Und nach dem Kuerzen: ");
        b.gekuerztausgeben();


        b.erweitern(helferlein);
        System.out.println("\n Nach dem Erweitern mit: " + helferlein);
        b.ausgeben();

        // Multipizieren
        System.out.println("\n Multipliziere ");
        a.ausgeben();
        System.out.print(" mit ");
        b.ausgeben();
        System.out.print(" ergibt ");
        c = a.multipliziere(b);
        c.ausgeben();

        // Ueberladen einer Methode - Methoden unterscheiden sich im Parametersatz
        System.out.print("\n 1. Setzen-Methode des Bruchs  ");
        b.ausgeben();
        System.out.print(" mit Wert " + helferlein);
        System.out.print(" ergibt ");
        b.setze(helferlein);
        b.ausgeben();


        System.out.print("\n 2. Setzen-Methode des Bruchs  ");
        b.ausgeben();
        System.out.print(" mit Werten " + helferlein + " und " + 2 * helferlein);
        System.out.print(" ergibt ");
        b.setze(helferlein, 2 * helferlein);
        b.ausgeben();

        System.out.print("\n Der Bruch  ");
        a.kuerzen();
        a.ausgeben();
        System.out.print(" hat den Dezimalwert " + a.dezimalwert());

        System.out.print("\n Der Bruch  ");
        a.ausgeben();
        System.out.print(" hat das Vorzeichen " + a.signum());
        System.out.print("  (Legende: 1 = + , -1 = - , 0 = 0)  ");

        System.out.print("\n Bruch mit ueberschriebenem Default-Konstruktor ");
        d.ausgeben();


        a.setze(1,2);
        b.setze(2,3);
        System.out.print("\nVergleich der Brueche  ");
        a.ausgeben();
        System.out.print(" und ");
        b.ausgeben();
        System.out.print("\nDie Brueche sind ");
        if(a.equals(b)){
            System.out.print(" gleich ");
        }
        else{
            System.out.print(" ungleich ");
        }


        // Addieren
        System.out.print("\n Addiere ");
        a.ausgeben();
        System.out.print(" mit ");
        b.ausgeben();
        System.out.print(" ergibt ");
        c = a.plus(b);
        c.ausgeben();

        // Subtrahieren
        a.setze(3,4);
        b.setze(1,2);
        System.out.print("\n Subtrahiere ");
        a.ausgeben();
        System.out.print(" mit ");
        b.ausgeben();
        System.out.print(" ergibt ");
        c = a.minus(b);
        c.ausgeben();



/*
        // Bruch mit Seriennummer
        System.out.print("\n Seriennummer ");
        System.out.print(aS.seriennummer);
        System.out.print(", Wert des Bruchs ");
        aS.ausgeben();

        System.out.print("\n Seriennummer ");
        System.out.print(bS.seriennummer);
        System.out.print(", Wert des Bruchs ");
        bS.ausgeben();

        System.out.print("\n Seriennummer ");
        System.out.print(cS.seriennummer);
        System.out.print(", Wert des Bruchs ");
        cS.ausgeben();
*/

    }
}
