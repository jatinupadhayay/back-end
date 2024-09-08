package com.postgresql.ecp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "passwords")
    private String Password;

    @Column(name = "email")
    private String email;
    private int dob;

    public Users(long user_id, String email, String password, String username) {
         this.user_id = user_id;
        this.email = email;
        Password = password;
        this.username = username;
        this.dob = dob;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }
}
