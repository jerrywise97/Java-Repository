package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List myArrayList;

    @BeforeEach
    public void startEachTestwith(){
        myArrayList = new ArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest(){
//        List myArrayList = new ArrayList();
        assertNotNull(myArrayList);
    }
    @Test
    public void newArrayListIsEptyTest(){
//        List myArrayList = new ArrayList();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addElement_ArrayListShouldNotBeEmpty(){
        //when
        myArrayList.add(34);
        //check
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void addXElementRemoveElementY_ArrayListShouldBeEmptyTest(){
        myArrayList.add(34);
        myArrayList.remove(34);
        //check
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addXandYAndRemoveY_ArrayShouldNotbeEmptyTest(){
        //when
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.remove(99);
        //check
        assertFalse(  myArrayList.isEmpty());
    }
    @Test
    public void removeFromEmptyArrayList_shouldThrowException(){
        assertThrows(IllegalArgumentException.class, ()-> myArrayList.remove(34));
    }
    @Test
    public void addElement_ArrayListSizeIsOne(){
        myArrayList.add(34);

        assertEquals(1, myArrayList.size());
    }
    @Test
    public void replaceElementInArrayList(){
        myArrayList.add(34);
        myArrayList.add(94, 0);

        assertEquals(94, myArrayList.get(0));
    }
    @Test
    public void addThreeElement_andReturnTheElementAtIndex2(){
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.add(45);

        assertEquals(99, myArrayList.get(1));
    }
    @Test
    public void getIndexOfElementTest(){
        myArrayList.add(34);
        myArrayList.add(37);
        myArrayList.add(78);
        assertEquals(2, myArrayList.getIndexOf(78));
    }
    @Test
    public void arraylistIsElastic(){
        assertEquals(3, myArrayList.getcapacity());
        myArrayList.add(78);
        myArrayList.add(72);
        myArrayList.add(73);
        myArrayList.add(65);
        myArrayList.add(45);
        assertEquals(6, myArrayList.getcapacity());
        assertEquals(5, myArrayList.size());
        myArrayList.add(45);
        myArrayList.add(45);
        myArrayList.add(45);
        myArrayList.add(45);
        assertEquals(12, myArrayList.getcapacity());
        assertEquals(10, myArrayList.size());


    }


}