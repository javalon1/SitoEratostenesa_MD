package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc zbioru (wieksza niz 2): ");
        int dlugoscZbioru = scanner.nextInt();

        //Gdyby ktos podal mniejsza niz 2
        while (dlugoscZbioru <= 2) {
            System.out.println("Podales za mala liczbe, sproboj ponownie: ");
            dlugoscZbioru = scanner.nextInt();
        }

        boolean[] tablica = new boolean[dlugoscZbioru + 1];
        for (int i = 2; i < dlugoscZbioru + 1; i++) {
            tablica[i] = true;
        }

        for (int i = 2; i < dlugoscZbioru + 1; i++) {
            int wielokrotnosc = i + i;
            while (wielokrotnosc < dlugoscZbioru + 1) {
                tablica[wielokrotnosc] = false;
                wielokrotnosc += i;
            }
        }

        System.out.println("W podanym zbiorze liczby pierwsze (uzyskane metoda Erastotenesa) to: ");

        for (int i = 2; i < dlugoscZbioru + 1; i++) {
            if (tablica[i] == true) {
                System.out.print(i);
                System.out.print("  ");
            }
        }
    }
}
