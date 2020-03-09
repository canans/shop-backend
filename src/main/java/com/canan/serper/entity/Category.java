package com.canan.serper.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    private String categoryName;
}
