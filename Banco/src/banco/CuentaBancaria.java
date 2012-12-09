/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.IOException;
import java.util.Date;

public class CuentaBancaria {
    private String fechaApertura;
    private int idCuentaBancaria;
    private String numeroCuenta;
    private String tipoCuenta;
    static int contadorCuentas;
    float saldo;
    
    
    public CuentaBancaria(){
    
    }
    
    public CuentaBancaria(String nro_cuenta, String tipoCuenta){
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
    
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public int getContadorCuentas()
        {
         return contadorCuentas;  
        }
    public float getSaldo()
        {
          return saldo; 
        }
    public void setSaldo(float saldo)
        {
         this.saldo=saldo;   
        }
    public void depositar(float saldo) throws IOException, InterruptedException
        {
            this.saldo= this.saldo + saldo;
            herramienta.Herramienta.limpiarPantalla(20);
            System.out.println("Deposito exitoso");
            System.out.println("Saldo disponible: "+getSaldo());
            herramienta.Herramienta.pausa(3000);
        }
    public void retirar (float monto) throws IOException, InterruptedException
        {
        if (monto>getSaldo())
           {
            herramienta.Herramienta.limpiarPantalla(20);   
            System.out.println("saldo insuficiente");
            System.out.println("Saldo disponible: "+getSaldo());
            herramienta.Herramienta.pausa(3000);
           }
        else
            {
            herramienta.Herramienta.limpiarPantalla(20);     
            this.saldo=this.saldo-monto;
            System.out.println("Retiro exitoso");
            System.out.println("Saldo disponible: "+getSaldo());
            herramienta.Herramienta.pausa(3000);
 
            }
        }
}
