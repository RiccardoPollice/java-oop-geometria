package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'altezza");
        int altezzaInserita = scanner.nextInt();

        System.out.println("Inserisci la base");
        int baseInserita = scanner.nextInt();
        Rettangolo myRectangle = new Rettangolo(altezzaInserita, baseInserita);

        System.out.println("l'area del rettangolo è : " + myRectangle.calcolaArea());
        System.out.println("il perimetro del rettangolo è : " + myRectangle.calcoloPerimetro());

    }
}
