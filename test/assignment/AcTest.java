//package assignment;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AcTest {
//    @Test
//    public void acCanBeOn() {
//        //given
//        Ac myAc = new Ac();
//        //when
//        myAc.iTurnItOn("it is on");
//        //check
//        assertEquals("it is on", myAc.getifItsOn());
//    }
//
//    //@Test
//    public void acCanGoOff() {
//        //given
//        Ac myAc = new Ac();
//        //when
//        myAc.iTurnItOn("it is on");
//        myAc.iTurnItOff("it is of");
//        //check
//        assertEquals("it is of", myAc.getifItsOff());
//    }
//
//    @Test
//    public void acCanIncrease() {
//        //given
//        Ac myAc = new Ac();
//        //when
//        myAc.iTurnItOn("it is on");
//        myAc.acTemperatureincrease(1);
//        //myAc.acTemperatureincrease(1);
//        //check
//        assertEquals(17, myAc.gettemperature());
//    }
//
//    @Test
//    public void acCanDecrease() {
//        //GIVEN
//        Ac myAc = new Ac();
//        //when
//        myAc.iTurnItOn("it is on");
//        myAc.acTemperatureincrease(1);
//        //myAc.acTemperatureincrease(1);
//        myAc.acTemperaturedecrease(1);
//        //check
//        assertEquals(16, myAc.gettemperature());
//    }
//
//    @Test
//    public void acCanReachMaximuim() {
//        //given
//        Ac myAc = new Ac();
//        myAc.iTurnItOn("it is on");
//        //when
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        myAc.acTemperatureincrease(1);
//        //myAc.acTemperatureincrease(1);
//        //check
//        assertEquals(30, myAc.gettemperature());
//
//
//    }
//
//    @Test
//    public void acCannotGoBeyoundMinimium(){
//        //given
//        Ac myAc = new Ac();
//        myAc.iTurnItOn("it is on");
//        //when
//        //
//        // myAc.acTemperaturedecrease(1);
//        //check
//        assertEquals(16, myAc.gettemperature());
//
//
//    }
//
//
//
//
//}