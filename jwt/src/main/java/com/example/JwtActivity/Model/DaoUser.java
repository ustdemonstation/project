package com.example.JwtActivity.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "musicdetails",uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DaoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstname")
    @NotEmpty
    private String firstName;
    @Column(name = "lastName")
    @NotEmpty
    private String LastName;

    @Column(name = "email",unique = true)
    @NotEmpty
    @Email
    private String email;
    @Column(name = "age")
    @NotNull
    private int age;
    @Column(name = "password")
    @NotEmpty
    private String password;
    @Column(name = "phoneNumber")
    @com.sun.istack.NotNull
    private long phoneNumber;


}
