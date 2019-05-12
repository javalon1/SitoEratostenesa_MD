package com.sda.algorytmy;


import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc zbioru (wieksza niz 2): ");
        int arrayLenght = scanner.nextInt();

        //Znalezc wszystkie liczby pierwsze ze zbioru < 2 - dlugoscZbioru > i wypelnic nimi tablice
        int[] liczbyPierwsze = new int[arrayLenght];
        liczbyPierwsze[0] = 2;
        int x = 3;
        for (int i = 1; i < arrayLenght; i++) {
            if (czyPierwsza(x) == true) {
                liczbyPierwsze[i] = x;
            }
            x++;
        }

        System.out.println(Arrays.toString(liczbyPierwsze));
    }



    //Metoda do sprawdzania czy liczba jest pierwsza
    public static boolean czyPierwsza(int a) {
        int dzielniki = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                dzielniki++;
            }
        } return dzielniki == 2;
    }
}
