import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import EmployeeObjects.CommissionEmployee;

public class CommissionEmployeeTest {

    @Test
    public void testIncreaseSales() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        // Test adding positive and negative sales amounts
        emp.increaseSales(500); // Adding positive sales
        assertEquals(500, emp.getSales(), 0.01);

        emp.increaseSales(-200); // Adding negative sales
        assertEquals(500, emp.getSales(), 0.01); // Sales shouldn't change for negative values
    }

    @Test
    public void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        double bonus = emp.holidayBonus();

        assertEquals(0, bonus, 0.01);
    }

    @Test
    public void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        // Call annualRaise method twice
        emp.annualRaise();
        emp.annualRaise();

        assertEquals(0.0305, emp.getRate(), 0.0001);
    }

    // Other test methods...
}
