package POO.P111;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int day = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int month = scanner.nextInt() - 1;
        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();

        Calendar inputCalendar = Calendar.getInstance();
        inputCalendar.set(year, month, day);

        Calendar nowCalendar = Calendar.getInstance();

        System.out.println("La fecha ingresada es: " + inputCalendar.getTime());
        System.out.println("La fecha actual es: " + nowCalendar.getTime());
        System.out.println("La diferencia de años es: " + differenceYears(inputCalendar, nowCalendar));
    }

    private static int differenceYears(Calendar aCalendar, Calendar bCalendar) {
        return bCalendar.get(Calendar.YEAR) - aCalendar.get(Calendar.YEAR);
    }
}
