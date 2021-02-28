package javaStart;

import java.util.Scanner;

public class AppDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sterowanie;
        do {
            System.out.println("Podaj liczbe");
            sterowanie = scan.nextInt();
        }
        while (sterowanie != 0);
    }
}
