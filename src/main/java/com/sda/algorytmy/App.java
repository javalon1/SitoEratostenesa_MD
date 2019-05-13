package com.sda.algorytmy;


import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc zbioru (wieksza niz 2): ");
        int dlugoscZbioru = scanner.nextInt();
        while (dlugoscZbioru < 2) {
            System.out.println("Podales za mala liczbe, sproboj ponownie: ");
            dlugoscZbioru = scanner.nextInt();
        }
        boolean[] tablica = new boolean[dlugoscZbioru + 1];
        for (int i = 2; i < dlugoscZbioru + 1; i++) {
            tablica[i] = true;
        }


        for(int i = 2; i < dlugoscZbioru + 1; i++) {
            int wielokrotnosc = i + i;
            while (wielokrotnosc < dlugoscZbioru + 1){
                tablica[wielokrotnosc] = false;
                wielokrotnosc += i;
            }
        }

        System.out.println(Arrays.toString(tablica));










    }
}
