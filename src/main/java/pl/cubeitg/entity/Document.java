package pl.cubeitg.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Document implements Serializable {

    @Id @GeneratedValue
    @Getter @Setter
    private Long id;

    @Override
    public String toString() {
        return "Document{" + "id=" + id + '}';
    }
}
