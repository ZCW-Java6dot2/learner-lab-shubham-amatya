package io.zipcoder.interfaces;

import java.util.List;

public class People extends Person{

    List<Person> personList;

    public People(long id, String name) {
        super(name);
    }


    public void add(Person person){
        personList.add(new Person( null ));

    }

    public Person findById (long id){
        if(personList.contains(id)){
            return personList.get((int) id);
        }
        return  null;
    }





}
