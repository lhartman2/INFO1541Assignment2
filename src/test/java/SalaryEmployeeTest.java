import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import EmployeeObjects.SalaryEmployee;

public class SalaryEmployeeTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double weeklyPay = emp.calculateWeeklyPay();

        assertEquals(1237.02, weeklyPay, 0.01);
    }

    @Test
    public void testHolidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double bonus = emp.holidayBonus();

        assertEquals(2164.54, bonus, 0.01);
    }

    // Other test methods...
}
