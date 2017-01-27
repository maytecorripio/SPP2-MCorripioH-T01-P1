/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.t01;
// Agregar libreria,import
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Paso 1. Declaración de variables
        double mat, cal1,cal2, cal3, cal4, cal5, pro;
        // mat = matrícula, cal = calificación , pro= promedio
        
        Scanner T = new Scanner (System.in);
        
        //Paso 2. Pedir datos
        System.out.println("Hola!, introduce tu matrícula");
        mat = T.nextDouble();
        System.out.println("Ahora introduciremos las 5 calificaciones de tus materias");
        System.out.println("Introduce la primera calificación");
        cal1 = T.nextDouble();
        System.out.println("Introduce la segunda calificación");
        cal2 = T.nextDouble();
        System.out.println("Introduce la tercera calificación");
        cal3 = T.nextDouble();
        System.out.println("Introduce la cuarta calificación");
        cal4 = T.nextDouble();
        System.out.println("Introduce la quinta calificación");
        cal5 = T.nextDouble();
        
        //Paso 3. Sacar el promedio con califaciones dadas.
        pro = ((cal1 + cal2 +cal3 +cal4 +cal5)/5);
                
        //Paso 4. Ver si el promedio es aprobado o reprobado.
        if (pro>6.9)      
            System.out.println("APROBADO");
        else if (pro<7.0)
            System.out.println("REPROBADO");
        
        //Paso 5. Se muestra el resultado.
        System.out.println("Tu promedio es:" +pro);
    }
    
}
