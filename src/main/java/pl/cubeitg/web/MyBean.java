/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.cubeitg.web;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.cubeitg.dao.DocumentDao;
import pl.cubeitg.entity.Document;

import javax.annotation.PostConstruct;

/**
 *
 * @author Qubcio
 */
@Component("myBean")
public class MyBean implements Serializable {

    private DocumentDao documentDao;

    @Autowired
    public MyBean(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }

    @Getter @Setter
    private Document document;

    @PostConstruct
    private void init() {
        document = new Document();
    }

    public String addNewDocument() {
        documentDao.save(document);
        return "index";
    }

}
