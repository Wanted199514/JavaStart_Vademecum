package javaStart;

public class LoopBreak {
    public static void main(String[] args) {
        int i = 0;

        while (true) {
            System.out.println("Licznik" + i);
            i++;

            if (i == 1000) {
                break;
            }
        }
        System.out.println("Poza petla");
    }
}
