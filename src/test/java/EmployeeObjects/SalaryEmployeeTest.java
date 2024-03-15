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
import org.junit.jupiter.api.Test;

public class SalaryEmployeeTest {

    //Test to calculate weekly pay of salaried employees
    @Test
    public void calculateWeeklyPayTest() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781,
                "Sales", "Manager", 64325);
        //establishing the initial salary
       double salary =  64325;
       //establishing the expected weekly pay
       double expectedPay = 1237.02;
       //calling on the calculate pay method to return the weekly pay
       double calculatePay = emp.calculateWeeklyPay();
       //returning the results to the user
       assertEquals(expectedPay, calculatePay, 0.01);
    }

    //Test to ensure the holiday bonus method works as expected
    @Test
    public void holidayBonusTest() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781,
                "Sales", "Manager", 64325);
        //establishing the initial salary
        double salary = 64325;
        //establishing the expected bonus
        double bonus = 2164.54;
        //calling on the holiday bonus method to calculate and return the results
        double calcBonus = emp.holidayBonus();
        //returning the results to the user
        assertEquals(bonus, calcBonus, 0.01);
    }


}