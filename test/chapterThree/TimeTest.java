package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time time;

    @BeforeEach
    void setUp() {
        time = new Time(54, 30, 3);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void setTimeInSeconds(){
//        time.getSeconds();
        assertEquals(54,time.getSeconds());
        time.setSeconds(30);
        assertEquals(30, time.getSeconds());
    }
    @Test
    public void setTimeInMinute(){
//        time.getMinutes();
        assertEquals(30, time.getMinutes());
        time.setMinutes(34);
        assertEquals(34, time.getMinutes());
    }
    @Test
    public void setTimeInHour(){
//        time.getHours();
        assertEquals(3,time.getHours());
        time.setHours(6);
        assertEquals(6, time.getHours());
    }
    @Test
    public void displayTime(){
        time.displayTime();
    }
}