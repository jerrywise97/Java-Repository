package personTraining;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //int counter = 1;
        String prompt = """
                1. Create Account
                2. close Account
                3. borrow Nirsal laon
                4. japa wiht Nirsal loan
                press any key between 1 and 4
                """;





        // a for true is sometime not a bug

        System.out.println(prompt);

        int userResponse = Scanner.nextInt();




            switch (userResponse) {
                case 1:
                    System.out.println("enter a number between 1 to 4 to carry out the function");
                    int accountNumber = Scanner.nextInt();
                    switch (accountNumber){
                        case 1: System.out.println("invalid accountnumber");
                        break;
                        case 2: System.out.println("enter anotherNumber");
                        break;
                        case 3: System.out.println("oga gettout");
                        break;
                       // default: System.out.println("please visit the bank");
                    }

                    break;
                case 2:
                    System.out.println("account created");
                    break;
                case 4:
                    System.out.println("account close");
                    break;
                case 3:
                    System.out.println("japa with the money");
                    break;
                default:
                    System.out.println("get1 ssense");

            }




    }
}
