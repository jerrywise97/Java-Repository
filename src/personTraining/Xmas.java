package personTraining;

import java.util.Scanner;
public class Xmas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days:");
        int days = input.nextInt();

        String song = " ";
        String daysOfChristmas = " ";
        String lyrics = " ";

       while ( days <= 12) {

            switch (days) {
                default:
                    System.out.println("Enter a valid day");
                case 12:
                    daysOfChristmas = "twelfth";
                    break;
                case 11:
                    daysOfChristmas = "eleventh";
                    break;
                case 10:
                    daysOfChristmas = "tenth";
                    break;
                case 9:
                    daysOfChristmas = "ninth";
                    break;
                case 8:
                    daysOfChristmas = "eight";
                    break;
                case 7:
                    daysOfChristmas = "seventh";
                    break;
                case 6:
                    daysOfChristmas = "sixth";
                    break;
                case 5:
                    daysOfChristmas = "fifth";
                    break;
                case 4:
                    daysOfChristmas = "fourth";
                    break;
                case 3:
                    daysOfChristmas = "third";
                    break;
                case 2:
                    daysOfChristmas = "second";
                    break;
                case 1:
                    daysOfChristmas = "first";
                }
                days++;
            }

            song = "on the" + " " + daysOfChristmas + "day of christmas, my true love said to me\n" + lyrics;
            //System.out.println(song);

            switch (days) {
                default:
                    System.out.println("Enter a valid day");

                case 12:
                    lyrics = "Twelve drummers drumming\n ";
                    song = song + lyrics;
                case 11:
                    lyrics = "Eleven pipers piping\n";
                    song = song + lyrics;
                case 10:
                    lyrics = "Ten lords a-leaping\n";
                    song = song + lyrics;
                case 9:
                    lyrics = "Nine ladies dancing\n";
                    song = song + lyrics;
                case 8:
                    lyrics = "Eight maids a-milking\n";
                    song = song + lyrics;
                case 7:
                    lyrics = "Seven swans a-swimming\n";
                    song = song + lyrics;
                case 6:
                    lyrics = "Six geese a-laying\n";
                    song = song + lyrics;
                case 5:
                    lyrics = "Five golden rings\n";
                    song = song + lyrics;
                case 4:
                    lyrics = "Four calling birds\n";
                    song = song + lyrics;
                case 3:
                    lyrics = "Three french hens\n";
                    song = song + lyrics;
                case 2:
                    lyrics = "Two turtle doves, and\n";
                    song = song + lyrics;
                case 1:
                    lyrics = "A partridge in a pear tree\n";
                    song = song + lyrics;



            //}
           // days++;
        }
        System.out.println(song);


    }
}
