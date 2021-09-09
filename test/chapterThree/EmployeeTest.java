package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee person1;
    Employee person2;

    @BeforeEach
    void setUp() {
        person1 = new Employee("gideon","udoh",540_900.34);
        person2 = new Employee("amad", "possy", 469_500.69);

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testOfFirstName(){
        assertEquals("gideon", person1.getFirstName());
        assertEquals("amad", person2.getFirstName());
        person1.setFirstName("demola");
        assertEquals("demola", person1.getFirstName());
        person2.setFirstName("john");
        assertEquals("john", person2.getFirstName());
    }
    @Test
    public void testOfLastName(){
        assertEquals("udoh", person1.getLastName());
        assertEquals("possy",person2.getLastName());
        person1.setLastName("mojo");
        assertEquals("mojo", person1.getLastName());
        person2.setLastName("isreal");
        assertEquals("isreal", person2.getLastName());
    }
    @Test
    public void testForMonthlySalary(){
        assertEquals(540_900.34, person1.getMonthlySalary());
        assertEquals(469_500.69, person2.getMonthlySalary());
        person1.setMonthlySalary(56_344.56);
        assertEquals(56_344.56, person1.getMonthlySalary());
        person2.setMonthlySalary(90_456.34);
        assertEquals(90_456.34, person2.getMonthlySalary());
    }
    @Test
    public void testForYearlySalary(){
        person1.getYearlySalary();
        assertEquals(6_490_804.08, person1.getYearlySalary());
        person2.getYearlySalary();
        assertEquals(5_634_008.28, person2.getYearlySalary());
    }
    @Test
    public void testForPercentageIncrease(){
        person1.getPercentageIncrease();
        assertEquals(649_080.408, person1.getPercentageIncrease());
        person2.getPercentageIncrease();
        assertEquals(563_400.8280000001, person2.getPercentageIncrease());
    }
    @Test
    public void testForPercentageIncreaseOnYearlySalary(){
        person1.getPercentageIncreaseOnYearlySalary();
        assertEquals(7_139_884.488, person1.getPercentageIncreaseOnYearlySalary());
        person2.getPercentageIncreaseOnYearlySalary();
        assertEquals(6_197_409.108, person2.getPercentageIncreaseOnYearlySalary());
    }
    @Test
    public void testToDisplayTheYearSalaryIncrease(){
        person1.DisplayTheYearSalaryIncrease();
        person2.DisplayTheYearSalaryIncrease();
    }

}