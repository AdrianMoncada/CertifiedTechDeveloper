package com.example.storage.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
@ToString
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String dni;
    private String name;
    private String lastName;
}
