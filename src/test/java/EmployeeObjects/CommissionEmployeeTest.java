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

class CommissionEmployeeTest {

    //test method to ensure the sales method is increasing properly and not returning a negative number
    @Test
    public void increaseSalesTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847,
                "Sales", "Customer Representative", .0265);

        double initialSales = emp.getSales();

        //adding my negative and positive numbers
        emp.increaseSales(1000);
        emp.increaseSales(-500);

        //returning the results
        assertEquals(initialSales + 1000, emp.getSales());
    }

    //Test method to ensure commissioned employees do not get a bonus
    @Test
    public void holidayBonusTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847,
                "Sales", "Customer Representative", .0265);

        //calling on the holiday bonus method from the commission employee java file
        double bonus = emp.holidayBonus();

        //returning 0 from the method
        assertEquals(0, bonus);
    }

    //Test to ensure the annual raise method is accruing as expected
    @Test
    public void annualRaiseTest() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847,
                "Sales", "Customer Representative", .0265);

        //calling on the annual raise method from the commission employee java file
        emp.annualRaise();
        emp.annualRaise();

        //returning the adjusted raise
        assertEquals(0.0305, emp.getRate());
    }


}