package chapterThree;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date date;


    @BeforeEach
    void setUp() {
        date = new Date(7, 17,2021);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void monthCanBeCreated(){
        date.getMonth();
        assertEquals(7, date.getMonth());
        date.setMonth(5);
        assertEquals(5, date.getMonth());
        date.displayDate();
    }
    @Test
    public void dayCanBeCreated(){
        date.getDay();
        assertEquals(17, date.getDay());
        date.setday(5);
        assertEquals(5, date.getDay());
        date.displayDate();
    }
    @Test
    public void yearCanBeCreated(){
        date.getYear();
        assertEquals(2021, date.getYear());
        date.setyear(1998);
        assertEquals(1998, date.getYear());
        date.displayDate();
    }
    @Test
    public void diaplayDate(){
        date.displayDate();
    }

}

