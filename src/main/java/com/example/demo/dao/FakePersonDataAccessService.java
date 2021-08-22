package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> DB= new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.getLast_name(), person.getEmail()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Person selectPersonById(UUID id) {
        for (Person person : DB) {
            if(person.getId()==id)
            {
                return person;
            }

        }
        return null;
    }

    @Override
    public boolean deletePersonById(UUID id) {
        Person personMaybe=selectPersonById(id);
        if(personMaybe==null){
            return false;
        }
        return DB.remove(personMaybe);
    }

    @Override
    public boolean updatePersonById(UUID id, Person person) {
        Person personMaybe=selectPersonById(id);
        if(personMaybe==null){
            return false;
        }
        DB.remove(personMaybe);
        return DB.add(person);
    }
}
