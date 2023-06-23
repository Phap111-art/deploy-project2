package com.example.deployproject2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username" ,length = 50)
    private String username;
    @Column(name = "password",length = 250)
    private String password;

}
