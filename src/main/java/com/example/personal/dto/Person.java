package com.example.personal.dto;

public class Person {

    private String firstName;

    private String lastName;

    private String DOB;

    private String nationality;

    private String sex;

    private int id;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Person(int id,String firstName, String lastName, String dOB, String nationality, String sex) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        DOB = dOB;
        this.nationality = nationality;
        this.sex = sex;
        this.id=id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String dOB) {
        DOB = dOB;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}