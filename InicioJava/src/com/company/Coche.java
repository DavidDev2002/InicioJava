package com.company;

import java.text.DecimalFormat;

public class Coche {
    private String marca, color;
    private float precio;

    //Constructores
    public Coche(String marca, String color, float precio){
        this.setMarca(marca);
        this.setColor(color);
        this.setPrecio(precio);
    }

    //Getters
    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public float getPrecio(){
        return this.precio;
    }

    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }
}
