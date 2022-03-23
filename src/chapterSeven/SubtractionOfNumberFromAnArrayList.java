package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SubtractionOfNumberFromAnArrayList {
    public static void main(String[] args) {
        int[] numbers = getNumbersEnter();


        System.out.println("the total number is " + calculateTotalOfNumber(numbers));
        System.out.println(Arrays.toString(calculateNumbersSubtractedInTheSetOfNumber(numbers)));
        System.out.println("the largestNumber is " + calculateLargestNumber(numbers));
        System.out.println("the smallest is " + calculateSmallestNumber(numbers));

    }

    public static int[] getNumbersEnter() {
        System.out.println("Enter number of length: ");
        Scanner scanner = new Scanner(System.in);
        int numberUserInput = scanner.nextInt();
        int[] number = new int[numberUserInput];

        for(int i = 0; i < number.length; i++) {
            System.out.println("enter number of your choice " + (1 + i) + ": ");
            number[i] = scanner.nextInt();
        }
        return number;
    }
    public static int calculateTotalOfNumber(int... number){
        int total = 0;
        for (int i = 0; i < number.length; i++){
            total += number[i];
        }
        return total;
    }
    public static int[] calculateNumbersSubtractedInTheSetOfNumber(int... number){
        int total = calculateTotalOfNumber(number);
        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; ){
            for (int values : number ){
                int totalNumber = total - values;
                numbers[i] = totalNumber;
                i++;
            }
        }
        return numbers;
    }
    public static int calculateLargestNumber(int... number){
       int[] numbers = calculateNumbersSubtractedInTheSetOfNumber(number);
        int largestNumber = numbers[0];
        for(int i = 0; i < number.length; i++) {
            if (largestNumber < numbers[i]) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }
    public static int calculateSmallestNumber(int... number){
        int[] numbers = calculateNumbersSubtractedInTheSetOfNumber(number);
        int smallestNumber = numbers[0];
        for(int i = 0; i < number.length; i++){
            if(smallestNumber > numbers[i]){
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }


}
