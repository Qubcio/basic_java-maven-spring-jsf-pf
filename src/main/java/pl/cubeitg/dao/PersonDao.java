package pl.cubeitg.dao;

import pl.cubeitg.entity.Person;

import java.util.List;

public interface PersonDao {
    Person get(Long id);
    void save(Person person);

    List<Person> getAll();
}
