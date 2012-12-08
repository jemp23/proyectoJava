/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author usuario
 */
public class cliente{
    private String nombreCliente;
    private int idCliente;
    public CuentaBancaria[] cuentas = new CuentaBancaria[10];
    static int contadorClientes = 0;
    static int contadorCuentas = 0;

    public static int getContadorCuentas() {
        return contadorCuentas;
    }
   
     
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
     
    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(String nro_cuenta, String tipo_cuenta) {
        this.cuentas[contadorCuentas] = new CuentaBancaria(nro_cuenta,tipo_cuenta);
        contadorCuentas++;
    }
    
}


