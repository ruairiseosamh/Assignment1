package ct417.rory_ward_assignment_1;

/**
 *
 * @author Rory Ward 17360073
 */

import java.util.*;

public class Student {
    private String name;              // Name
    private int age;                  // Age
    private String dob;               // Date Of Birth
    private long id;                  // ID
    private List<String> courses;     // courses
    private List<String> modules;     // modules registered for
    
    // construct a new student with given fields
    public Student(String name, int age, String dob, long id, List courses, List modules) {
        this.name  = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.courses = courses;
        this.modules = modules;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public void setModules(List modules) {
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return this.name + this.age;
    }

    public List getCourses() {
        return courses;
    }

    public List getModules() {
        return modules;
    }
}
