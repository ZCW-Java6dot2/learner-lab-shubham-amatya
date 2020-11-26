package io.zipcoder.interfaces;

import java.util.List;

public class People extends Person{

    List<Person> personList;

    public People(long id, String name) {
        super(id, name);
    }


    public void add(Person person){
        personList.add(new Person(1 , null ));

    }

    public Person findById (long id){
        if(personList.contains(id)){
            return personList.get((int) id);
        }
        return  null;
    }





}
