package com.greenfoxacademy.szkenner;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

        System.out.println("Adjon meg egy számot:");
        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        double convert = Double.parseDouble(userInput);
        System.out.println(convert * 1.6 + " km");
    }
}