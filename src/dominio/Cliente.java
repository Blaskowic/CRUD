/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julian Corredor
 */
public class Cliente {
    private int idCLiente;
    private String nombre;
    private String correo;
    private String direccion;
    private int telefono;
    private String pais;
    
    public Cliente(){

}

    public Cliente(int idCLiente) {
        this.idCLiente = idCLiente;
    }

    public Cliente(String nombre, String correo, String direccion, int telefono, String pais) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pais = pais;
    }

    public Cliente(int idCLiente, String nombre, String correo, String direccion, int telefono, String pais) {
        this.idCLiente = idCLiente;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pais = pais;
    }

    public int getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCLiente=" + idCLiente + ", nombre=" + nombre + ", correo=" + correo + ", direccion=" + direccion + ", telefono=" + telefono + ", pais=" + pais + '}';
    }
    
    
    
}


