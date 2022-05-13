/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
*/
package ejercicio_excepciones_04;

import ejercicio_excepciones_04.servicios.MainServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Excepciones_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LO ÚNICO QUE HICE FUE LIMPIAR EL MAIN Y CAMBIAR UNA LINEA DEL EJERCICIO ANTERIOR
        //AHORA SI MUESTRA EL RESULTADO CON DECIMAL XD
        System.out.println("Este programa lee 2 números y los divide.");
        MainServicio.IngresarNumeros();
    }
    
}
