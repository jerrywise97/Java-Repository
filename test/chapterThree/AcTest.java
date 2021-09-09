package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcTest {
    Ac splitUnit;

    @BeforeEach
    void setUp() {
        splitUnit = new Ac(false, 16);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void checkIfAcIsOn(){
        assertFalse(splitUnit.getIsOn());
        splitUnit.setIsOn(true);
        assertTrue(splitUnit.getIsOn());
    }
    @Test
    public void checkTemperature(){
        assertEquals(16, splitUnit.getTemperature());
    }
    @Test
    public void increaseTemperature(){
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();

        assertEquals(34, splitUnit.getTemperature());
    }
    @Test
    public void decreaseTemperature(){
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.increaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();
        splitUnit.decreaseTemperature();

        assertEquals(16, splitUnit.getTemperature());
    }

}