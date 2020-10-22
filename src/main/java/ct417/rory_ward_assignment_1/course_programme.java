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

    public void setModules(List modules) {
        this.modules = modules;
    }

    public List getStudents() {
        return students;
    }

    public void setStudents(List students) {
        this.students = students;
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
