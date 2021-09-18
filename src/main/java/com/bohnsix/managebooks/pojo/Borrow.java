package com.bohnsix.managebooks.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Borrow {
    private int borrowID;
    private int bookID;
    private int userID;
    private Date borrowTime;
    private Date deadline;
    private Date returnTime;
    private int operator;
}
