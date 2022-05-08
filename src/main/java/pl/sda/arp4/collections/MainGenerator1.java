package pl.sda.arp4.collections;

import java.util.Random;

public class MainGenerator {
    public static void main(String[] args) {


        int[] tablica = new int[100];
        for (int i = 0; i < tablica.length; i++) {
            int liczba = new Random().nextInt(50) ;
            System.out.print(liczba + " ");
        }
    }
}
