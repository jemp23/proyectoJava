/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herramienta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Juan Motta
 */
public class Herramienta 
{
    
        public static void limpiarPantalla(int lineas)
        {
            for (int i = 0; i < lineas; i++) 
                {
                    System.out.println("");
                }
        } 
        
        public static void pausa(int milisegundos) throws InterruptedException
        {
        System.out.println("...");
        Thread.sleep(milisegundos);
        }
 
        public static void presioneUnaTecla() throws  IOException
        {
        System.out.println("PRESIONE UNA TECLA PARA CONTINUAR...");
        leerEntrada();
        }        
        public static String leerEntrada() throws IOException
            {
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader leer = new BufferedReader(entrada);
            String entradaTeclado;
            entradaTeclado = leer.readLine();
            return entradaTeclado;
            }
        
        public static void acercaDe() throws  IOException
        {
        System.out.println("AUTORES");
        System.out.println("EDDY BAUTISTA");
        System.out.println("EDGAR LEON");
        System.out.println("JUAN MOTTA");
        System.out.println("KARLA OVALLES");
        System.out.println("SHONATA CANCHICA");
        } 
    
}
