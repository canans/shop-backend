package com.canan.serper.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;

}
