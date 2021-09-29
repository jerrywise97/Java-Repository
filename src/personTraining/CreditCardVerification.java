package personTraining;

import java.util.Scanner;

public class CreditCardVerification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter credit card number: ");
        long cardNumber = input.nextLong();
        isValid(cardNumber);

    }
    //verifying credit card
    public static boolean isValid(long cardNumber) {
        if (cardNumber <= ((999_999_999L * 10_000_000) + 9_999_999) && cardNumber >= 1_000_000_000L * 1_000_000) {
            System.out.println("Credit card is valid");
        }
        else if (cardNumber <= ((999_999_999L * 1_000_000) + 999_999) && cardNumber >= 1_000_000_000L * 100_000) {
            System.out.println("Credit card is valid");
        }
        else if (cardNumber <= ((999_999_999L * 100_000) + 99_999) && cardNumber >= 1_000_000_000L * 10_000) {
            System.out.println("Credit card is valid");
        }
        else if (cardNumber <= ((999_999_999L * 10_000) + 9_999) && cardNumber >= 1_000_000_000L * 1_000) {
                System.out.println("Credit card is valid");
        }
        else {
            System.out.println("Credit card is not valid");
        }
        return true;
    }
//    public static int sumOfDoubleEvenPlace(long cardNumber){
//
//    }

}





