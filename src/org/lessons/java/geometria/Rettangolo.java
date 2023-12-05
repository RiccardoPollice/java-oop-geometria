package org.lessons.java.geometria;

public class Rettangolo {
    //Attributi
    int base;
    int altezza;

    //Costruttori
    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    //Metodi
    int calcolaArea(){
        return base * altezza;

    }

    int calcoloPerimetro(){
        return (base + altezza) * 2;
    }
}
