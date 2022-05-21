package com.example.challenger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_challenger")
public class Challenger {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String text;

    public Challenger() { }

    public Challenger(String text) {
        this.text = text;
    }


    public Long getId() { return id; }

    public String getText() { return text; }


}
