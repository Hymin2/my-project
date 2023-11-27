package com.myproject.user.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "authority_table")
@Getter
public class Authority {
    public enum AuthorityName{
        USER, ADMIN;

        @Override
        public String toString() {
            return name();
        }
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
