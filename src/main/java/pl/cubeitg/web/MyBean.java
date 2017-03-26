package pl.cubeitg.web;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.cubeitg.core.DocumentService;
import pl.cubeitg.entity.Document;

import javax.annotation.PostConstruct;

/**
 *
 * @author Qubcio
 */
@Component("myBean")
public class MyBean implements Serializable {

    @Getter @Setter
    private Document document;

    private DocumentService documentService;

    @Autowired
    private void inject(DocumentService documentService) {
        this.documentService = documentService;
    }


    @PostConstruct
    private void init() {
        document = new Document();
    }

    public String goToInner() {
        return "inner";
    }

    public String goToIndex() {
        return "index";
    }

}
