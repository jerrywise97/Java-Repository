package personTraining;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year(e.g 2021)");
        int year = input.nextInt();

        System.out.println("Enter month as a number between 1 and 12");
        int month = input.nextInt();

        printMonth(11,2011);

    }
    public static void printMonth(int month,int year){
        System.out.println(month + " " + year);
    }
    public static void printMonthTitle(int month, int year){
    }
    public static void printMonthBody(int month, int year){
    }
}
