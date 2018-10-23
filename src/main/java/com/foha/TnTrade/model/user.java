package com.foha.TnTrade.model;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String last_name;
    private String mail;
    private String password;
    private long phone;
    private String photo;
    private String role;
    @OneToMany
    @JoinTable(name="user_item",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<item> items= new HashSet<>();

    public Set<item> getItems() {
        return items;
    }

    public void setItems(Set<item> items) {
        this.items = items;
    }

    public user() {
    }

    public user(String name, String last_name, String mail, String password, long phone, String photo, String role) {
        this.name = name;
        this.last_name = last_name;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.photo = photo;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}