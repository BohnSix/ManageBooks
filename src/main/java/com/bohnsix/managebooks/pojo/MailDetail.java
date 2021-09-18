package com.bohnsix.managebooks.pojo;

import lombok.Data;

@Data
public class MailDetail {
    private String userName;
    private String email;
    private String borrowName;
    private String borrowTime;
}