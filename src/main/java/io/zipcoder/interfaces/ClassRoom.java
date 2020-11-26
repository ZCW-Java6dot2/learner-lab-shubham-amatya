package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {

    ArrayList<Student> students = TechConnect.getStudentList();
    ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructorList();
    HashMap<String, Person> studentTeacherRoster = new HashMap<>(students.size()+ instructors.size());

    public HashMap<String, Person> getRoster(){
        for(Student s: students){
            studentTeacherRoster.put(s.getName(), s);
        }
        for(Instructor i: instructors){
            studentTeacherRoster.put(i.getName(), i);
        }

        return studentTeacherRoster;

    }
}
