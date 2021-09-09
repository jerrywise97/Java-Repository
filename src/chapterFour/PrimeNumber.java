package chapterFour;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 2;
        boolean checkNumber = true;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        while (counter <= number/2) {
            if (number % counter == 0)
                checkNumber = false;
                counter++;



        }
            // System.out.println(" " + counter);
            if (checkNumber ) {
                System.out.println("this is a prime number");
            } else {

                    System.out.println("this is not a prime number");

                }


    }

}