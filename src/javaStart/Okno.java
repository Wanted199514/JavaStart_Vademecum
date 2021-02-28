package javaStart;

import java.util.Scanner;

public class Okno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Year when you was born?");
        int birthYear = scan.nextInt();
        System.out.println("You born in " + birthYear + " year.");

        System.out.println("Year today?");
        int yearToday = scan.nextInt();
        System.out.println("Today is " + yearToday + " year.");

        int yourAge = yearToday - birthYear;
        System.out.println("Your age is " + yourAge + ".");

        int pensionAge = 65 - yourAge;
        int pensionYear = yearToday + pensionAge;
        System.out.println("You will retire in " + pensionYear + " year. Until retirement left " + pensionAge + " years.");
    }
}
