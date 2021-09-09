package chapterFour;
import java.lang.instrument.ClassDefinition;
import java.util.Scanner;

//initailized the variables,
//prompt the sales reps to enter the number of unit sold,
//






public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largestNumber = 0;
        int secondLargestNumber = 0;


        while (counter <= 10) {
            System.out.println("Enter number of unit sold :" + (counter) + " ");
            number = input.nextInt();
            if (number > largestNumber) {
//                secondLargestNumber = largestNumber;
                largestNumber = number;


//            } else if (number > secondLargestNumber ) {
//
//                    secondLargestNumber = number;
//
//            }

                counter += 1;
            }
            System.out.printf("the largest number is %d%n", largestNumber);
            //System.out.printf("the second largest number is %d%n", secondLargestNumber);

        }

    }

}




   // }

