
package banco;


public class TipoOperacion 
{
private String descripcion="";
private long idTipoOperacion=0;

public TipoOperacion()
    {
    }
public void addTipoOperacion(String descripcion)
    {
        idTipoOperacion++;
        this.descripcion= descripcion;
    }
}
