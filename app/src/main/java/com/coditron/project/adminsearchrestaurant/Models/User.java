package com.coditron.project.adminsearchrestaurant.Models;

/**
 * Created by estacion on 01/07/15.
 */
public class User{
    private String code;
    private String id;
    private String name;
    private String lastName;
    private String direction;
    private String phone;
    private String sede;
    private String email;
    private String password;
    private int type;
    private int state;

    public User(String code,String id, String direction, String lastName, String name, String phone, String sede, String email, String password, int type, int state) {
        this.code = code;
        this.id= id;
        this.direction = direction;
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
        this.sede = sede;
        this.email = email;
        this.password = password;
        this.type = type;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
