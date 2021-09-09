package chapterTwo;

import java.util.Scanner;
public class TwoPointTwoFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("its an even number");
        } else{
            if (number % 2 != 0){
            System.out.println("its an odd number");
            }
        }

    }
}
