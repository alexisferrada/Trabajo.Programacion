
package trabajogrupal;
import java.util.Scanner;
        
/**
 * @author Alexis Ferrada, Rodrigo Coche
 */

public class TrabajoGrupal {

/*  El siguiente programa simula un cajero automático. El cliente, despues de ingresar su tarjeta debe ingresar su clave
    secreta de 4 dígitos (en este caso, "1234"). Luego podrá escoger entre tres opciones: depositar dinero, retirar dinero
    o consutar su saldo (quien actualmente tiene $400.000 en su cuenta).
 */   
    
    public static void main(String[] args) {
             
        int clave =1234;
        int claveIngresada;
        int opcion;
        int saldo =400000;
        int deposito;
        int resultado;
        int retiro;
       
        //Estructura de repeticion Do While
        do{
            System.out.print("Ingrese clave: ");
            Scanner entrada = new Scanner(System.in);
            claveIngresada = entrada.nextInt();
            /*  Si la clave ingresada es distinta a la clave de usuario se
                 volvera a preguntar hasta que ingrese la clave correcta */
        }while(claveIngresada != clave);
        
        //Salida Estandar
        System.out.println("Clave ingresada con exito.");
        
        System.out.println("Ingrese opción a realizar.");
        System.out.println("1. Consultar Saldo - 2. Depositar - 3. Retirar - 4.Salir:");
        
        //Entrada Estandar (Numérico)
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        
        // Case
        switch(opcion){
           case 1:
           System.out.println("Su saldo actual es de $"+saldo);
           break;
           case 2:
               //Estructura Secuencial
           System.out.println("¿Cuánto desea depositar?");
           deposito = entrada.nextInt();
           
           System.out.println(" Se han depositado $"+deposito );
           resultado = saldo+deposito;
           System.out.println(" Su saldo actual es de $"+resultado);
           break;
           case 3:
           System.out.println("Recuerde que el retiro no puede sobrepasar el monto de $200.000");    
           System.out.println("¿Cuánto desea retirar?");
           retiro=entrada.nextInt();
           resultado =saldo-retiro;
           
           // Estructura de Decisión Doble
               if(resultado<saldo && retiro<=200000){
                    System.out.println("Ha retirado: $"+retiro);
                    System.out.println("Su saldo actual es de $"+resultado);
               }else{
                    System.out.println("Saldo insuficiente o retiro no válido");
               }
           break;
           case 4:
           System.out.println("Gracias por su preferencia");
           break;
           default:System.out.println("Opción inválida");
               
        }
    }
}
