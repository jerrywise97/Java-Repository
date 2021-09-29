package project.Estore;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {

    private String ownerName;
    private static ArrayList<Item> items = new ArrayList<>();


    public static BigDecimal calcualteGrandTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for (Item item: items) {
            total.add(items);

        }
    }


    @Override
    public String toString() {
        return "Cart{" +
                "ownerName='" + ownerName + '\'' +
                '}';
    }

    public BigDecimal calculateVat(){

    }
}
