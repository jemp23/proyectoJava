
package banco;

import herramienta.Herramienta;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main 
{



  public static void main(String[] args) throws IOException, InterruptedException {
    

       InputStreamReader entrada = new InputStreamReader(System.in);
       BufferedReader leer = new BufferedReader(entrada);
       String entradaTeclado;
       String respuesta="0";
       
        
        do {
            
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

            
            entradaTeclado = leer.readLine();
            respuesta = entradaTeclado.toString();
            
            switch (respuesta) {
                case "1":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Nuevo Cliente");
                    break;
                case "2":
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Tipos de Cuentas");
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
