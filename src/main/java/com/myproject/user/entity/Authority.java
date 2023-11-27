package com.myproject.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "authority_table")
public class Authority {
    enum AuthorityName{
        USER, ADMIN;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name",
            nullable = false)
    @Enumerated(EnumType.STRING)
    private AuthorityName authorityName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
