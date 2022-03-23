package ChapterSeven;

import java.util.Scanner;
public class CalculationOfNumbersUsingArray {

    public static int calculateMinimiumNumber(int[] score) {
        int minimiumNumber = score[0];
        for (int i = 0; i < score.length; i++) {
            if (minimiumNumber > score[i]) {
                minimiumNumber = score[i];
            }
        }
        return minimiumNumber;
    }

    public static int calculatemaximiumNumber(int[] score) {
        int maximiumNumber = score[0];
        for (int i = 0; i < score.length; i++) {
            if (maximiumNumber < score[i]) {
                maximiumNumber = score[i];
            }
        }
        return maximiumNumber;
    }
    public static int calculateTotalNumber(int[] score) {
        int totalNumber = 0;
        for (int i = 0; i < score.length; i++) {
            totalNumber += score[i];
        }
        return totalNumber;
    }
    public static double calculateAverageNumber(int[] score){
       int totalNumber = calculateTotalNumber(score);
       return totalNumber / score.length;

    }
    public static int addAll(double firstNumber, int... score){
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        return total;
    }



    public static void main(String[] args){
        System.out.println("Enter the amount of number you will like: ");
        Scanner input = new Scanner(System.in);
        int numberOfGrades = input.nextInt();
        int[] grades = new int[numberOfGrades];

        for(int i = 0; i < grades.length; i++) {
            System.out.println("enter number of grades: " + (1 + i));
            grades[i] = input.nextInt();
        }
        System.out.println("the minmium number is " + calculateMinimiumNumber(grades));
        System.out.println("the maximium number is " + calculatemaximiumNumber(grades));
        System.out.println("the avearge number is " + calculateAverageNumber(grades));
        System.out.println("the total number is " + calculateTotalNumber(grades));

    }



}













//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] numberCollected = new int[4];
//
//        int maximium = numberCollected[3];
//        int minimium = numberCollected[3];
//        int sum = 0;
//        int average = 0;
//
//        for (int i = 0; i < 4; i++) {
//
//
//            System.out.print("Enter number collected" + " " + i + ": ");
//            numberCollected[i] = input.nextInt();
//            sum += numberCollected[i];
//            average = sum / numberCollected[i];
//
//            if (maximium < numberCollected[i]) {
//                maximium = numberCollected[i];
//            }else {
//                if (minimium > numberCollected[i]) {
//                    minimium = numberCollected[i];
//                }
//            }
//        }
//        System.out.println("the sum of all value is " + sum);
//        System.out.println("the average of all value is " + average);
//        System.out.println("my maximium number is " + maximium);
//        System.out.println("my minimium number is " + minimium);
//
//    }