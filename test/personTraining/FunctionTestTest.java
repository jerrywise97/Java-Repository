package personTraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTestTest {
    @Test
    public void testFunction(){
        int result = Functions.addnumber(3,5);
        assertEquals(8,result);
    }



}