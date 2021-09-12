package com.shopping.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UserID")
    private Long id;

    @Column(name="UserName")
    private String name;

    @Email(message = "Please enter a valid email")
    @NotEmpty(message = "Please enter your email")
    @Column(name="Email")
    private String email;

    @Length(min = 8, message = "Your password must have at least 8 characters")
    @NotEmpty(message = "Please enter your password")
    @Column(name="Password")
    private String pw;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
