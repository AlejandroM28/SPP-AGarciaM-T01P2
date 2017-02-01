/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agarciam.t01p3;
import java.util.Scanner;

/**
 *
 * @author alejandromonroy
 */
public class SPPAGarciaMT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double base,altu,per,sup; //per = Perimetro, sup = Superficie 
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Introduzca la base");
        base = kb.nextDouble();
        System.out.println("Introduzca la altura");
        altu = kb.nextDouble();
        
        sup = base * altu;
        per = base + base + altu + altu;
        
        System.out.println("El valor de la superficie es: " + sup);
        System.out.println("El valor del perimetro es: " + per);
    }
    
}
