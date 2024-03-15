// NAME: <Chelsie Byers>
// CLASS: Info 1541/Spring
// ASSIGNMENT: <Crbyers-Assignment 2>
// DATE: <3/20/2024/3/14/2024>
// RESOURCES: <I used the resource videos and lectures from this class and Professional Java for Web App book>
// https://www.freecodecamp.org/news/java-unit-testing/>
// https://java-programming.mooc.fi/part-6/3-introduction-to-testing>


//This program will allow a user to run tests on their code and ensure the methods are working as expected>

package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class HourlyEmployeeTest {

    //Testing the increase hours method to ensure it remains positive
    @Test
    public void increaseHoursPos () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        //increasing the employee hours
        emp.increaseHours(5);
        //returning the results and checking if it's positive
        assertEquals(5,emp.getHoursWorked(), 0.01);
    }
    //Test to ensure the increase in hours does not show negative
    @Test
    public void increaseHoursNeg () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        //increasing employees hours with a negative test number
        emp.increaseHours(-3);
        //returning the results to ensure it's positive
        assertEquals(0,emp.getHoursWorked(), 0.01);
    }

    //Test to increase employee's hours by 0
    @Test
    public void increaseHoursZero () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        //adding in 0 hours for the employee
        emp.increaseHours(0);
        //returning the results to ensure no negatives or discrepancies
        assertEquals(0,emp.getHoursWorked(), 0.01);
    }

    //Test to ensure the annual raise method is functioning as appropriate
    @Test
    public void annualRaiseTest() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        //establishing the initial wage
        double wage = 32.85;
        //adding in the wage with the raise
        double raiseWage = ((wage * .05) + wage);
        //returning the adjusted wage with the raise and ensuring it is as expected
        emp.annualRaise();
        assertEquals(raiseWage, emp.getWage(), 0.01);

    }

    //Test to calculate the weekly pay for an employee with 35 hours
    @Test
    public void calculateWeeklyPayTest35 () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        //establishing the initial wage
        double wage = (32.85);
        //establishing the expected pay
        double expectedPay = 1149.75;
        //adding in the employee's hours for the week
        emp.increaseHours(35);
        //calling the calculate pay method based off the 35 hours
        double calculatePay = emp.calculateWeeklyPay();
        //returning the results to the user
        assertEquals(expectedPay, calculatePay, 0.01);
    }
    //Test to calculate an employee's hours with overtime
    @Test
    public void calculateWeeklyPayTestOT () {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        //establishing the initial wage
        double wage = (32.85);
        //adding in the hours the employee worked
        double hoursWorked = 45;
        //calculating the pay for their regular hours and adding in the overtime for their additional hours
        double expectedPay = 40 * wage + (wage * 1.5 * (hoursWorked - 40));
        //increasing the employee's hours
        emp.increaseHours(hoursWorked);
        //calling on the calculate pay method
        double calculatePay = emp.calculateWeeklyPay();
        //returning the results to the user
        assertEquals(expectedPay, calculatePay, 0.01);
    }

}