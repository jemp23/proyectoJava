
package banco;

import java.util.Date;


public class OperacionBancaria 
{
    int  claveOperacion;
    Date fechaOperacion = new Date();
    int idOperacion;
    int  cuenta =0;
    float   montoOperacion;


    
     public  OperacionBancaria()
    {

    }

     public OperacionBancaria(int i, int cuenta, float montod) 
     {

     claveOperacion++;
     Date fecha = new Date();
     this.fechaOperacion = fecha;
     this.idOperacion=i;
     this.cuenta = cuenta;
     this.montoOperacion=montod;
    }  
    
     public int getClaveOperacion()
        {
        return claveOperacion;   
        }
     public Date getfechaOperacion()
        {
         return fechaOperacion;  
        }
 public int getidOperacion()
        {
        return idOperacion;   
        }
public float getmontoOperacion()
        {
        return montoOperacion;   
        }
    
     
     public void imprimir()
        {
            System.out.println(claveOperacion+" \t"+fechaOperacion+" \t"+idOperacion+" \t"+montoOperacion);
        }

         
}
