package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SalaryEmployeeTest {
    @Test
    public void calculateWeeklyPayTest() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781,
                "Sales", "Manager", 64325);
       double salary =  64325;
       double expectedPay = 1237.02;
       double calculatePay = emp.calculateWeeklyPay();
       assertEquals(expectedPay, calculatePay, 0.01);
    }

    @Test
    public void holidayBonusTest() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781,
                "Sales", "Manager", 64325);
        double salary = 64325;
        double bonus = 2164.54;
        double calcBonus = emp.holidayBonus();
        assertEquals(bonus, calcBonus, 0.01);
    }


}