package chapterTwo;


import java.util.Scanner;
public class TwoPointOnefive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one : ");
        int number1 = input.nextInt();
        System.out.println("Enter number two :");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.printf("sum is %d%n", sum);

        int product = number1 * number2;
        System.out.printf("product is %d%n", product);

        int differnce = number1 - number2;
        System.out.printf("difference is %d%n", differnce);

        int quotient = number1/number2;
        System.out.printf("quotient is %d%n", quotient);




    }
}
