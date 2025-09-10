package creational_pattern.prototype;

import creationl_pattern.prototype.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TestPrototype {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Test started.....");
    }

    @Test
    void testPrototype() {
       try {
           Employee employee = new Employee("Irfan",25,"SE");
           Employee copy = (Employee) employee.clone();

           // in here we're checking memory address
           // memery address are dif
           // but in copy reference point to the different Employee
           assertNotSame(employee,copy,"should not be same both");

       }catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test finished...");
    }
}
