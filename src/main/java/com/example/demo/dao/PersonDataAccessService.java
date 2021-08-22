package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository("postgres")
public class PersonDataAccessService implements PersonDao{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "from db", "prezime1","mejl4"));
    }

    @Override
    public Person selectPersonById(UUID id) {
        return null;
    }

    @Override
    public boolean deletePersonById(UUID id) {
        return false;
    }

    @Override
    public boolean updatePersonById(UUID id, Person person) {
        return false;
    }
}
