package personTraining;

import java.util.Scanner;

public class Calender {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year(e.g 2021)");
        int year = input.nextInt();

        System.out.println("Enter month as a number between 1 and 12");
        int month = input.nextInt();

        printMonth(year, month);


    }
    public static void printMonth(int month,int year){
        printMonthTitle(year, month);
        printprintmonthbodyBody(year, month);
    }
    public static void printMonthTitle(int month, int year){
        System.out.println("=".repeat(30));
        System.out.println("       " + getMonthName(month) + "    " + year);
        System.out.println("=".repeat(30));
        System.out.println("sun mon tue wed thur fri sat");
        System.out.println("=".repeat(30));
    }
    public static void printprintmonthbodyBody(int month, int year){
        int startDay = getStarDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i = 0;
        for(i  = 0; i < startDay; i++){
            System.out.print(" ");
        }
        for(i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);
            if((i + startDay) % 7 == 0){
                System.out.println();
                System.out.println("-".repeat(30));
            }
        }
        System.out.println();
    }
    public static String getMonthName(int month){
        String monthName = " ";
        switch (month){
            case 1: monthName = "january"; break;
            case 2: monthName = "feb"; break;
            case 3: monthName = "march"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "may"; break;
            case 6: monthName = "june"; break;
            case 7: monthName = "july"; break;
            case 8: monthName = "aug"; break;
            case 9: monthName = "sep"; break;
            case 10: monthName = "october"; break;
            case 11: monthName = "nov"; break;
            case 12: monthName = "dec";
        }
        return monthName;
    }
    public static int getStarDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800=3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;

    }

    public static int getTotalNumberOfDays(int year, int month){
        int total = 0;
        for(int i = 1800; i<year; i++){
            if(isLeapYear(i)){
                total +=366;
            }else{
                total += 365;
            }
        }
        for(int i = 1; i < month; i++){
            total += getNumberOfDaysInMonth(year, month);
        }
        return total;
    }
    public static int getNumberOfDaysInMonth(int year, int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        if(month == 4 || month == 6 || month ==9 || month ==11){
            return 30;
        }
        if(month == 2){
            return isLeapYear(year)?29:28;
        }
        return 0;

    }
    public static boolean isLeapYear(int year){
        return year%400 == 0 || (year % 4 == 0 && year %100 != 0);
    }

}
