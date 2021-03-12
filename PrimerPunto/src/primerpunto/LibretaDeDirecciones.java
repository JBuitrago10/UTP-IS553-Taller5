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
public class LibretaDeDirecciones {
    
    //RegistroLibreta registros = new RegistroLibreta();
    Integer contador = 0;
    String [][] reg = new String[4][100];
    
    public void AñadirEntrada(Integer numeroEntradas)
    {
        Integer posicion;
        //Integer numeroEntradas = 1;
        
        for(posicion = 0; posicion <= (numeroEntradas-1); posicion++)
        {
            String Nombre, Direccion, Numero_Telefono, Correo;
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Registro #"+(posicion+1));
            System.out.println("Ingrese un nombre: ");
            Nombre = entrada.nextLine();
            System.out.println("Ingrese la direccion: ");
            Direccion = entrada.nextLine();
            System.out.println("Ingrese numero de telefono: ");
            Numero_Telefono = entrada.nextLine();
            System.out.println("Ingrese el correo: ");
            Correo = entrada.nextLine();
            System.out.println("");
            
            RegistroLibreta registros = new RegistroLibreta(Nombre, Direccion, Numero_Telefono, Correo);
            
            reg[0][posicion] = registros.getNombre();
            reg[1][posicion] = registros.getDireccion();
            reg[2][posicion] = registros.getNumero_Telefono();
            reg[3][posicion] = registros.getCorreo();
            
            contador++;
        }
    }
    
    public void BorrarEntrada(Integer borrarReg)
    {
        RegistroLibreta registros = new RegistroLibreta();
        
        Integer posicion;
        //Integer borrarReg = 1;
        
        for(posicion = 0; posicion <= (contador-1); posicion++)
        {
            if(posicion == borrarReg)
            {
                registros.setNombre(null);
                registros.setDireccion(null);
                registros.setNumero_Telefono(null);
                registros.setCorreo(null);
                
                reg[0][posicion] = registros.getNombre();
                reg[1][posicion] = registros.getDireccion();
                reg[2][posicion] = registros.getNumero_Telefono();
                reg[3][posicion] = registros.getCorreo();
            }
        }
        
        System.out.println("");
        System.out.println("REGISTRO BORRADO CON EXITO...");
        
    }
    
    public void VerTodasEntradas()
    {
        Integer posicion;
        
        for(posicion = 0; posicion <= (contador-1); posicion++)
        {
            System.out.println("Registro #"+(posicion+1));
            System.out.println("Nombre: "+reg[0][posicion]);
            System.out.println("Direccion: "+reg[1][posicion]);
            System.out.println("Numero telefono: "+reg[2][posicion]);
            System.out.println("Correo: "+reg[3][posicion]);
            System.out.println("");
        }
    }
    
    public void ActualizarEntrada(Integer numReg)
    {
        String Nombre, Direccion, Numero_Telefono, Correo;
        Scanner entrada = new Scanner(System.in);
        RegistroLibreta registros = new RegistroLibreta();
        
        Integer posicion;
        //Integer numReg = 1;
        
        for(posicion = 0; posicion <= (numReg-1); posicion++)
        {
            if(posicion == numReg)
            {
                reg[0][posicion] = null;
                reg[1][posicion] = null;
                reg[2][posicion] = null;
                reg[3][posicion] = null;
                
                System.out.println("Registro #"+(posicion+1));
                System.out.println("Ingrese nuevo nombre: ");
                Nombre = entrada.nextLine();
                System.out.println("Ingrese nueva direccion: ");
                Direccion = entrada.nextLine();
                System.out.println("Ingrese nuevo numero de telefono: ");
                Numero_Telefono = entrada.nextLine();
                System.out.println("Ingrese nuevo correo: ");
                Correo = entrada.nextLine();
                System.out.println("");
                
                registros.setNombre(Nombre);
                registros.setDireccion(Direccion);
                registros.setNumero_Telefono(Numero_Telefono);
                registros.setCorreo(Correo);
                
                reg[0][posicion] = registros.getNombre();
                reg[1][posicion] = registros.getDireccion();
                reg[2][posicion] = registros.getNumero_Telefono();
                reg[3][posicion] = registros.getCorreo();
            }
        }
        
        System.out.println("");
        System.out.println("REGISTRO ACTUALIZADO CORRECTAMENTE...");
    }
}
