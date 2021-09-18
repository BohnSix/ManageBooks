package com.bohnsix.managebooks.pojo;

import lombok.Data;

@Data
public class Book {
    private int bookID;
    private String ISBN;
    private String location;
    private int state;
    private int operator;

    public Book(int bookID, String ISBN, String location, int state, int operator) {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.location = location;
        this.state = state;
        this.operator = operator;
    }
}
