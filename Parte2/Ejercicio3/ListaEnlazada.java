package org.example.Parte2.Ejercicio3;

public class ListaEnlazada {
    Nodo cabeza;

    // Agrega un nuevo nodo al final de la lista
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Ordena la lista enlazada en orden ascendente
    public void ordenar() {
        if (cabeza == null || cabeza.siguiente == null) {
            return; // La lista está vacía o tiene un solo elemento
        }

        Nodo actual = cabeza;
        Nodo indice = null;
        int temp;

        while (actual != null) {
            indice = actual.siguiente;

            while (indice != null) {
                if (actual.valor > indice.valor) {
                    temp = actual.valor;
                    actual.valor = indice.valor;
                    indice.valor = temp;
                }

                indice = indice.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    // Muestra los valores de los nodos de la lista enlazada
    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    // Método principal para demostrar la funcionalidad
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(8);
        lista.agregar(25);
        lista.agregar(6);
        lista.agregar(3);
        System.out.println("Lista original:");
        lista.mostrar();

        lista.ordenar();
        System.out.println("Lista ordenada:");
        lista.mostrar();
    }
}
