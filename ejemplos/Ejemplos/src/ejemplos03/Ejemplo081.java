/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        int valor1;
        int valor2;
        int opcion;
        
        System.out.println("Ingrese el número de la tabla");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        valor2 = entrada.nextInt();
        System.out.println("Ingrese el número de la tabla a generar");
        opcion= entrada.nextInt();
        
        switch (opcion) {
            case 1:
               mensajeSuma = obtenerTablaSumar(valor2, valor1); // se invoca al método 
                                                       // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
               System.out.printf("%s\n", mensajeSuma);
            case 2:
                mensajeSumaDos = obtenerTablaMultiplicar(valor2, valor1);
                System.out.printf("%s\n", mensajeSumaDos);
        }
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
