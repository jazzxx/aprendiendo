/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprobadosuspendido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angel
 */
public class EjercicioAprobadoSuspendido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int nota;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.print("Escribe un valor entre 0 y 10:");
        nota = Integer.parseInt(br.readLine());
        if (nota >=0 && nota<= 10){
            switch(nota){
                case 5:
                    System.out.println("Aprobado ");
                    break;
                case 6:
                    System.out.println("Bien ");
                    break;
                case 7:
                    System.out.println("Notable ");
                    break;
                case 8:
                    System.out.println("Notable ");
                    break;
                case 9:
                    System.out.println("Sobresaliente ");
                    break;
                case 10:
                    System.out.println("Sobresaliente!! ");
                    break;
                default:
                    System.out.println("Suspendido");
                    break;
            }

        }
        else {
            System.out.println("ERROR: El numero no está comprendido entre 0 y 10");
        
                
        }
    }
    
}
