package personTraining;

import java.util.Arrays;
import java.util.Scanner;

public class DanielYang4 {
    private static final Scanner input = new Scanner(System.in);

    private static int numberOfStudent;
    private static int numberOfSubject;
    private static int[][] scores;

//
//    public static void main(String[] args) {
//        getScore();
//        displayTheArrayTable();
//        System.out.println("\nthe total score for all student: " + calculateTotal());
//        System.out.println(Arrays.toString(calculateScorePerStudent()));
//
//    }


    public static void getNumbersOfStudentAndSubject() {
        System.out.println("Enter numbers of Student" + " ");
        numberOfStudent = input.nextInt();
        System.out.println("Enter number of subject");
        numberOfSubject = input.nextInt();
        scores = new int[numberOfStudent][numberOfSubject];


    }

    public static void getScore() {
        getNumbersOfStudentAndSubject();
        for (int student = 0; student < numberOfStudent; student++) {
            System.out.println("ENTER SCORE FOR STUDENT" + " " + (student + 1) + ".");
            for (int subject = 0; subject < numberOfSubject; subject++) {
                System.out.print("subject" + (subject + 1) + ": ");
                scores[student][subject] = input.nextInt();
            }
            System.out.print(Arrays.deepToString(scores) + " ");
            System.out.println();
        }
    }
    public static int[] calculateScorePerStudent() {
        int[] studentTotal = new int[scores.length];
        int total = 0;
        for (int student = 0; student < scores.length; student++) {
            for (int subject = 0; subject < scores[student].length; subject++) {
                total += scores[student][subject];
                studentTotal[student] = total;
            }
            total = 0;
        }
        return studentTotal;

    }

    public static void displayTablesHeader() {
        System.out.println("\nthe summary of the student result: ");
        for (int subject = 0; subject < numberOfSubject; subject++) {
            System.out.print("\t  " + "Subject" + (subject + 1));
        }
        System.out.println("\t " + "Total");
    }
    public static void displayNumberOfStudent(){
        for (int student = 0; student < scores.length; student++) {
            System.out.print("\nstudent" + (student + 1) + " ");
        }
    }
//    public static void displayScoreForEachSubject() {
//
//        for (int subject = 0; subject < scores[student].length; subject++) {
//            System.out.print("\t " + scores[student][subject] + "\t\t  ");
//        }
//    }


//    public static void displayTheArrayTable(){
//        displayTablesHeader();
//        displayNumberOfStudent();
//        displayScoreForEachSubject();
//        }
////        for(int StudentTotal = 0; StudentTotal < scores.length; StudentTotal++){
////            System.out.println("\t" + );
////        }


    public static int calculateTotal() {
        int total = 0;
        for (int[] score : scores) {
            for (int totalScore : score) {
                total += totalScore;
            }
        }
        return total;
    }
//    public static int calculateScorePerStudent(){
//          int studentTotal = 0;
//        for(int subject = 0; subject<scores.length; subject++) {
//             studentTotal = 0;
//            for (int student = 0; student < scores[subject].length; student++) {
//                studentTotal += scores[student][subject];
//                scores[student][subject] += studentTotal;
//            }
//        }
    //  return studentTotal;


}