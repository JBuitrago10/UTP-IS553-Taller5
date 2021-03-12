/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerpunto;

/**
 *
 * @author juan-
 */
public class RegistroLibreta {

    private String Nombre;
    private String Direccion;
    private String Numero_Telefono;
    private String Correo;
    
    public RegistroLibreta(){
        
    }

    public RegistroLibreta(String Nombre, String Direccion, String Numero_Telefono, String Correo) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Numero_Telefono = Numero_Telefono;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNumero_Telefono() {
        return Numero_Telefono;
    }

    public void setNumero_Telefono(String Numero_Telefono) {
        this.Numero_Telefono = Numero_Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
        
    
}
