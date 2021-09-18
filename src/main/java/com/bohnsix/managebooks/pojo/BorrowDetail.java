package com.bohnsix.managebooks.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowDetail {
    private int borrowId;
    private String borrowName;
    private String userName;
    private Date borrowTime;
    private Date deadline;
    private Date returnTime;
}