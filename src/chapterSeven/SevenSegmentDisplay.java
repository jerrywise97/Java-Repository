package ChapterSeven;

import java.util.Arrays;

public class SevenSegmentDisplay {


    private int[][] screen = new int[5][4];

    public void verifyInputCollector(String inputCollector){
        if(screen.length > 8){
            System.out.println("Re-enter your binary digit");

        }
    }


    public void validateUserInput(String inputCollector){
        for (int i = 0; i < inputCollector.length(); i++) {
            switch(i){
                case 0:
                    int a = Character.getNumericValue(inputCollector.charAt(i));
                    if(a == 1){
                        setScreenDisplayA();
                    }
                    break;
                case 1:
                    int b = Character.getNumericValue(inputCollector.charAt(i));
                    if(b== 1){
                        setScreenDisplayB();
                    }
                    break;
                case 2:
                    int c = Character.getNumericValue(inputCollector.charAt(i));
                    if(c == 1){
                        setScreenDisplayC();
                    }
                    break;
                case 3:
                    int d = Character.getNumericValue(inputCollector.charAt(i));
                    if(d == 1){
                        setScreenDisplayD();
                    }
                    break;
                case 4:
                    int e = Character.getNumericValue(inputCollector.charAt(i));
                    if(e == 1){
                        setScreenDisplayE();
                    }
                    break;
                case 5:
                    int f = Character.getNumericValue(inputCollector.charAt(i));
                    if(f == 1){
                        setScreenDisplayF();
                    }
                    break;
                case 6:
                    int g = Character.getNumericValue(inputCollector.charAt(i));
                    if(g == 1){
                        setScreenDisplayG();
                    }
                    break;
                case 7:
                    int h = Character.getNumericValue(inputCollector.charAt(i));
                    if(h == 0){
                        clearScreen();
                    }
                    break;

            }

        }
    }

//    public static int[][] SevenSegment(){
//        int[][] theScreen = {{1,1,1,1},{1,0,0,1},{1,1,1,1},{1,0,0,1},{1,1,1,1}};
//        return theScreen;
//    }
    private void setScreenDisplayA(){
        screen[0][0]=1;
        screen[0][1]=1;
        screen[0][2]=1;
        screen[0][3]=1;
    }
    private void setScreenDisplayB(){
        screen[0][3]=1;
        screen[1][3]=1;
        screen[2][3]=1;
    }
    private void setScreenDisplayC(){
        screen[2][3]=1;
        screen[3][3]=1;
        screen[4][3]=1;
    }
    private void setScreenDisplayD(){
        screen[4][0]=1;
        screen[4][1]=1;
        screen[4][2]=1;
        screen[4][3]=1;
    }
    private void setScreenDisplayE(){
        screen[2][0]=1;
        screen[3][0]=1;
        screen[4][0]=1;
    }
    private void setScreenDisplayF(){
        screen[0][0]=1;
        screen[1][0]=1;
        screen[2][0]=1;
    }
    private void setScreenDisplayG(){
        screen[2][0]=1;
        screen[2][1]=1;
        screen[2][2]=1;
        screen[2][3]=1;
    }
    public void clearScreen(){
        int[][] myClearScreen = screen;
        for (int i = 0; i < myClearScreen.length; i++) {
            for (int j = 0; j < myClearScreen[0].length; j++) {
                myClearScreen[i][j]=0;
            }

        }
    }

    public  void display() {
        int[][] screenDisplay = screen;
        for (int i = 0; i < screenDisplay.length; i++) {
            for (int j = 0; j < screenDisplay[0].length; j++) {
                if (screenDisplay[i][j] == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    @Override
    public String toString(){
        return Arrays.deepToString(screen);
    }
}





