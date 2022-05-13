/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_04.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class MainServicio {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void IngresarNumeros(){
        int numero1=0,numero2=0;
        
        boolean repetir;
        do {            
            repetir=false;
            
            try {
                System.out.print("\nIngrese el 1er número: ");
                numero1=leer.nextInt();
                System.out.print("Ingrese el 2do número: ");
                numero2=Integer.parseInt(leer.next());
                if(numero1==0 && numero2==0){
                    throw new ArithmeticException("La división de estos números no está definida.");
                }
                
            } catch (InputMismatchException e){
                leer.nextLine();
                System.out.println("\nIngreso Nº enteros por favor.");
                repetir=true;
            } catch (NumberFormatException e) {
                System.out.println("\nIngrese Nº enteros por favor.");
                repetir=true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                repetir=true;
            }
            
        } while (repetir);
        
        MostrarRsultado(numero1,numero2);
        System.out.println("\nPrograma finalizado.");
    
    }
    
    
    public static float Dividir(int num1,int num2) throws ArithmeticException{
        String respuesta;
        boolean repetir;
        do {            
            repetir=false;
            System.out.println("\nElija el ordén de la división:"
                    + "\nA- "+num1+"/"+num2
                    +"\nB- "+num2+"/"+num1);
            System.out.print("Opción: ");
            respuesta=leer.next().toUpperCase();
            
            switch (respuesta) {
                case "A":
                case "B":
                    break;
                default:
                    System.out.println("Ingreso no valido.");
                    repetir=true;
                }
        } while (repetir);
        
        try {
            if(respuesta.equals("A")){
                return ((float)num1/(float)num2);
            }else{
                return ((float)num2/(float)num1);
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Por definición no se puede dividir por cero.");
        }
    }
    
    public static void MostrarRsultado(int num1, int num2){
        try {
            float resultado=MainServicio.Dividir(num1, num2);
            System.out.println("\nEl resultado de la divición es "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("\n"+e.getMessage());
            ContinuarOSalir(num1, num2);
        }    
    }
    
    public static void ContinuarOSalir(int num1, int num2){
        System.out.println("Precione \"S\" para elegir de vuelta caso contrario cualquier tecla para salir.");
        String respuesta=leer.next();
        
        if(respuesta.equals("S")){
            MostrarRsultado(num1, num2);
        }
    }
}
