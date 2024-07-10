package com.demo.mysqltwo.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "users")
@Data
public class UserTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String name;
    private String password;
}
