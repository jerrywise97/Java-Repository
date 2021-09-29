package personTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class IngridentArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfIngredient = s.nextInt();
        ArrayList<String> ingredientArraylist = new ArrayList<String>();
        for (int i = 0; i < numberOfIngredient; i++) {
            String ingredientName = s.next();
//            double pricePerOne = s.nextDouble();
//            boolean isVeg = s.nextBoolean();
//            int numOfCalories = s.nextInt();

            ingredientArraylist.add(ingredientName);

        }
    }
}
