package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestClassRoom {

@Test
    public void TestGetRoster(){
    ClassRoom classroom = new ClassRoom();
    ArrayList<Person> folks = new ArrayList<>(TechConnect.getStudentList().size()+ ZipCodeWilmington.getInstructorList().size());
    for(Instructor i: ZipCodeWilmington.getInstructorList()){
        folks.add(i);
    }
    for(Student s: TechConnect.getStudentList()){
        folks.add(s);
    }
    Assert.assertTrue(classroom.getRoster().values().containsAll(folks));
}


}
