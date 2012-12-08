
package banco;


public class TipoOperacion 
{
private String descripcion="";
private long idTipoOperacion=0;
static int contadorCuentas;

public TipoOperacion(){
    
}

public TipoOperacion(String descripcion){
    this.descripcion = descripcion;
    contadorCuentas++;
    this.idTipoOperacion = contadorCuentas;
}

public void addTipoOperacion(String descripcion)
    {
        idTipoOperacion++;
        this.descripcion= descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getIdTipoOperacion() {
        return idTipoOperacion;
    }

    public void setIdTipoOperacion(long idTipoOperacion) {
        this.idTipoOperacion = idTipoOperacion;
    }

}