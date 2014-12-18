/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosumarnumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author angel
 */
public class EjercicioSumarNumeros {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int numero;
        int suma = 0;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("¿Quiere introducir un valor para la suma? s/n");
        String respuesta = br.readLine();
        
        while (respuesta.equals("s")){
            System.out.print("Escribe un numero para sumar: ");
            numero = Integer.parseInt(br.readLine());
            suma = suma + numero;
            System.out.println("¿Quiere introducir un valor para la suma? s/n");
            respuesta = br.readLine();
            
        }
        System.out.println("Resultado de la suma: " + suma);
    }
    
}
