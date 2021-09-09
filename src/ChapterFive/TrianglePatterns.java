package ChapterFive;

import java.util.Scanner;
public class TrianglePatterns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int numberOfRows = input.nextInt();

        for (int count = 1; count <= numberOfRows; count++) {

            for (int i = 1; i <= count; i++) {
                System.out.print("*");
            }
            for (int j = count; j<=numberOfRows; j++) {
                System.out.print(" ");
            }
            for (int j = count; j<=numberOfRows; j++) {
                System.out.print("*");
            }
            for (int i = 1; i <= count; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= count; i++) {
                System.out.print(" ");
            }
            for (int j = count; j<=numberOfRows; j++) {
                System.out.print("*");
            }
            for (int j = count; j<=numberOfRows; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= count; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }


}


