package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;
import lombok.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "adlister_ads")
public class Ad {

    private long id;
    private String title;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ad() {
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @Column(nullable = false, length = 256)
//    private String title;
//    @Column(nullable = false, length = 1024)
//    private String description;
    public Ad(String title, String description) {
        this.title = title;
        this.description = description;
    }
}

