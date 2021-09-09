package ChapterFive;

import java.util.Scanner;
public class BarChatPrinting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        for(int count = 1; count <= 5;count++){
            System.out.println("Enter a number:" + count + " ");
            number = input.nextInt();
            if (number <= 30) {
                for (int i = 1; i <= number; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }



    }

}
