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
public class clasecola {
    
protected clasenodo frente;
    protected clasenodo fin;

    public clasecola() {
        frente = fin = null;
    }

    public void insertar(String elemento) {
        clasenodo a;
        a = new clasenodo(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;
        }
        fin = a;
    }

    public String quitar() {
        String aux;
        if (!colaVacia()) {
            aux = frente.elemento;
            frente = frente.siguiente;
        } else {
            return "";
        }
        return aux;
    }

    public boolean colaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

}

