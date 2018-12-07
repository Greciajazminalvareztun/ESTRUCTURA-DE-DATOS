/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilacola_2;

/**
 *
 * @author grecia jazmin
 */
public class clasepila {

    private clasenodo cima;

    public clasepila() {
        cima = null;
    }

    public void insertar(String elemento) {
        clasenodo nuevo;
        nuevo = new clasenodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public String quitar() {
        String aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
}

