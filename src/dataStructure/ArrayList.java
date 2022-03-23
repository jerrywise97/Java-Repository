package DataStructure;

public class ArrayList implements List {
//    private boolean isEmpty = true;
    private int size;
//    private int element;
    private  int[] elements;

    public ArrayList(){
        elements = new int[3];
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int element) {
//        isEmpty = false;
        boolean isFull = getcapacity() == size;
        if(isFull){
            int[] newArray = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }//copy content pf the old into new
            elements = newArray;//swap old for new
        }
        elements[size++] = element;
//        size++;

    }

    @Override
    public void add(int element, int position){
        elements[position] = element;
    }

    @Override
    public void remove(int element) {
        if(isEmpty()) throw new IllegalArgumentException("Arraylist is empty");
        size--;
    }

    @Override
    public int size() {
        return size++;
    }

    @Override
    public int get(int position) {
        return elements[position];
    }

    @Override
    public int getIndexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == element) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public int getcapacity() {
        return elements.length;
    }

}
