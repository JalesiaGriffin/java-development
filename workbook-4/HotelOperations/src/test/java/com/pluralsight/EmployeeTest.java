package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void punchIn_StartTimeNotSet_StartTimeSetToGivenTime() {
        // arrange
        Employee employee = new Employee(1, "John Doe", "IT", 20);
        double expectedTime = 9.0;

        // act
        employee.punchIn(9.0);

        // assert
        double actualTime = employee.getStartTime();
        assertEquals(expectedTime, actualTime);
    }
    @Test
    public void punchOut_HoursNotSet_HoursWorkedSetCorrectly(){
        // arrange
        Employee employee = new Employee(1, "John Doe", "IT", 20);
        employee.punchIn(9.0);

        // act
        employee.punchOut(17.5);

        // assert
        assertEquals(8.5, employee.getHoursWorked());
    }
}