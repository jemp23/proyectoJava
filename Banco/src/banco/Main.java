
package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main 
{

    private static void limpiarPantalla(int lineas)
        {
            for (int i = 0; i < lineas; i++) 
                {
                    System.out.println("");
                }
        } 

  public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int seleccion;
        int codigo;
        
        do {
            limpiarPantalla(20);
            System.out.println("MENU");
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Tipos de Cuentas");
            System.out.println("3. Tipos de Operaciones");
            System.out.println("4. Nueva Cuenta Bancaria");
            System.out.println("5. Reportes");
            System.out.println("6. Operaciones Bancarias");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción.");

            
            seleccion = Integer.parseInt(leer.readLine());
            switch (seleccion) {
                case 1:
                    limpiarPantalla(20);
                    System.out.println("Nuevo Cliente");
                    break;
                case 2:
                    limpiarPantalla(20);
                    System.out.println("Tipos de Cuentas");
                    break;
                case 3:
                    limpiarPantalla(20);
                    System.out.println("Tipos de Operaciones");
                    break;
                case 4:
                    limpiarPantalla(20);
                    System.out.println("Nueva Cuenta Bancaria");
                    break;
                case 5:
                    limpiarPantalla(20);
                    System.out.println("Operaciones Bancarias");
                    break;
                case 6:
                    limpiarPantalla(20);
                    System.out.println("Reportes");
                    break;
                case 7:
                    limpiarPantalla(20);
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break; // This break is not really necessary
            }
        } while (seleccion != 7);
    }

}
