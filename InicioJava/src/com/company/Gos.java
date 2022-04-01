package com.company;

public class Gos {
    private String raza, nombre;
    private Integer edad;

    //Constructores
    public Gos(String nombre, String raza, Integer edad){
        this.setNombre(nombre);
        this.setRaza(raza);
        this.setEdad(edad);
    }

    //Getters
    public Integer getEdad() {
        return this.edad;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    //Setters
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
