package com.company;

public class Alumne {
    private String name, surname;

    //Constructores
    public Alumne(String name, String surname){
        this.setName(name);
        this.setSurname(surname);
    }

    public Alumne(String surname){
        this(null,surname);
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return surname;
    }

    //Setters
    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

}
