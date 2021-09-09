package personTraining;

import java.util.Scanner;

public class DivideByZero {

     public static void main(String[] args) {
        int firstNumber = input("enter number");
        int secondNumber = input("enter number 2");
        try {
            System.out.printf("the quotient is %d", (firstNumber / secondNumber));
        }
        catch(ArithmeticException chibob){
            System.out.println("an error occur");
            System.out.println(chibob.getMessage());

        }
    }
    private static int input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();

    }

}
