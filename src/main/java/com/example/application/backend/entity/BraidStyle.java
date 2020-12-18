package com.example.application.backend.entity;

import com.example.application.backend.Braid;

import javax.persistence.*;

@Entity
@Table(name="braid_style")
public class BraidStyle implements Braid {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;

    @Column(name="braid_name")
    private String braidName;

    @Column(name="braid_size")
    private Enum braidSize;


    @Override
    public int getStylePrice(BraidStyle braidStyle) {
        return 0;
    }
}
