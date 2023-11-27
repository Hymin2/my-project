package com.myproject.user.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id",
            unique = true,
            nullable = false,
            length = 20)
    private String userId;

    @Column(name = "password",
            nullable = false,
            length = 20)
    private String password;

    @Column(name = "created_time")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdTime;

    @OneToMany(mappedBy = "user")
    private List<Authority> authorities;
}
