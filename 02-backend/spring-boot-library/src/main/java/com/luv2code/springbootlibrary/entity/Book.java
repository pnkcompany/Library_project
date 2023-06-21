package com.luv2code.springbootlibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "book")
@Data
public class Book {
    private Long id;
    private String title;
    private  String description;
    private  int copies;
    private  int copiesAvailable;
    private  String category;
    private String img;
}
