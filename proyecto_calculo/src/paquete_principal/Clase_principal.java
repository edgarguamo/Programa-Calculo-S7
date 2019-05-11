/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Clase_principal {

    /**
     * @param args the command line arguments
     */
    // funcion 3
    // x para x >=0
        
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaración de variables 
        Scanner teclado = new Scanner (System.in); 
        int selec_ecu ; // esta variable sirve para seleccionar la ecuación
        int n_cal= 0; // variable usada para escoger la ecuación
        int xi; // Intervalo Inicial 
        int xf; // Intervalo final 
        int aux;   // variable usada si la asignacion de rangos esta mal
        double y; // variable que da el los puntos en el eje y
        int y1; //variable usada únicamente en el ejericio 5
        int x1;// variable usada únicamente en el ejrcicio 5
        String mensaje= ""; // usada para almacenar los resultados 
        
        
        //Incio del programa
        System.out.println("Bienvenido al generador de respuestas de"
                + "Funciones Lineales \nPor favor seleccione la ecuación que "
                + "quiere graficar:");
        
        // Presentación de la ecuacion al consumidor
        System.out.println("1. f(x) = x + 5 - (20 - x)\n2. f(x) = (x-1)^2 + 2 "
                + "\n3. f(x) = x para x >=0\n\t  x para x < 0 \n"
                + "4. f(x) = (x+2)^3\n5. f(x) = (x-2)^1/2\n\t  log_5"
                + " [x(x + 4)]^2\n6. f(x) = ------------------\n\t\t   8 "
                + "\n7. f(x) = log_8 x = m \n9. f(x) = log 4(x + 2)^2"
                + "\n\t     x^5+x^2-9 \n10. f(x) = ------------- \n\t\tx-1");
        
        // peticion de los rangos para la graficacion
        n_cal = teclado.nextInt();
        System.out.println("A continuación se le pedira los rangos para la gra"
                + "ficación \nPor favor ingrese el número menor"
                + " del intervalo:"); // Intervalo menor 
        xi = teclado.nextInt();
        
        System.out.println("Por favor ingrese el número mayor");
        // Intervalo mayor
        xf = teclado.nextInt();
        if (xi > xf){
            aux = xf;
            xf=xi;
            xi=aux; 
            
            
        }
        switch (n_cal){
            case 3: // 3. f(x) = x para x >=0
                mensaje = String.format("%s | %s     %s | %s\n", "x", "y", 
                        "x1","y1");
                while (xi <= xf){
                    x1 = -xi;
                    y = xi;
                    y1 = x1;
                    mensaje = String.format("%s %d | %d     %d | %d\n", mensaje,
                    xi, y, x1,y1);
                    xi++;
                    break;
                }
            case 5: // 5. f(x) = (x-2)^1/2
                mensaje = String.format("%s | %s\n", "x", "y");
                while (xi <= xf){
                    y = Math.pow((xi-2),0.33);
                    System.out.printf("%.2f\n",y);
                    xi++;
                    mensaje = String.format("%s%d | %.2f\n", mensaje, xi, y);
                    break;
                }        
            case 9: //9. f(x) = log 4(x + 2)^2
                mensaje = String.format("%s | %s\n", "x", "y");
        }
        // Impresión de datos almacenados 
        System.out.printf("%s", mensaje);
       
    }
    
}
