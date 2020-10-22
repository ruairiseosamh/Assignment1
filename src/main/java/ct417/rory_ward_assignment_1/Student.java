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
    private List<Course> courses;     // courses
    private List<Module> modules;     // modules registered for
    
    // construct a new student with given fields
    public Student(String name, int age, String dob, long id) {
        this.name  = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.courses = new ArrayList<>();
        this.modules = new ArrayList<>();
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

    public void addCourse(Course course) {
        if(!this.courses.contains(course)){
            this.courses.add(course);
            course.addStudent(this);
        }
    }

    public void addModule(Module module) {
        if(!this.modules.contains(module)){
            this.modules.add(module);
            module.addStudent(this);
        }  
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
