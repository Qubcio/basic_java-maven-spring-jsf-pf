package pl.cubeitg.web;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.cubeitg.core.DocumentService;
import pl.cubeitg.core.PersonService;
import pl.cubeitg.entity.Document;
import pl.cubeitg.entity.Person;

import javax.annotation.PostConstruct;

/**
 *
 * @author Qubcio
 */
@Component("myBean")
@Scope("request")
public class MyBean implements Serializable {

    @Getter @Setter
    private Document document;

    @Getter @Setter
    private Person person;

    public List<Person> getPersonList() {
        return personService.getAll();
    }

    private List<Person> personList;

    private DocumentService documentService;
    private PersonService personService;

    @Autowired
    private void inject(DocumentService documentService, PersonService personService) {
        this.documentService = documentService;
        this.personService = personService;
    }

    @PostConstruct
    private void init() {
        document = new Document();
        person = new Person();
    }

    public String goToInner() {
        personService.save(person);
        return "inner";
    }

    public String goToIndex() {
        documentService.save(document);
        return "index";
    }

}
