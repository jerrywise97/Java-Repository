package personTraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {

    @Test
    public void airConditionerCanBeTurenedOn() {
        //given
        Airconditioner sony = new Airconditioner();
        //when
        sony.setOn(true);
        //check
        assertTrue(sony.getIsOn());

    }

    @Test
    public void airConditionerCanBeTurnedOff() {
        //given
        Airconditioner sony = new Airconditioner();
        //when
        sony.setOff(true);
        //check
        assertTrue(sony.getisoff());

    }


    @Test
    public void airConditionerCanIncrease() {
        //given
        Airconditioner sony = new Airconditioner();
        sony.setOn(true);
        //when
        sony.setTemperature(16);
        //sony.setTemperture(16);
        //check
        assertEquals(16, sony.getTemperature());
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();


        assertEquals(31, sony.getTemperature());

    }

    @Test
    public void airConditionalCanDecrease() {
        //given
        Airconditioner sony = new Airconditioner();
        sony.setOn(true);
        sony.setTemperature(16);
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        sony.increaseTemperatue();
        //when
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        //check
        assertEquals(24, sony.getTemperature());

    }

}
//    @Test
//    public void airConditionalCanFinishBeyondThirty(){
//        //given
//        Airconditioner sony = new Airconditioner();
//        sony.setOn(true);
//        sony.setTemperature(16);

//    }
//
//}