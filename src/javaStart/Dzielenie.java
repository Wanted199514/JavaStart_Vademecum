package javaStart;

public class Dzielenie {
    public static void main(String[] args) {
        int cal1 = 5;
        int cal2 = 2;
        int dzielCal = cal1/cal2;
        double dzielPrzec = cal1/cal2;

        System.out.println("dzielCal = " + dzielCal);
        System.out.println("dzielPrzec = " + dzielPrzec);

        double db1 = 5.0;
        double db2 = 2.0;

        //int dzielCal2 = db1/db2;
        double dzielPrzec2 = db1/db2;

        //System.out.println("dzielCal2 = " + dzielCal2);
        System.out.println("dzielPrzec2 = " + dzielPrzec2);
    }
}
