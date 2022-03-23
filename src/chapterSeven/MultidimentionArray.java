package ChapterSeven;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class MultidimentionArray {
   // public static void main(String[] args) {
//        String[][] tictactoe = {{"X ", "0 ", "X "}, {"0 ", "X ", "0 ", "X"}, {"X ", "0 ", "X "}};
//        for (String[] rowArray : tictactoe) {
//            for (String columnString : rowArray) {
//                System.out.print(columnString + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//        System.out.print( tictactoe[0][0]);
//        System.out.print( tictactoe[0][1]);
//        System.out.println( tictactoe[0][2]);
//        System.out.print( tictactoe[1][0]);
//        System.out.print( tictactoe[1][1]);
//        System.out.println( tictactoe[1][2]);
//        System.out.print( tictactoe[2][0]);
//        System.out.print( tictactoe[2][1]);
//        System.out.println( tictactoe[2][2]);
//    }



    public static void main(String[] args){
//    double[] myList = new double[9];
//    for(int row = 0; row < myList.length; row++)
//        myList[row] = row;
//    System.out.println(myList[3] + myList[7]);
//    myList  = new double[]{4.5, 4.6, 7.5, 3.5, 6.3};
//        System.out.println(myList[3]);
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        System.out.println("Enter " + myList.length + " " + "values: ");
//        for (int row = 0; row < myList.length; row++){
//            myList[row] = input.nextDouble();
//            System.out.println(myList[3]);
//        }
//        System.out.println(myList.length);
//        double max = 0;
//        for (double value : myList) {
//            if (value > max) {
//                max = value;
//                System.out.println(max);
//            }
//        }
//        double temp = myList[0];
//        System.arraycopy(myList, 1, myList, 0, myList.length - 1);
//        myList[myList.length - 1] = temp;

//        int[][] array = new int[5][6];
//        int[] x = {1, 2};
//        array[0] = x;
//        System.out.println("array[0][1] is " + array[0][1]);

        int[][] matrix = new int[3][3];
        System.out.println("Enter " + matrix.length + " rows and " +  matrix[0].length + " columns: ");
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }





    }

}

//score + scores.get(3)