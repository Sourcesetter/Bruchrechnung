package com.fraccalc;

public class Bruch_mit_Seriennummer extends Bruch {
    // Vorhalten der Seriennummer
    private static int nummerngenerator = 0;
    // Pro Objekt wird eine unveraenderliche Nummer angelegt
    final int seriennummer;

    // Methoden zur Initialisierung
    //
    Bruch_mit_Seriennummer(){
        // super ruft den Konstruktor der uebergeordneten Klasse auf
        super();
        nummerngenerator++;
        seriennummer = nummerngenerator;
    }
    Bruch_mit_Seriennummer(int nz, int nn){
        super(nz, nn);
        nummerngenerator++;
        seriennummer = nummerngenerator;
    }
    Bruch_mit_Seriennummer(int nz){
        super(nz);
        nummerngenerator++;
        seriennummer = nummerngenerator;
    }

    int getSeriennummer(){
        return(seriennummer);
    }
}
