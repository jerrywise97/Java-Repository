package personTraining;

import java.util.Scanner;
public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCOount = 0;
        int dCount = 0;
        int fCount  = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer in the range 0-100.",
                "Type the end-of-line indicator to terminate input:",
                "On UNix/LINUX/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter");

        while (input.hasNext()){
            int grade = input.nextInt();
            total +=grade;
            ++gradeCounter;

            switch (grade / 10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCOount;
                    break;
                case 6:
                    ++dCount;
                default:
                    ++fCount;
                    break;
            }
        }
        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0) {
            double avarage = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("class avarage is %.2f%n", avarage);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of student who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCOount,
                    "D: ", dCount,
                    "F: ", fCount);
        }
        else
            System.out.println("No grade where entered");




    }
}
