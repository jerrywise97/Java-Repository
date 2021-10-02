package CardVerrification;

import java.util.Scanner;

public class CreditCardVerification {
    private static long cardNumber;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter credit card number: ");
        cardNumber = input.nextLong();
        isValid(cardNumber);
        sumOfDoubleEvenPlace(cardNumber);

    }
    //verifying credit card
    public static void isValid(long cardNumber) {
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
    }
    public static int sumOfDoubleEvenPlace(long cardNumber){

        int total = 0;
        for (int i = 0; i < 16; i+=2) {
            total += cardNumber;
            System.out.println(total);
        }
        return total;
        }




}







