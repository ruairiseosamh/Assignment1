package ct417.rory_ward_assignment_1;

/**
 *
 * @author Rory Ward 17360073
 */

import java.util.*;
import org.joda.time.DateTime;

public class Course {
    private String name;      // Name
    private List modules;     // modules 
    private List students;    // courses
    private DateTime start;   // start date
    private DateTime end;     // end date

    // construct a new module with given fields
    public Course(String name,  DateTime start, DateTime end) {
        this.name   = name;
        this.start = start;
        this.end = end;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getModules() {
        return modules;
    }

    public void addModule(Module module) {
        if(!this.modules.contains(module)){
            this.modules.add(module);
            module.addCourse(this);
        }
    }

    public List getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if(!this.students.contains(student)){
            this.students.add(student);
            student.addCourse(this);
        }
    }

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }
}
