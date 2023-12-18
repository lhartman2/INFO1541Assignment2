import EmployeeObjects.HourlyEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    @Test
    public void testIncreaseHours_PositiveAndNegative() {
        emp.increaseHours(10); // Add 10 hours
        assertEquals(10, emp.getHoursWorked());

        emp.increaseHours(-5); // Try adding -5 hours
        assertEquals(10, emp.getHoursWorked()); // Hours worked should remain unchanged


}

    @Test
    public void testAnnualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.setPay(30.0); // Set the initial wage using setPay method
        emp.annualRaise();

        assertEquals(34.49, emp.getWage(), 0.01); // Check with an allowed deviation of 0.01
    }

    @Test
    public void testCalculateWeeklyPay() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        // Send 35 hours to the test employee
        emp.increaseHours(35);
        double weeklyPayFor35Hours = emp.calculateWeeklyPay();
        assertEquals(1149.75, weeklyPayFor35Hours, 0.01);

        // Add 10 more hours (total 45 hours)
        emp.increaseHours(10);
        double weeklyPayFor45Hours = emp.calculateWeeklyPay();
        assertEquals(1560.38, weeklyPayFor45Hours, 0.01);
    }


}