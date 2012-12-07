
package banco;

import herramienta.Herramienta;
import java.io.IOException;



public class Main 
{
    //declaro las varibles a utilizar
   static TipoCuenta[] tipoCuenta; 
   static int contadorTipoCuenta = 0;
   
public static void mostrarMenu()
    {
            Herramienta.limpiarPantalla(20);
            System.out.println("MENU");
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Tipos de Cuentas");
            System.out.println("3. Tipos de Operaciones");
            System.out.println("4. Nueva Cuenta Bancaria");
            System.out.println("5. Reportes");
            System.out.println("6. Operaciones Bancarias");
            System.out.println("7. Autores");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opción.");
    }

public static void nuevoTipodeCuenta() throws IOException
    {
     Herramienta.limpiarPantalla(20);   
     tipoCuenta[contadorTipoCuenta] = new TipoCuenta();
     tipoCuenta[contadorTipoCuenta].addTipoCuenta();   
    contadorTipoCuenta++;
    
            
             
    }

  public static void main(String[] args) throws IOException, InterruptedException 
  {
   String respuesta;
   tipoCuenta = new TipoCuenta[100];


        do {
            
            mostrarMenu();//muestro el menu 
            respuesta = Herramienta.leerEntrada(); //leo una respuesta  
                    
            
            switch (respuesta) {
                case "1":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Nuevo Cliente");
                    break;
                case "2":
                        nuevoTipodeCuenta();
                         break;
                case "3":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Tipos de Operaciones");
                    break;
                case "4":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Nueva Cuenta Bancaria");
                    break;
                case "5":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Operaciones Bancarias");
                    break;
                case "6":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Reportes");
                    break;
                case "7":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Autores");
                    break;                    
                case "8":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Adios");
                    break;
                default:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Opcion Invalida");
                    Herramienta.pausa(3000);
                    
            }
        }while(!"8".equals(respuesta));
    }

}
