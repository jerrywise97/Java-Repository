package chapterTwo;

import java.util.Scanner;
public class TwoPointTwoSix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int number1 = input.nextInt();
        System.out.println("Enter second number :");
        int number2 = input.nextInt();

        if (number1 % number2 == 0){
            System.out.printf("%d is a multiple of %d%n", number1, number2);
        }else{
            if(number1 % number2 != 0){
                System.out.printf("%d is not a multiple %d%n", number1, number2);
            }
        }


    }
}
