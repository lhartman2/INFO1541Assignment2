package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    @Test
    void increaseHoursIsPositive() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(10);
        emp.increaseHours(-5);
        assertEquals(10, emp.getHoursWorked());
    }

    // this is a comments


}