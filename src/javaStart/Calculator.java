package javaStart;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);//zdefiniowanie "zmiennej" typu Scanner i utworzenie jej;
        System.out.println("Napidz cos: ");
        String liczCal = pobierz.nextLine();//zdefiniowanie zmiennej i przypisanie jej wartosci pobranej z klawiatury
        System.out.println("Napisales: " + liczCal);

        System.out.println("Podaj libe calkowita: ");
        String jakakowiek = pobierz.nextLine();
        System.out.println("Napisales: " + jakakowiek);
    }
}
