package pl.cubeitg.core;

import pl.cubeitg.entity.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);
    Person get(Long id);

    List<Person> getAll();
}
