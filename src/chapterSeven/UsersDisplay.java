package ChapterSeven;

import java.util.Scanner;

public class UsersDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SevenSegmentDisplay screen = new SevenSegmentDisplay();
        System.out.println("Enter 8 digit number between 1 and 0: ");
        String inputCollector =input.nextLine();

        screen.validateUserInput(inputCollector);
       screen.display();

    }
}
