/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Date;

public class CuentaBancaria {
    private String fechaApertura;
    private int idCuentaBancaria;
    private String numeroCuenta;
    private int tipoCuenta;
    static int contadorCuentas;

    
    
    
    public CuentaBancaria(){
    
    }
    
    public CuentaBancaria(String nro_cuenta, int tipoCuenta){
        this.numeroCuenta = nro_cuenta;
        java.util.Date fecha = new Date();
        this.fechaApertura = String.valueOf(fecha);
        this.tipoCuenta = tipoCuenta;
        contadorCuentas++;
        this.idCuentaBancaria = contadorCuentas;
    }
    
    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(int idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
