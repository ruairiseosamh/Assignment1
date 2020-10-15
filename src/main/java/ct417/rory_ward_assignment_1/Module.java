package ct417.rory_ward_assignment_1;

/**
 *
 * @author Rory Ward 17360073
 */

import java.util.*;

public class Module {
    private String name;                 // Name
    private long id;                     // ID
    private List<Student> students;      // students
    private List courses;                // courses
    
    // construct a new module with given fields
    public Module(String name, int age, String dob, long id, List students, List courses) {
        this.name   = name;
        this.id = id;
        this.students = students;
        this.courses = courses;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudents(List students) {
        this.students = students;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public List getStudents() {
        return students;
    }

    public List getCourses() {
        return courses;
    }
}
