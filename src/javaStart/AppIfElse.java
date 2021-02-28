package javaStart;

import java.util.Scanner;

public class AppIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Co chcesz zrobic");
        //String odpowiedz = scan.nextLine();

        int i = scan.nextInt();

        if (i == 1) {
            System.out.println("Pisuar wystarczy");
        }
        else if (i == 2) {
            System.out.println("Musicz isc do kabiny");
        }
        else if (i == 3) {
            System.out.println("Powinienes isc do lekarza");
        }
        else {
            System.out.println("Nie pozumiem o co Ci chodzi");
        }
    }
}
