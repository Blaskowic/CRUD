/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Cliente;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Julian Corredor
 */
public class ClienteDAO {
    public static final String SQL_SELECT = "SELECT * FROM cliente";
    public static final String SQL_INSERT = "INSERT INTO cliente(`Nombre_Completo`, `Correo_Cliente`, `Direccion_Compra`, `Telefono`, `Pais`) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String SQL_UPDATE = "UPDATE cliente SET Nombre_Completo = ?, Correo_Cliente = ?, Direccion_Compra = ?, Telefono = ?, Pais = ? WHERE Id_Cliente = ?";
    public static final String SQL_DELETE = "DELETE FROM cliente WHERE Id_Cliente = ?";
    
    
    public List<Cliente> mostrar(){
    
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
            cliente = new Cliente();
            cliente.setIdCLiente(resultado.getInt("Id_Cliente"));
            cliente.setNombre(resultado.getString("Nombre_Completo"));
            cliente.setCorreo(resultado.getString("Correo_Cliente"));
            cliente.setDireccion(resultado.getString("Direccion_Compra"));
            cliente.setTelefono(resultado.getInt("Telefono"));
            cliente.setPais(resultado.getString("Pais"));
            clientes.add(cliente);
         
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
        
            try {
                ConexionBD.cerrar(resultado);
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return clientes;
    }
    
    public int insertar(Cliente cliente){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getCorreo());
            sentencia.setString(3, cliente.getDireccion());
            sentencia.setInt(4, cliente.getTelefono());
            sentencia.setString(5, cliente.getPais());
            registros = sentencia.executeUpdate();
                    
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
        
            try {
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            } catch (SQLException e) {
                
                e.printStackTrace(System.out);
            }    
        }     
        return registros;
    }
    
    public int actualizar (Cliente cliente){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_UPDATE);
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getCorreo());
            sentencia.setString(3, cliente.getDireccion());
            sentencia.setInt(4, cliente.getTelefono());
            sentencia.setString(5, cliente.getPais());
            sentencia.setInt(6,cliente.getIdCLiente());
            registros = sentencia.executeUpdate();
                    
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
        
            try {
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            } catch (SQLException e) {
                
                e.printStackTrace(System.out);
            }    
        }     
        return registros;   
    
    }
    
    public int eliminar (Cliente cliente) {
        
         Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_DELETE);
            sentencia.setInt(1, cliente.getIdCLiente());
            registros = sentencia.executeUpdate();
                    
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
        
            try {
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            } catch (SQLException e) {
                
                e.printStackTrace(System.out);
            }    
        }     
        return registros;
    
    }
}
