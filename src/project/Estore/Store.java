package project.Estore;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    private static ArrayList<Item> checkOutStore;

    public static void main(String[] args) {
//        Item item = new Item();
//        Cart customerName = new Cart("jerry");
        collectUserInput();
        ArrayList<Item> checkOutStore = new ArrayList<>();
//        System.out.println(checkOutStore);


    }
    public static void collectUserInput(){
        Scanner input = new Scanner(System.in);
        String responce ="";
        do{
            System.out.println("What did you buy: ");
            String itemName = input.next();
            System.out.println("How much is the cost of the item: ");
            int pricePerItem = input.nextInt();
            System.out.println("How many quantity did you purchase: ");
            int quantityPurchase = input.nextInt();
            System.out.println("Any other thing: ");
            responce = input.next();
            Item item = new Item(itemName, pricePerItem, quantityPurchase);
            checkOutStore.add(item);
        }while (!responce.equalsIgnoreCase("no"));
    }

    public static void setCheckOutStore(ArrayList<Item> checkOutStore) {
        Store.checkOutStore = checkOutStore;
    }
//    public static void
}
