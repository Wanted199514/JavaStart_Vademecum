package javaStart;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nam 2 liczby:");
        float first = scan.nextInt();
        float second = scan.nextInt();

        System.out.println("co chcecz probic?");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Koniec programu");

        float sum = first + second;
        System.out.println(first + "+" + second + "=" + sum);

        float minus = first - second;
        System.out.println(first + "-" + second + "=" + minus);

        float multiply = first * second;
        System.out.println(first + "*" + second + "=" + multiply);

        float division = first / second;
        System.out.println(first + "/" + second + "=" + division);

        System.out.println();
    }
}
