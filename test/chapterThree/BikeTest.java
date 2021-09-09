package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike powerBike;

    @BeforeEach
    void setUp() {
        powerBike = new Bike(true,0, 1);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void powerBikeCanBeTurnOn(){
        //check
        assertTrue(powerBike.getIfPowerBikeIsOn());
        //when
        powerBike.setPowerBikeIsOff(false);
        //check
        assertFalse(powerBike.getIfPowerBikeIsOn());

    }
    @Test
    public void powerBikeCanAccelerate(){
        assertEquals(0, powerBike.getPowerBiKeSpeedometer());
        powerBike.setPowerBikeSpeedometer(13);
        assertEquals(13, powerBike.getPowerBiKeSpeedometer());

    }
    @Test
    public void checkGear(){
        assertEquals(1, powerBike.getGear());
        //powerBike.setGear(1);
        //assertEquals(1, powerBike.getGear());
    }
    @Test
    public void checkSpeedIncreaseOnGearOne(){

        //powerBike.setGear(1);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        assertEquals(4, powerBike.getPowerBiKeSpeedometer());

    }
    @Test
    public void checkSpeedIncreaseOnGearTwo(){
        //powerBike.setGear(2);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();


        assertEquals(23, powerBike.getPowerBiKeSpeedometer());
        //assertEquals(2, powerBike.getGear());

    }
    @Test
    public void checkSpeedIncreaseOnGearThree() {
        //powerBike.setGear(3);
        powerBike.accelerate();
        assertEquals(1, powerBike.getGear());
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        //powerBike.accelerate();
        //powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        System.out.println(powerBike.getGear());
        System.out.println(powerBike.getPowerBiKeSpeedometer());
        powerBike.accelerate();
        System.out.println(powerBike.getGear());
        System.out.println(powerBike.getPowerBiKeSpeedometer());
        powerBike.accelerate();
        System.out.println(powerBike.getGear());
        System.out.println(powerBike.getPowerBiKeSpeedometer());
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();

        assertEquals(40, powerBike.getPowerBiKeSpeedometer());
        System.out.println(powerBike.getGear());
        System.out.println(powerBike.getPowerBiKeSpeedometer());
    }
    @Test
    public void checkSpeedIncreaseOnGearFour() {
        //powerBike.setGear(4);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();

        assertEquals(63, powerBike.getPowerBiKeSpeedometer());
    }

    @Test
    public void checkSpeedDecreaseOnGearFour(){
        //powerBike.setGear(4);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        assertEquals(51, powerBike.getPowerBiKeSpeedometer());

    }
    @Test
    public void checkSpeedDecreaseOnGearThree(){
        //powerBike.setGear(3);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        assertEquals(31, powerBike.getPowerBiKeSpeedometer());

    }
    @Test
    public void checkSpeedDecreaseOnGearTwo(){
        //powerBike.setGear(2);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.accelerate();
        powerBike.decelerate();
        assertEquals(23, powerBike.getPowerBiKeSpeedometer());

    }
    @Test
    public void checkSpeedDecreaseOnGearOne(){
        //powerBike.setGear(1);
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.accelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        powerBike.decelerate();
        assertEquals(13, powerBike.getPowerBiKeSpeedometer());

    }
    @Test
    public void checkGearCanBeOneIfSpeedIsAtRangeZeroAndTwenty(){
        powerBike.setPowerBikeSpeedometer(12);
    }



}