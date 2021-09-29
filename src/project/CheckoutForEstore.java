package project;

import com.sun.security.jgss.InquireSecContextPermission;
import project.Estore.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class CheckoutForEstore {
    private static String name;
    private static ArrayList<String> itemBought;
    private static ArrayList<Integer> quantityPurchase;
    private static  ArrayList<Double> costPerItem;
    private static ArrayList<Double> total;


    public static void main(String[] args) {
        itemBought = new ArrayList<>();
        costPerItem = new ArrayList<>();
        quantityPurchase = new ArrayList<>();
        total = new ArrayList<>();


        diplayWelcome();
        name = getCustomerName("what is your name: ");
        getCostPerItem();
        displayTables();
        displayItemInTheInvoice();

        endPurchase();

    }

    public static void diplayWelcome() {
        System.out.println("Welcome to Lunny store");
    }

    public static String getCustomerName(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public static void getCostPerItem() {
        Scanner input = new Scanner(System.in);
        String responce ="";
        do{
            System.out.println("What did you buy: ");
            String itemName = input.next();
            System.out.println("How much is the cost of the item: ");
            double pricePerItem = input.nextDouble();
            System.out.println("How many quantity did you purchase: ");
            int quantity = input.nextInt();
            System.out.println("Any other thing: ");
            responce = input.next();
            itemBought.add(itemName);
            costPerItem.add(pricePerItem);
            quantityPurchase.add(quantity);
            total.add(pricePerItem * quantity);
            System.out.print(itemBought);
            System.out.print(quantityPurchase);
            System.out.print(costPerItem);
            System.out.println(total);
            System.out.println();
        }while (!responce.equalsIgnoreCase("no"));
    }
    public static void displayTables(){
        System.out.println("_".repeat(90));
        String prompt= """
                                                Lunny's Stores
                                                 main Street3
                                              34250 Oga parkWell   
                                              Tel: +128 675 7843
                                              Tax No: 64386529708
                                             office@lunnystore.com
                                         
                   receipt No: 17-2334-347346.
                   Cashier: Luna Moon.
                """;
        System.out.println(prompt);
        System.out.println("\t " + getDateAndTime());
        System.out.println("\tCustomer name:" + name);
        System.out.println("=".repeat(90));
        String main = String.format("%30s%15s%15s%15s", "item    ","Quantity", "price", "total");
        System.out.println(main.repeat(1));
        System.out.println("_".repeat(90));
    }
    public static void displayItemInTheInvoice(){
        for (int i = 0; i < itemBought.size(); i++) {
//            System.out.println("\t" + itemBought.get(i));
            String main = String.format("%20s%20s%18s%18s", itemBought.get(i), quantityPurchase.get(i), costPerItem.get(i), total.get(i));
            System.out.println(main.repeat(1));

        }
        System.out.println("_".repeat(90));
        System.out.println();
        System.out.println("\t SubTotal\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calculateTotal());
        System.out.println("\t Discount\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calculateDiscount());
        System.out.println("\t VAT\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calculateVat());
        System.out.println("=".repeat(90));
        System.out.println("\t Total\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calculateAmountPayable());
//        System.out.println("\t Amount Paid\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + amountTender());
        System.out.println("\t Balance\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getBalance());
        System.out.println("=".repeat(90));



    }

    public static double calculateTotal(){
        double totals = 0;
        for (int i = 0; i < total.size(); i++) {
            totals += total.get(i);
        }
        return totals;
    }
    public static double calculateDiscount(){
        double discount = 0.08;
        double total = calculateTotal();
        discount *= total;
        return discount;
    }
    public static double calculateVat(){
        double VAT = 17.5/100;
        double total = calculateTotal();
        VAT *= total;
    return VAT;
    }
    public static double calculateAmountPayable(){
        double amountToPay = 0;
        amountToPay = (calculateTotal() - calculateDiscount()) + calculateVat();
    return amountToPay;
    }
    public static double amountTender(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount paid: ");
        double amountPaid = input.nextDouble();
        return amountPaid;
    }
    public static double getBalance(){
        double amountPaid = amountTender();
        double total = calculateAmountPayable();
        double balance = 0;
        if(amountPaid > total){
            balance = amountPaid - total;

//        }else{
//            if(amountPaid < total){
//
//            }
        }
        return balance;
    }
    public static void endPurchase(){
        String prompt = """
                                            Thank you for your patronage,
                                            We hope to see you next time.  
                """;
        System.out.println(prompt);
        System.out.println("=".repeat(90));
        System.out.println("=".repeat(90));
    }
    public static String getDateAndTime(){
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter myDateFmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDate.format(myDateFmt);
    return formattedDate;
    }




}
