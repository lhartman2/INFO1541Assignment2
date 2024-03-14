package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class HourlyEmployeeTest {
    @Test
    public void increaseHoursPos () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        emp.increaseHours(5);
        assertEquals(5,emp.getHoursWorked(), 0.01);
    }
    @Test
    public void increaseHoursNeg () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        emp.increaseHours(-3);
        assertEquals(0,emp.getHoursWorked(), 0.01);
    }
    @Test
    public void increaseHoursZero () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        emp.increaseHours(0);
        assertEquals(0,emp.getHoursWorked(), 0.01);
    }

    @Test
    public void annualRaiseTest() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        double wage = 32.85;
        double raiseWage = ((wage * .05) + wage);
        emp.annualRaise();
        assertEquals(raiseWage, emp.getWage(), 0.01);

    }
    @Test
    public void calculateWeekleyPayTest40 () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        double wage = (32.85);
        double expectedPay = 1149.75;
        emp.increaseHours(35);
        double calculatePay = emp.calculateWeeklyPay();
        assertEquals(expectedPay, calculatePay, 0.01);
    }
    @Test
    public void calculateWeekleyPayTestOT () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        double wage = (32.85);
        double hoursWorked = 45;
        double expectedPay = 40 * wage + (wage * 1.5 * (hoursWorked - 40));
        emp.increaseHours(hoursWorked);
        double calculatePay = emp.calculateWeeklyPay();
        assertEquals(expectedPay, calculatePay, 0.01);
    }

}