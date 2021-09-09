package chapterFour;

public class Kata {


    public int calculateFactoria(int i) {
        int number = i;
        int result = 1;
        while (number != 0) {
            ;
            result = result * number;
            number--;

        }
        return result;
    }

    public int calculateNumberOfCopiesPurchased(int numberOfUtmePastQuestionPurchased) {
        int numberOfCopies = numberOfUtmePastQuestionPurchased;
        int results = 0;

        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            results = numberOfCopies * 1_500;
        }
        if (numberOfCopies >= 5 && numberOfCopies <= 9) {
            results = numberOfCopies * 1_400;
        }
        if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            results = numberOfCopies * 1_200;
        }
        if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            results = numberOfCopies * 1_100;
        }
        if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            results = numberOfCopies * 1_000;
        }
        if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            results = numberOfCopies * 900;
        }
        if (numberOfCopies >= 200) {
            results = numberOfCopies * 800;
        }
        return results;
    }

    String daysOfChristmas = "";
    String lyrics = "";
    String song = "On the " + daysOfChristmas + " day of Christmas";

    public String DayOfChristmas(int days) {
        switch (days) {
            case 12 -> daysOfChristmas = "twelfth";
            case 11 -> daysOfChristmas = "eleventh";
            case 10 -> daysOfChristmas = "tenth";
            case 9 -> daysOfChristmas = "ninth";
            case 8 -> daysOfChristmas = "eight";
            case 7 -> daysOfChristmas = "seventh";
            case 6 -> daysOfChristmas = "sixth";
            case 5 -> daysOfChristmas = "fifth";
            case 4 -> daysOfChristmas = "fourth";
            case 3 -> daysOfChristmas = "third";
            case 2 -> daysOfChristmas = "second";
            case 1 -> daysOfChristmas = "first";
        }
        return daysOfChristmas;

    }

    public String lyrisForTheDayOfChristmas(int days) {
        switch (days) {
            case 12:
                lyrics += "Twelve drummers drumming\n ";
            case 11:
                lyrics += "Eleven pipers piping\n";
            case 10:
                lyrics += "Ten lords a-leaping\n";
            case 9:
                lyrics += "Nine ladies dancing\n";
            case 8:
                lyrics += "Eight maids a-milking\n";
            case 7:
                lyrics += "Seven swans a-swimming\n";
            case 6:
                lyrics += "Six geese a-laying\n";
            case 5:
                lyrics += "Five golden rings\n";
            case 4:
                lyrics += "Four calling birds\n";
            case 3:
                lyrics += "Three french hens\n";
            case 2:
                lyrics += "Two turtle doves, and\n";
            case 1:
                lyrics += "A partridge in a pear tree\n";

        }
        return lyrics;
    }
}