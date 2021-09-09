//package chapterFour;
////intialize your variables
////prompt user to enter number
////the number entered save it
////ensure the number is 5 digit
////the number enter save it to enterNumber and ensure its five digit
////
//
//
//
//
//
//import java.util.Scanner;
//
//public class FourPointThirty {
//
//    public static void main(String[] arg) {
//        Scanner input = new Scanner(System.in);
//
//
//        int number;
//        int firstNumber = 0;
//        int secondNumber = 0;
//        int thirdNumber;
//        int fourthNumber = 0;
//        int fifthNumber = 0;
//        String numbers;
//
//
//
//        System.out.println("enter number and ensure its five digit:");
//        number = input.nextInt();
//
//
//        int numberToCheckWith = number;
//
//
//
//        if (number > 9999 && number <= 99999) {
//            System.out.println("enter a valid five digit number");
//        }
//            firstNumber = number % 10;
//            number = number / 10;
//            System.out.printf("%d %d%n", firstNumber, number);
//
//            secondNumber = number % 10;
//            number = number / 10;
//            System.out.printf("%d %d%n", secondNumber, number);
//
//            thirdNumber = number % 10;
//            number = number / 10;
//            System.out.printf("%d %d%n", thirdNumber, number);
//
//            fourthNumber = number % 10;
//            number = number / 10;
//            System.out.printf("%d %d%n", fourthNumber, number);
//
//            fifthNumber = number % 10;
//            number = number / 10;
//            System.out.printf("%d %d%n", fifthNumber, number);
//
//            numbers = (" " + fifthNumber + fourthNumber + thirdNumber + secondNumber +firstNumber);
//            System.out.println(numbers);
//
//            numberToCheckWith = (" " + numberToCheckWith);
//
//            if (numbers == numberToCheckWith){
//                System.out.println("this number is palindrome");
//            }else{
//                if (numbers != numberToCheckWith){
//                   System.out.println("this number is not a palidrome");
//                }
//            }
//
//
//           // if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
//             //   System.out.println("this is a palidrome");
//           // }else{
//           //     if(firstNumber != fifthNumber && secondNumber != fourthNumber){
//           //         System.out.println("this is not a palidrome");
//           //     }
//           // }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//       // while (number > 0) {
//
////             remainder = number % 10;
////             number /= 10;
//
//
//
//
//
//
//
//       // }
//
//
//    }
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
