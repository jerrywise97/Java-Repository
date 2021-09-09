package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television myTelevision;

    @BeforeEach
    void setUp() {
        myTelevision = new Television("Sony", 10, true, 0);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void checkForProductName(){
        assertEquals("Sony", myTelevision.getProductName());
        myTelevision.setProductName("lg");
        assertEquals("lg", myTelevision.getProductName());
    }
    @Test
    public void checkIfMyTelevisionIsON(){
        assertTrue(myTelevision.getIsOn());
        myTelevision.setIsOn(true);
        assertTrue(myTelevision.getIsOn());
    }
    @Test
    public void checkTheVolume(){
        assertEquals(10, myTelevision.getVolume());
        myTelevision.setVolume(45);
        assertEquals(45, myTelevision.getVolume());
    }
    @Test
    public void checkForIncreaseInVolume(){
        myTelevision.setIncreaseVolume();
        assertEquals(11, myTelevision.getVolume());
    }
    @Test
    public void checkForDecreaseInVolume(){
        myTelevision.setDecreaseVolume();
        assertSame(9, myTelevision.getVolume());
    }
    @Test
    public void checkForChanel(){
        assertEquals(0, myTelevision.getChannel());
        myTelevision.setChannel(23);
        assertEquals(23, myTelevision.getChannel());

    }
    @Test
    public void checkForIncreaseInChannel(){
        myTelevision.setIncreaseChannel();
        assertEquals(1,myTelevision.getChannel());
    }
    @Test
    public void checkForDecreaseInChannel(){
        myTelevision.setIncreaseChannel();
        myTelevision.setIncreaseChannel();
        myTelevision.setDecreaseChannel();
        myTelevision.setDecreaseChannel();
        myTelevision.setDecreaseChannel();
        assertEquals(0, myTelevision.getChannel());

    }






































}