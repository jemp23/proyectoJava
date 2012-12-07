
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

public static int mostrarMenuReporte() throws IOException
    {
        int respuesta = 0;
            
            Herramienta.limpiarPantalla(20);
            System.out.println("MENU DE REPORTES");
            System.out.println("1. Consultar Cliente");
            System.out.println("2. Consultar Cuenta");
            System.out.println("3. Listado de Clientes");
            System.out.println("4. Listado de Cuentas");
            System.out.println("5. Listado de Tipos de Operaciones");
            System.out.println("6. Listado de Tipo de Cuentas");
            System.out.println("7. Volver");
            System.out.println("Seleccione una opción.");
            
            respuesta= Integer.parseInt(Herramienta.leerEntrada());
            
            return respuesta;
    }

public static void seleccioneReporte() throws InterruptedException, IOException {
       int respuesta=0;
        do {
            respuesta = mostrarMenuReporte();
            switch (respuesta) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                        imprimirTipodeCuenta();
                        break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Menu Principal");
                    break;
                default:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Opcion Invalida");
                    Herramienta.pausa(3000);
            }
        } while(respuesta!=7);;
    }
public static void nuevoTipodeCuenta() throws IOException, InterruptedException
    {
     Herramienta.limpiarPantalla(20);   
     if (contadorTipoCuenta<10)
        {
        tipoCuenta[contadorTipoCuenta] = new TipoCuenta();
        tipoCuenta[contadorTipoCuenta].addTipoCuenta(contadorTipoCuenta);   
        contadorTipoCuenta++;
        }
     else
        {
         System.out.println("CUPO DE TIPO DE CUENTA LLENO");
         Herramienta.pausa(3000);
        }
    }
public static void imprimirTipodeCuenta() throws InterruptedException
    {
     Herramienta.limpiarPantalla(20);
        System.out.println("IMPRIMIR TIPOS DE CUENTA"); 
        System.out.println("codigo \t Descripción");
     for (int i = 0; i < contadorTipoCuenta; i++) 
            {
             System.out.println(tipoCuenta[i].getIdTipocuenta()+ " \t " + tipoCuenta[i].getDescripcion());
            }
     Herramienta.pausa(3000);
    }

  public static void main(String[] args) throws IOException, InterruptedException 
  {
   int respuesta;
   tipoCuenta = new TipoCuenta[10];


        do {
            
            mostrarMenu();//muestro el menu 
            respuesta = Integer.parseInt(Herramienta.leerEntrada()); //leo una respuesta  
                    
            
            switch (respuesta) {
                case 1:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Nuevo Cliente");
                    break;
                case 2:
                        nuevoTipodeCuenta();
                         break;
                case 3:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Tipos de Operaciones");
                    break;
                case 4:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Nueva Cuenta Bancaria");
                    break;
                case 5:
                        seleccioneReporte();
                        break;
                case 6:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Reportes");
                    break;
                case 7:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Autores");
                    break;                    
                case 8:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Adios");
                    break;
                default:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Opcion Invalida");
                    Herramienta.pausa(3000);
                    
            }
        }while(respuesta!=8);
    }

}
