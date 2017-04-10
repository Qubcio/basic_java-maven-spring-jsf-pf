package pl.cubeitg.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Data
public class Document implements Serializable {

    @Id @GeneratedValue @Column
    private Long id;

}
