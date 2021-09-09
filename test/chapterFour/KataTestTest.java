package chapterFour;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class KataTestTest {

    @Test
    public void calculateFactoriaTest() {
        Kata kater = new Kata();
        int result = kater.calculateFactoria(5);
        assertEquals(120, result);
    }

//     public  static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int userInput = input.nextInt();
//
//        Kata kater = new Kata();
//        int result = kater.calculateFactoria(userInput);
//        System.out.println(result);
//     }


    @Test
    public void calculateCopiesOfUtmeRangingFromOneToFourTest() {
        Kata Utme = new Kata();

         int results = Utme.calculateNumberOfCopiesPurchased(2);

        assertEquals(1_500, Utme.calculateNumberOfCopiesPurchased(1));
        assertEquals(3_000, results);
        assertEquals(6_000, Utme.calculateNumberOfCopiesPurchased(4));


    }

    @Test
    public void calculateCopiesOfUtmeRangingFromFiveToNineTest() {
        Kata Utme = new Kata();
        int results = Utme.calculateNumberOfCopiesPurchased(9);
        assertEquals(7_000, Utme.calculateNumberOfCopiesPurchased(5));
        assertEquals(9_800, Utme.calculateNumberOfCopiesPurchased(7));
        assertEquals(12_600, results);




    }
    @Test
    public void calculateCopiesOfUtmeRangingFromTenToTwentyNineTest() {
        Kata Utme = new Kata();
        int results = Utme.calculateNumberOfCopiesPurchased(12);
        assertEquals(12_000, Utme.calculateNumberOfCopiesPurchased(10));
        assertEquals(14_400, results);
        assertEquals(34_800, Utme.calculateNumberOfCopiesPurchased(29));
    }
    @Test
    public void calculateCopiesOfUtmeRangingFromThirtyToFourtyNineTest() {
        Kata Utme = new Kata();
        int results = Utme.calculateNumberOfCopiesPurchased(40);
        assertEquals(33_000, Utme.calculateNumberOfCopiesPurchased(30));
        assertEquals(44_000, results);
        assertEquals(53_900, Utme.calculateNumberOfCopiesPurchased(49));
    }
    @Test
    public void calculateCopiesOfUtmeRangingFromFiftyToNinetyNineTest() {
        Kata Utme = new Kata();
        int results = Utme.calculateNumberOfCopiesPurchased(80);
        assertEquals(50_000, Utme.calculateNumberOfCopiesPurchased(50));
        assertEquals(80_000, results);
        assertEquals(99_000, Utme.calculateNumberOfCopiesPurchased(99));
    }
    @Test
    public void calculateCopiesOfUtmeRangingFromHundredToOneHundredNinetyNineTest() {
        Kata Utme = new Kata();
        int results = Utme.calculateNumberOfCopiesPurchased(180);
        assertEquals(89_100, Utme.calculateNumberOfCopiesPurchased(99));
        assertEquals(162_000, results);
        assertEquals(179_100, Utme.calculateNumberOfCopiesPurchased(199));
    }
    @Test
    public void calculateCopiesOfUtmeRangingFromTwohhundredAndAboveTest() {
        Kata Utme = new Kata();
        int results = Utme.calculateNumberOfCopiesPurchased(205);
        assertEquals(160_000,Utme.calculateNumberOfCopiesPurchased(200));
        assertEquals(164_000, results);
    }

    @Test
    public void testForDaysOfChristmasSong(){
        Kata christmasSong = new Kata();
        String daysOfChristmas = christmasSong.DayOfChristmas(9);
        assertEquals("ninth", daysOfChristmas);
    }
    @Test
    public void testForLyricsOfTheSong(){
        Kata christmasSong = new Kata();
        String lyricsOfTheDaysOfChristmas = christmasSong.lyrisForTheDayOfChristmas(6);
        assertEquals("""
                Six geese a-laying
                Five golden rings
                Four calling birds
                Three french hens
                Two turtle doves, and
                A partridge in a pear tree
                """, lyricsOfTheDaysOfChristmas);
    }


}