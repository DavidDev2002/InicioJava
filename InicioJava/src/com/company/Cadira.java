package com.company;

public class Cadira {
    String material, color;
    float precio;

    //Costructores
     public Cadira(String material, String color, float precio){
         this.setMaterial(material);
         this.setColor(color);
         this.setPrecio(precio);
     }

     public Cadira(String material, float precio){
         this(material,null,precio);
     }
    //Getters
    public float getPrecio() {
        return this.precio;
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    //Setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
