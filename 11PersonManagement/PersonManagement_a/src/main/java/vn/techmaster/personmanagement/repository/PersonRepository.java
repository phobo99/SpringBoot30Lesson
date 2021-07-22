package vn.techmaster.personmanagement.repository;

import org.springframework.stereotype.Repository;

import vn.techmaster.personmanagement.model.Person;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class PersonRepository {
    private List<Person> people = new ArrayList<>();



    public List<Person> getAll(){
        return this.people;
    }

    public Person create(Person person){
        int id;
        if (people.isEmpty()) {
            id = 1;
        } else {
            Person lastPerson = people.get(people.size() - 1);
            id = lastPerson.getId() + 1;
        }
        person.setId(id);
        people.add(person);
        return person;
    }

    public Person edit(Person person){
        get(person.getId()).ifPresent(existPerson->{
            existPerson.setName(person.getName());
            existPerson.setJob(person.getJob());
            existPerson.setGender(person.isGender());
            existPerson.setBirthDay(person.getBirthDay());
            if(person.getPhoto().getOriginalFilename().isEmpty())
                existPerson.setPhoto(person.getPhoto());
        });
        return person;
    }

    public void delete(Person person){
        deleteById(person.getId());
    }

    public Person search(String name){
        return people.stream().filter(person->person.getName().contains(name)).findAny().orElseThrow(null);
    }


    public Optional<Person> get(int id) {
        return people.stream().filter(p -> p.getId() == id).findFirst();
    }

    public void deleteById(int id) {
        get(id).ifPresent(existed -> people.remove(existed));
    }



}
