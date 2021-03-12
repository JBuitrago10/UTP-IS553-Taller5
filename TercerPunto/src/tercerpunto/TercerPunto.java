/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerpunto;

/**
 *
 * @author juan-
 */
public class TercerPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Datos personales
        String nombre = "Juan David";
        String apellido = "Buitrago Herrera";
        Integer edad = 22;
        String celular = "3215693735";
        String correo = "juandavid.buitrago1@utp.edu.co";
        String codigoEstudiante = "IS-980824";
        Integer nivelSemestre = 2;
        String universidad = "Universidad Tecnologica de Pereira";
        EstudianteInformatica estudiante = new EstudianteInformatica(nombre, apellido, edad, celular, correo, codigoEstudiante, nivelSemestre, universidad);
        
        
        estudiante.MostrarDatos();
    }
    
}
