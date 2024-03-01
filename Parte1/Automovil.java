package org.example.Parte1;
//1.	¿Qué es POO? Explique con ejemplos en Java
public class Automovil {


    // Atributos (Encapsulamiento con private)
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Automovil(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }

    // Métodos de acceso (Getters y Setters)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
