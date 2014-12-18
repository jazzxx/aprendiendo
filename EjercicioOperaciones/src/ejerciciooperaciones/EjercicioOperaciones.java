/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author angel
 */
public class EjercicioOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int a, b;
        double x, y;
        
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Escribe un numero entero:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Escribe un numero entero:");
        b = Integer.parseInt(br.readLine());
        System.out.println("Escribe un numero real:");
        x = Double.parseDouble(br.readLine());
        System.out.println("Escribe un numero real:");
        y = Double.parseDouble(br.readLine());
        
        System.out.println("ENTEROS: ");
        System.out.println(" a+b = " + (a+b));
        System.out.println(" a-b = " + (a-b));
        System.out.println(" b-a = " + (b-a));
        System.out.println(" a*b = " + (a*b));
        System.out.println(" a/b = " + (a/b));
        System.out.println(" b/a = " + (b/a));
        System.out.println(" a%b = " + (a%b));
        System.out.println(" b%a = " + (b%a));
        System.out.println("");
        System.out.println("REALES: ");
        System.out.println(" x+y = " + (x+y));
        System.out.println(" x-y = " + (x-y));
        System.out.println(" y-x = " + (y-x));
        System.out.println(" x*y = " + (x*y));
        System.out.println(" x/y = " + (x/y));
        System.out.println(" y/x = " + (y/x));
        System.out.println(" x%y = " + (x%y));
        System.out.println(" y%x = " + (y%x));
        System.out.println("");
        
        System.out.println("ENTERO Y REAL: ");
        System.out.println(" a+y = " + (a+y));
        System.out.println(" a-y = " + (a-y));
        System.out.println(" y-a = " + (y-a));
        System.out.println(" a*y = " + (a*y));
        System.out.println(" a/y = " + (a/y));
        System.out.println(" y/a = " + (y/a));
        System.out.println(" a%y = " + (a%y));
        System.out.println(" y%a = " + (y%a));
        System.out.println("");
        
        
        
        prueba p1 = new prueba();
        p1.valores(6, 35);
        System.out.println(p1.pruebaMult());
        
        
        
        
        
    }
    
}
