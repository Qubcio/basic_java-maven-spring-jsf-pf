/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.cubeitg.web;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author Qubcio
 */
@Component("myBean")
public class MyBean implements Serializable {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @PostConstruct
    public void init() {
        title = "Mój bean!!!";
    }
}
