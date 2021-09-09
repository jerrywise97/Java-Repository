package chapterTwo;

import java.util.Scanner;
public class TwoPointOneSeven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one :");
        int number1 = input.nextInt();
        System.out.println("Enter number one :");
        int number2 = input.nextInt();
        System.out.println("Enter number three :");
        int number3 = input.nextInt();

        int sum = number1 + number3 + number2;
        System.out.printf("%d is the sum %n", sum);

        int average = sum/3;
        System.out.printf("%d is the average %n", average);

        int product = number1*number3*number2;
        System.out.printf("%d is the product %n", product);

        if (number1 < number2 && number1 < number3){
            System.out.printf("%d is the smallest %n" , number1);
        }
        if (number1> number2 && number1 > number3) {
            System.out.printf("%d is the largest %n", number1);
        }
        if (number2 > number1 && number2 >  number3){
            System.out.printf("%d is largest %n", number2);
        }
        if (number2 < number1 && number2 <  number3){
            System.out.printf("%d is smallest %n", number2);
        }
        if (number3 > number1 && number3 >  number2){
            System.out.printf("%d is largest %n", number3);
        }
        if (number3 < number1 && number3 <  number2){
            System.out.printf("%d is largest %n ", number3);
        }
    }

}
