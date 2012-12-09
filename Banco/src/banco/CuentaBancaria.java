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
    public void depositar(float saldo)
        {
        this.saldo= this.saldo + saldo;
        }
    public void retirar (float monto)
        {
        if (monto>getSaldo())
           {
            System.out.println("saldo insuficiente");
           }
        else
            {
            this.saldo=this.saldo-monto;
 
            }
        }
}
