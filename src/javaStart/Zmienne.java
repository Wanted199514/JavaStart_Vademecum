package javaStart;

public class Zmienne {
    public static void main(String[] args) {
        //Zmienne
        int calkowita; //deklaracja zmiennej typu calkowitego/integer

        calkowita = 12;
        System.out.println("calkowita = " + calkowita); //wypisanie na ekranie liczby calkowitej
        System.out.println("Hello World!"); //wypisanie ciagu znakow
        System.out.println("Lizba calkowita to: " + calkowita + " Nie jest to duza liczba");
        //konkatanacja stringow - czyli polczenie lancucha znakow z innymi typami

        short krotki = 6; //liczba calkowica 16 bit
        System.out.println("krotki = " + krotki); //wypisujemy nazma liczbe calkowica

        int skladnik, suma;
        skladnik = 30;
        suma = calkowita;
        System.out.println("suma1 = " + suma);
        suma = skladnik + calkowita; //odejmowanie
        System.out.println("suma2 = " + suma);

        int iloczyn = skladnik * calkowita;
        System.out.println("iloczyn = " + iloczyn);
        int odejmowanie = iloczyn - suma;
        System.out.println("odejmowanie = " + odejmowanie);

        int dzielenie = 10 / 3;
        System.out.println("dzielenie1 = " + dzielenie);

        double pi = 3.14;
        System.out.println("pi = " + pi);

        float zmiennoprzecinkowa = 3.1f; //krotsza wersja double, dodac sufix f za wartoscia zmiennej

        char znak = 'o';
        System.out.println("Double: " + pi);
        System.out.println("Float: " + zmiennoprzecinkowa);
        System.out.println("Char: " + znak);
    }
}
