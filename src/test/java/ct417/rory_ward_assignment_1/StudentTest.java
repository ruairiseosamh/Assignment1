/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.rory_ward_assignment_1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ruair
 */
public class StudentTest {
    
    public StudentTest() {
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetUsername() {
        //System.out.println("getUsername");
        List<String> courses = new ArrayList<>();
        List<String> modules = new ArrayList<>();
        
        courses.add("CT4001");
        courses.add("EE345");
        
        modules.add("Software Engineering");
        modules.add("Machine Learning");
        Student student = new Student("Rory", 21, "1/1/1998", 17360073); 
        String expResult = "Rory21";
        String result = student.getUsername();
        assertEquals(expResult, result);
    }
}
