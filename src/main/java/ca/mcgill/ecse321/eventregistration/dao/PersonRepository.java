package ca.mcgill.ecse321.eventregistration.dao;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    
    Person findPersonByName {} //framework will fill this since method name is according to namescheme
}
