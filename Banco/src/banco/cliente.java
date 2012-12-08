/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author usuario
 */
public class cliente {
    private String nombreCliente;
    private int idCliente;
    static int contadorClientes = 0;
    
    
   public cliente() {
   }
    
   public cliente(String nombre) {
        this.nombreCliente = nombre;
        contadorClientes++;
        this.idCliente = contadorClientes;
   }
   
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
 
    
}


