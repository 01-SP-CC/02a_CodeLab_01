package com.cc.java;

public class App {

    public static void main(String[] args) {
        // Erzeugung von 3 Konto-Instanzen
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        // Ausgabe der Anfangskontostände
        output("Anfangskontostand konto1: " + konto1.getKontostand());
        output("Anfangskontostand konto2: " + konto2.getKontostand());
        output("Anfangskontostand konto3: " + konto3.getKontostand());

        // Änderung der Kontostände
        konto1.verdoppeln();
        konto2.verdreifachen();
        konto3.verzehnfachen();

        // Ausgabe der aktuellen Kontostände
        output("Aktueller Kontostand konto1: " + konto1.getKontostand());
        output("Aktueller Kontostand konto2: " + konto2.getKontostand());
        output("Aktueller Kontostand konto3: " + konto3.getKontostand());
    }


        public static void output(String outputStr) {
            System.out.println(outputStr);
        }
    

}

