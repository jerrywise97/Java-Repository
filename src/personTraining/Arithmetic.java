package personTraining;
//java.util.Scanner;

public class Arithmetic {
//    private int number1;
//
//
//    public void setNumber1(int number1) {
//        this.number1 = number1;
//
//    }
//
//    public Object getNumber1() {
//        return number1;
//    }

//        printGrade(130.67);
//    }
//
//
//    public static void printGrade(double score) {
//        if (score < 0 || score > 100) {
//            System.out.println("Invalid score");
//            return;
//        }
//        if (score >= 90.0) {
//            System.out.println('A');
//        } else if (score >= 80.0) {
//            System.out.println('B');
//        } else if (score >= 70.0) {
//            System.out.println('C');
//        } else if (score >= 60.0) {
//            System.out.println('D');
//        } else {
//            System.out.println('F');
//        }
//    }


//
//    int times = 3;
//        System.out.println("before the call," + "varaibles times is "+ times);
//
//    weirdPrint("welcome jerry to method!!", times );
//        System.out.println("after the call," + "varaibles times is "+ times);
//
//
//
//
//}
//    private static void weirdPrint(String message, int n){
//        while (n > 0){
//            System.out.println("n = " + n) ;
//            System.out.println(message);
//            n--;
//        }
//
//    }


//    public static void main(String[] args) {
//        int number = 0;
//        while(number <= 4){
//            myMethod(number);
//            number++;
//        }
//        System.out.println("number is " + number);
//    }
//
//        private static void  myMethod(int number){
//            do {
//                if (number % 3 != 0)
//                    System.out.print(number + " ");
//                number--;
//            }
//            while(number >= 1);
//            System.out.println();
//        }

    public static void main(String[] args) {
        printPrintPrimeNumber(50);


    }
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number/2; divisor++){
            if(number % divisor  == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void printPrintPrimeNumber(int numberOfPrime){
        final int NUMBERS_OF_PRIMES = 10;
        int count = 0;
        int number = 2;
        while (count < numberOfPrime ) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBERS_OF_PRIMES == 0) {
                    System.out.printf("%-5s%n", number);
                } else {
                    System.out.printf("%-5s", number);
                }
            }
                number++;
            }

    }


}