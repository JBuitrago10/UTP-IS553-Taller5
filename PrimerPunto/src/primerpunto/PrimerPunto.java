/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerpunto;

import java.util.Scanner;

/**
 *
 * @author juan-
 */
public class PrimerPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibretaDeDirecciones prueba = new LibretaDeDirecciones();
        Integer num, op;
        Scanner entrada = new Scanner(System.in);
        
        do
        {             
            System.out.println("Seleccione una opcion...");
            System.out.println("1. Añadir registro.");
            System.out.println("2. Borrar registro.");
            System.out.println("3. Ver todos los registros.");
            System.out.println("4. Actualizar registro.");
            System.out.println("Pulse 5 para SALIR...");
            op = entrada.nextInt();

            switch(op)
            {
                case 1:
                    System.out.println("Por favor numero de registros a ingresar: ");
                    num = entrada.nextInt();
                    prueba.AñadirEntrada(num);
                    System.out.println("Pulsa cualquier tecla para continuar...");
                    entrada.nextLine();
                    break;

                case 2:
                    System.out.println("Por favor ingrese el numero de registro a borrar: ");
                    num = entrada.nextInt();
                    prueba.BorrarEntrada(num);
                    System.out.println("Pulsa cualquier tecla para continuar...");
                    entrada.nextLine();
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("...LISTADO COMPLETO...");
                    System.out.println("");
                    prueba.VerTodasEntradas();
                    System.out.println("Pulsa cualquier tecla para continuar...");
                    entrada.nextLine();
                    break;

                case 4:
                    System.out.println("Por favor ingrese numero de registro a actualizar: ");
                    num = entrada.nextInt();
                    prueba.ActualizarEntrada(num);
                    System.out.println("Pulsa cualquier tecla para continuar...");
                    entrada.nextLine();
                    break;
                    
                case 5:
                    break;
            }           
            entrada.nextLine();
        }while(op!=8);
        
        //prueba.AñadirEntrada(num);
        //prueba.BorrarEntrada();
        /*System.out.println("");
        System.out.println("...LISTADO COMPLETO...");
        System.out.println("");
        prueba.VerTodasEntradas();*/
        //prueba.ActualizarEntrada(num);
        //prueba.VerTodasEntradas();
        /*String Nombre, Direccion, Numero_Telefono, Correo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        Nombre = entrada.nextLine();
        System.out.println("Ingrese la direccion: ");
        Direccion = entrada.nextLine();
        System.out.println("Ingrese numero de telefono: ");
        Numero_Telefono = entrada.nextLine();
        System.out.println("Ingrese el correo: ");
        Correo = entrada.nextLine();
        
        RegistroLibreta ejemplo = new RegistroLibreta(Nombre, Direccion, Numero_Telefono, Correo);
        
        System.out.println("Su nombre es: "+ejemplo.getNombre());
        System.out.println("Su direccion es: "+ejemplo.getDireccion());
        System.out.println("Su numero de telefono es: "+ejemplo.getNumero_Telefono());
        System.out.println("Su correo es: "+ejemplo.getCorreo());*/
    }
    
}
