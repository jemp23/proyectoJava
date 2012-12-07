
package banco;

import java.io.IOException;

public class TipoCuenta 
{
private String descripcion="";
private long idTipocuenta=0;


public TipoCuenta()
    {
        
    }
public void addTipoCuenta(long idTipocuenta) throws IOException
    {
        System.out.println("Ingrese Tipo de Cuenta");
        this.descripcion= herramienta.Herramienta.leerEntrada();
        this.idTipocuenta=idTipocuenta;
        
    }
public long getIdTipocuenta()
    {
     return idTipocuenta;  
    }
public String getDescripcion()
    {
    return descripcion;
    }    

}