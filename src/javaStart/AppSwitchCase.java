package javaStart;

import java.util.Scanner;

public class AppSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj instrukcje: ");
        String instr = scan.nextLine();

        switch (instr) {
            case "tak":
                System.out.println("Powiedziales tak");
                break;
            case  "nie":
                System.out.println("Powiedziales nie");
                break;

            default:
                System.out.println("nie mam pojecia o co Ci chodzi");
        }
    }
}
