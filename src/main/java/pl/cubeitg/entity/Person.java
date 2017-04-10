package pl.cubeitg.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by qubcio on 27.03.2017.
 */
@Entity @Table @Data
public class Person implements Serializable {

    @Id @GeneratedValue @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String login;

    @Column
    private String password;

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
