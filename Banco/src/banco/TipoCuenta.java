
package banco;

public class TipoCuenta 
{
private String descripcion="";
private long idTipocuenta=0;


public TipoCuenta()
    {
    }
public void addTipoCuenta(String descripcion)
    {
        ++idTipocuenta;
        this.descripcion= descripcion;
    }
public void imprimir()
    {
        System.out.println("id "+idTipocuenta+" Des: "+ descripcion);
    }
}