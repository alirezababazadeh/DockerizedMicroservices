package edu.sharif.simple;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "simples")
public class SimpleEntity {

    public SimpleEntity(String message) {
        this.message = message;
    }

    @Id
    private Long id;

    @Column(name = "message")
    private String message;
}
