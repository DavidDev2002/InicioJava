package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //Literales
    private static final  String MSG_NAME = "Introdueix un nom: ";
    private static final  String MSG_SURNAME = "Introdueix un cognom: ";
    private static final  String MSG_MARCA = "Introduce la marca del coche: ";
    private static final  String MSG_COLOR = "Introduce el color del coche: ";
    private static final  String MSG_PRICE = "Introduce el precio del coche: ";

    public static void main(String[] args) {

        //Variables
        String nom,cognom;
        String marca,color;
        float precio;

        //Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        //Pedimos por teclado el nombre y el apellido
        System.out.println(MSG_NAME);
        nom = sc.next();
        System.out.println(MSG_SURNAME);
        cognom = sc.next();

        //Llamamos al constructor
	    Alumne alum = new Alumne(nom,cognom);

        //Mostramos por pantalla nombre y apellido del alumno de manera concatenada
        System.out.println("Nom del alumne: " + alum.getName());
        System.out.println("Cognom del alumne " + alum.getSurname());

        //Pedimos los parametros del coche
        System.out.println(MSG_MARCA);
        marca = sc.next();
        System.out.println(MSG_COLOR);
        color = sc.next();
        System.out.println(MSG_PRICE);
        precio = sc.nextFloat();

        //Llamamos al constructor coche
        Coche car = new Coche(marca,color,precio);

        //Printamos los atributos del coche de manera concatenada.
        System.out.println("Marca del coche:" + car.getMarca());
        System.out.println("Color del coche:" +  car.getColor());
        System.out.println("Precio del coche: " +  car.getPrecio());
    }
}
