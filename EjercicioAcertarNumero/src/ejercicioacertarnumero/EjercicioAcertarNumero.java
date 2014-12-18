/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioacertarnumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author angel
 */
public class EjercicioAcertarNumero {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Generar numero aleatorio entre 0 y 100
        Random  rnd = new Random();
        int aleatorio = (int)(rnd.nextDouble() * 100);
        //Buffer de lectura br
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        //introducimos número para comparar con el aleatorio
        System.out.println("Introduce un numero entre 0 y 100: ");
        int respuesta = Integer.parseInt(br.readLine());
        
        if(respuesta<=100 && respuesta>=0){  //si esta entre 0 y 100
            while(respuesta != aleatorio){ //mientras que los numeros sean distintos
                if (aleatorio < respuesta){ //compara si el numero aleatorio es menor que el introducido y pide otro numero si es asi
                    System.out.println("El numero debe ser menor");
                    System.out.println("introduzca otro numero");
                    respuesta = Integer.parseInt(br.readLine());
                }
                else{  //si el numero aleatorio es mayor pide otro numero mayor
                    System.out.println("El numero debe ser mayor");
                    System.out.println("Introduzca otro numero");
                    respuesta = Integer.parseInt(br.readLine());
                }
                    
            }
            System.out.println("Respuesta correcta!!"); //finalmente cuando sale del bucle while los numeros son iguales y da un mensaje antes de finalizar
        }//fin del if
     
    }// fin de main
    
}//fin de clase EjercicioAcertarNumero
