package personTraining;

public class HoloSquare {
    public static void main(String[] args) {
        int number= 5;
        int emptycells = number - 2;

        for (int numberOfRows = 1; numberOfRows <= number ; numberOfRows++) {
            System.out.print("* ");
            for (int numberOfColumn = 1; numberOfColumn <= emptycells; numberOfColumn++) {
                System.out.print("# ");
            }
            System.out.println();


        }


    }
}
