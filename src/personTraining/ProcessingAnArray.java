package personTraining;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessingAnArray {
    public static void main(String[] args) {

        double[] myList = new double[10];
        String[] city = {"D", "A", "L", "L", "A", "S"};

//        printRandomNumberInAloop(myList);
//        summingOfAllElement(myList);
    //    randomShuffling(myList);
//        shiftingElementInArray(myList);
//        classWork();
//        classWorkSum();
            classWorkMinimuim();

    }
    public static void printNumbersInArray(double[] myList){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < myList.length; i++ ){
            System.out.println("Enter " + myList.length + " values: ");
            myList[i] = input.nextDouble();
            System.out.println(Arrays.toString(myList));
        }
    }
    public static void printRandomNumberInAloop(double[] myList){
        for(int i = 0; i < myList.length; i++){
            myList[i] = Math.random()*50;
            System.out.println(Arrays.toString(myList));
        }
    }
    public static void summingOfAllElement(double[] myList){
        double total = 0;
        for(int i = 0; i < myList.length; i++){
            total += myList[i];
            System.out.println(myList);
        }
    }
    public static void printingLargestNumber(double[] myList){
        double max = myList[0];
        for(int i = 0; i < myList.length; i++){

        }
    }
    public static void randomShuffling(double[] myList){
        for(int i = 0; i < myList.length - 1; i++){
            int j = (int)(Math.random() * myList.length);
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.println(myList[j]);
        }

    }
    public static void shiftingElementInArray(double[] myList){
        double temp = myList[0];
        for(int i = 1; i < myList.length; i++){
            myList[i-1] = myList[1];
        }
        myList[myList.length -1] = temp;
        System.out.println(Arrays.toString(myList));
    }
    public static void classWork(){
        int X =30;
        int [] numbers = new int[X];
        X = 60;
        System.out.println("X is " + X);
        System.out.println("the size of numbers " + numbers.length);
    }
    public static void classWork2(){
        double [] sex = {1,2,3,4,5,6,7,8,9,10};
        sex[9] = 5.5;
        double total = 0;
        total = sex[0] + sex[1];
        System.out.println(total);
        System.out.println(Arrays.toString(sex));
    }
    public static void classWorkSum(){
        double total = 0;
        double [] sex = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < sex.length; i++){
            total += sex[i];
        }
        System.out.println(total);
    }
    public static void classWorkMinimuim(){
        double [] sex = {6,2,3,4,5,1,7,8,9,10};
        double mininium = sex[0];
        for(int i = 0; i < sex.length; i++){
            if(sex[i] < mininium){
                mininium = sex[i];
            }
        }
        System.out.println(mininium);
    }

}
