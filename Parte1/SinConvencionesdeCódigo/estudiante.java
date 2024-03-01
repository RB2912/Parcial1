package org.example.Parte1.SinConvencionesdeCódigo;

public class estudiante {
    String Nombre;
    int Edad;

    public void setnombre(String n) {
        Nombre = n;
    }

    public void setedad(int e) {
        Edad = e;
    }

    public void mostrarinfo(){
        System.out.println("Nombre: "+Nombre+", Edad: "+Edad);
    }
}
