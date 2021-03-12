/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerpunto;

import java.util.Scanner;

/**
 *
 * @author juan-
 */
public class EstudianteInformatica extends Estudiante {
    
    private String codigoEstudiante;
    private Integer nivelSemestre;
    private String universidad;

    public EstudianteInformatica() {
    }

    public EstudianteInformatica(String nombre, String apellido, Integer edad, String celular, String correo, String codigoEstudiante, Integer nivelSemestre, String universidad) {
        super(nombre, apellido, edad, celular, correo);
        this.codigoEstudiante = codigoEstudiante;
        this.nivelSemestre = nivelSemestre;
        this.universidad = universidad;
    }
    
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public Integer getNivelSemestre() {
        return nivelSemestre;
    }

    public void setNivelSemestre(Integer nivelSemestre) {
        this.nivelSemestre = nivelSemestre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
    
    public void IngresarDatos()
    {
        //Datos predeterminados
    }
    
    public void MostrarDatos()
    {
        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nCelular: " + getCelular() +
                "\nCorreo: " + getCorreo() +
                "\nCodigo estudiante: " + codigoEstudiante +
                "\nUbicacion semestral: " + nivelSemestre + 
                "\nUniversidad: " + universidad);
    }
    
}
