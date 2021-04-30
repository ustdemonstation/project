package com.example.JwtActivity.Model;

import javax.persistence.*;

@Entity
@Table(name="user_Details")
public class DaoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String LastName;
    private String email;
    private int age;
    private String password;
    private long phoneNumber;

    public DaoUser() {
    }

    public DaoUser(long id, String firstName, String lastName, String email, int age, String password, long phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.age = age;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
