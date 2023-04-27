/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import datos.ClienteDAO;
import dominio.Cliente;
import java.util.List;

/**
 *
 * @author Julian Corredor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Puse los comando en forma de comentario para que los pueda sacar y ejectuar uno por uno ya que el momento no he realizado interfaz grafica
        */
        
        //Mostrar cliente: SELECT
       /*  
        ClienteDAO clienteDao = new ClienteDAO();
        List<Cliente> clientes = clienteDao.mostrar();
        
        for(Cliente clienteForEach: clientes){
            System.out.println(clienteForEach);
        }
     */
        
        /*************************************************
        orden para ingresar el nombre en la sentencia es de la siguiente forma
        
        cliente(`Nombre_Completo`, `Correo_Cliente`, `Direccion_Compra`, `Telefono`, `Pais`)
        
        el id se incrementa a medida que se va ingresando
        */
        
     //Ingresar un cliente: INSERT
         /* 
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente clienteInsertar = new Cliente("Prueba", "Prueba@prueba.com", "Calle 3 #5-8", 55512, "Colombia");
        int registrosAfectador = clienteDao.insertar(clienteInsertar);
        List<Cliente> clientes = clienteDao.mostrar();
        
        for(Cliente clienteForEach: clientes){
            System.out.println(clienteForEach);
        }
        */
    
        
     //Actualizar un cliente: UPDATE 
     //para  esta actualizacion damos primero el id al cual se dara el cambio y en los campos de nombre y demas se veran modificados
     
     /*
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente clienteActualizar = new Cliente(1010101010, "Prueba", "Prueba@prueba.com", "Calle 3 #5-8", 55512, "Colombia");
        int registrosAfectador = clienteDao.actualizar(clienteActualizar);
        List<Cliente> clientes = clienteDao.mostrar();
        
        for(Cliente clienteForEach: clientes){
            System.out.println(clienteForEach);
        }
    */

     // Eliminar un Cliente: DELETE
     //Para esta funcion solo especificamos el id del cliente para eliminarlo
     
     /*
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente clienteEliminar = new Cliente(1010101010);
        int registrosAfectador = clienteDao.eliminar(clienteEliminar);
        List<Cliente> clientes = clienteDao.mostrar();
        
        for(Cliente clienteForEach: clientes){
            System.out.println(clienteForEach);
        }
     */
     
     
     //Gracias
     
    }
    
}
