package chapterFour;

import java.sql.SQLOutput;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N\t10*N \t100*N\t 1000*N");
        for(int count =1; count<=5; count++){
            System.out.println(count + "    " + count*10 + "     " + count*100 + "       " + count*1000);

        }
    }
}
