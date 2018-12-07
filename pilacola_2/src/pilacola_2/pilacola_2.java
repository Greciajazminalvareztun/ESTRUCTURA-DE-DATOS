
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilacola_2;
import java.util.Scanner;

/**
 *
 * @author grecia jazmin
 */



public class pilacola_2 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        clasepila p = new clasepila();
        clasecola c = new clasecola();
        System.out.print("cuantos elementos desea: \n");
        int n = Teclado.nextInt();
        System.out.println("\nINTRODUCE LOS ELEMENTOS DE LA PILA: \n");
        String e;
        for (int i = 1; i <= n; i++) {
            System.out.print("POSICION " + i + ": ");
            e = Teclado.next();
            p.insertar(e);
        }
        System.out.println("\nDATOS INTRODUCIDOS A LA PILA CORRECTAMENTE: \n");
        System.out.println("\nPASANDO LOS DATOS DE LA PILA A UNA COLA: \n");
        System.out.println("\nDATOS INGRESADOS A LA COLA: \n");

        System.out.println("\nIMPRESION DE LOS ELEMENTOS DE LA COLA: \n");
        for (int i = 1; i <= n; i++) {
            c.insertar(p.quitar());
            System.out.println("POSICION " + i + ": " + c.quitar());
        }
    }

}