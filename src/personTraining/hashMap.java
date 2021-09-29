package personTraining;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Double> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("enter name: ");
            String name = in.next();
            System.out.println("ENTER QUANTITY: ");
            int quantity = in.nextInt();
            System.out.println("enter amount: ");
            Double amount = quantity * in.nextDouble();

            hmap.put(name, amount);
            System.out.println(hmap.put(name, amount));

            System.out.println(hmap.get(name));

        }
        System.out.println(hmap);
    }
}
