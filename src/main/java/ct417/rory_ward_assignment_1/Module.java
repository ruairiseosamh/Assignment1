package ct417.rory_ward_assignment_1;

/**
 *
 * @author Rory Ward 17360073
 */

import java.util.*;

public class Module {
    private String name;                 // Name
    private List<Student> students;      // students
    private List<Course> courses;        // courses
    
    // construct a new module with given fields
    public Module(String name) {
        this.name   = name;
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if(!this.students.contains(student)){
            this.students.add(student);
            student.addModule(this);
        }
    }

    public void addCourse(Course course) {
        if(!this.courses.contains(course)){
            this.courses.add(course);
            course.addModule(this);
            for(Student student : this.students){
                student.addCourse(course);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List getStudents() {
        return students;
    }

    public List getCourses() {
        return courses;
    }
}
