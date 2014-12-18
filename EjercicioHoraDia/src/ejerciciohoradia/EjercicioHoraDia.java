/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciohoradia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angel
 */
public class EjercicioHoraDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int a, b;
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Escribe la hora: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Escribe los minutos: ");
        b = Integer.parseInt(br.readLine());
        
        if (a==0){
            if (b==0){
                System.out.println("Son las 00:00h ... Es media noche!!!");
            
            }
            else {
                System.out.println("Es de madrugada");
            }
        }
        
        if (a>0 && a<7) System.out.println("Es de madrugada");
        if (a>=7 && a<15 && a!=12) System.out.println("Es por la mañana");
        if (a==12){
            if (b==0)System.out.println("Son las 12:00h ... Es medio día!!!");
            else System.out.println("Es por la mañana");
        }
        if (a>=15 && a<20) System.out.println("Es por la tarde");
        if (a>=20 && a<=23) System.out.println("Es de noche");
        
        
        
    }
    
}
