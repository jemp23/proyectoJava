/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herramienta;

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
    
}
