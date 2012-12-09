package banco;

import herramienta.Herramienta;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    //declaro las varibles a utilizar

    static TipoCuenta[] tipoCuenta;
    static cliente[] clientes = new cliente[200];
    static TipoOperacion[] TiposOperaciones = new TipoOperacion[10];
    static int contadorTipoCuenta = 0;
    static int contadorClientes = 0;
    static int contadorOperaciones = 0;

    public static void mostrarMenu() {
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

    public static int mostrarMenuReporte() throws IOException {
        int respuesta = 0;

        Herramienta.limpiarPantalla(20);
        System.out.println("MENU DE REPORTES");
        System.out.println("1. Consultar Cuentas de un Cliente");
        System.out.println("2. Consultar Cuenta");
        System.out.println("3. Listado de Clientes");
        System.out.println("4. Listado de Cuentas");
        System.out.println("5. Listado de Tipos de Operaciones");
        System.out.println("6. Listado de Tipo de Cuentas");
        System.out.println("7. Volver");
        System.out.println("Seleccione una opción.");

        respuesta = Integer.parseInt(Herramienta.leerEntrada());

        return respuesta;
    }

    public static void seleccioneReporte() throws InterruptedException, IOException {
        int respuesta = 0;
        do {
            respuesta = mostrarMenuReporte();
            switch (respuesta) {
                case 1:
                    buscar_cliente();
                    break;
                case 2:
                        buscarCuenta();
                    break;
                case 3:
                    imprimir_lista_clientes();
                    break;
                case 4:

                    break;
                case 5:
                    imprimir_tipos_operaciones();
                    break;
                case 6:
                    imprimirTipodeCuenta();
                    break;
                case 7:
                    System.out.println("Menu Principal");
                    break;
                default:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Opcion Invalida");
                    Herramienta.pausa(3000);
            }
        } while (respuesta != 7);;
    }

        public static int mostrarTipoOperaciones() throws IOException 
            {
            int respuesta = 0;
            Herramienta.limpiarPantalla(20);
            System.out.println("MENU DE OPERACIONES ");
            System.out.println("1. DEPOSITO");
            System.out.println("2. RETIRO");
            System.out.println("3. Volver");
            System.out.println("Seleccione una opción.");
            respuesta = Integer.parseInt(Herramienta.leerEntrada());
            return respuesta;
            }
 
     public static void seleccioneOperacion() throws InterruptedException, IOException {
        int respuesta = 0;
        do {
            Herramienta.limpiarPantalla(20);
            respuesta = mostrarTipoOperaciones();
            switch (respuesta) {
                case 1:
                       break;
                case 2:
                    break;
                case 3:
                    System.out.println("Menu Principal");
                    break;
                default:
                    Herramienta.limpiarPantalla(20);
                    System.out.println("Opcion Invalida");
                    Herramienta.pausa(3000);
            }
        } while (respuesta != 3);;
    }       
    public static void nuevoTipodeCuenta() throws IOException, InterruptedException {

        char resp = 's';
        try {
                
            do {
                Herramienta.limpiarPantalla(20);
                if (contadorTipoCuenta < 10) 
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
                System.out.println("Desea Registrar Otro tipo de cuenta? s/n");
                resp = Herramienta.leerEntrada().charAt(0);
                } while (resp == 's' || resp == 'S');

            } catch (IOException ex) 
            {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public static void imprimirTipodeCuenta() throws InterruptedException {
        Herramienta.limpiarPantalla(20);
        System.out.println("IMPRIMIR TIPOS DE CUENTA");
        System.out.println("codigo \t Descripción");
        for (int i = 0; i < contadorTipoCuenta; i++) {
            System.out.println(tipoCuenta[i].getIdTipocuenta() + " \t " + tipoCuenta[i].getDescripcion());
        }
        Herramienta.pausa(3000);
    }

    public static void nuevo_cliente() {
        char resp = 's';
        
        try {
                
            do {
                Herramienta.limpiarPantalla(20);
                System.out.println("Ingrese el Nombre del Cliente");
                String nombre = Herramienta.leerEntrada();
                clientes[contadorClientes] = new cliente(nombre);
                contadorClientes++;
                System.out.println("Desea Registrar Otro Cliente? s/n");
                resp = Herramienta.leerEntrada().charAt(0);
            } while (resp == 's' || resp == 'S');

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void buscar_cliente() {
        char resp;
        Herramienta.limpiarPantalla(20);
        try {            
            do {
                int pos = -1;
                System.out.println("Ingrese el Id del Cliente");
                int id = Integer.parseInt(Herramienta.leerEntrada());
                for (int i = 0; i < contadorClientes; i++) {
                    if (clientes[i].getIdCliente() == id) {
                        pos = i;
                        i = contadorClientes;
                    }
                }
                if(pos == -1){
                    System.out.println(" No hay coincidencias.");
                }else{
                    System.out.println(" ID  \tNOMBRE");
                    System.out.println(clientes[pos].getIdCliente()+" \t"+clientes[pos].getNombreCliente());
                    System.out.println("Cuentas:");
                    for (int j = 0; j < clientes[pos].getContadorCuentas(); j++) {
                            System.out.println(clientes[pos].cuentas[j].getTipoCuenta()+": "+clientes[pos].cuentas[j].getNumeroCuenta());                    
                    }
                }
                System.out.println("Desea Buscar Otro Cliente? s/n");
                resp = Herramienta.leerEntrada().charAt(0);
            } while (resp == 's' || resp == 'S');

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
    public static void imprimir_lista_clientes() {
        Herramienta.limpiarPantalla(20);
        try {
            System.out.println("ID     \tNOMBRE");
            for (int i = 0; i < contadorClientes; i++) {
                System.out.println(clientes[i].getIdCliente() + "  \t " + clientes[i].getNombreCliente());
            }
            
            Herramienta.presioneUnaTecla();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void abrir_cuenta_bancaria(){
        char resp;
        try {            
            do {
                Herramienta.limpiarPantalla(20);
                int pos = -1;
                System.out.println("Ingrese el Id del Cliente");
                int id = Integer.parseInt(Herramienta.leerEntrada());
                for (int i = 0; i < contadorClientes; i++) {
                    if (clientes[i].getIdCliente() == id) {
                        pos = i;
                        i = contadorClientes;
                    }
                }
                if(pos == -1){
                    System.out.println(" No hay coincidencias.");
                }else{
                    System.out.println("Nombre: "+clientes[pos].getNombreCliente());
                   
                    System.out.println("Ingrese el Nro de Cuenta:");
                    String cuenta = Herramienta.leerEntrada();
                    
                    for (int i = 0; i < contadorTipoCuenta; i++) {
                        System.out.println((i+1)+". \t"+tipoCuenta[i].getDescripcion());
                        
                    }
                    System.out.println("Seleccione el tipo de Cuenta:");
                    int tipo_cuenta = Integer.parseInt(Herramienta.leerEntrada());
                    clientes[pos].setCuentas(cuenta,tipoCuenta[tipo_cuenta-1].getDescripcion());
                }
                
                System.out.println("Desea Ingresar otra cuenta para otro Cliente? s/n");
                resp = Herramienta.leerEntrada().charAt(0);
            } while (resp == 's' || resp == 'S');

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public static void ingresar_tipos_operaciones(){
        char resp = 's';
        try {
            do {
                Herramienta.limpiarPantalla(20);
                System.out.println("Ingrese el Tipo de  Operacion:");
                String nombre = Herramienta.leerEntrada();
                TiposOperaciones[contadorOperaciones] = new TipoOperacion(nombre);
                contadorOperaciones++;
                System.out.println("Desea Registrar Otro Tipo de Operacion? s/n");
                resp = Herramienta.leerEntrada().charAt(0);
            } while (resp == 's' || resp == 'S');

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public static void imprimir_tipos_operaciones() throws InterruptedException {
        System.out.println("TIPOS DE OPERACIONES");
        for (int i = 0; i < contadorOperaciones; i++) {
            System.out.println(TiposOperaciones[i].getIdTipoOperacion() + "\t " + TiposOperaciones[i].getDescripcion());
        }
        Herramienta.pausa(3000);
    }
    
public static void buscarCuenta() throws IOException 
        {

        Herramienta.limpiarPantalla(20);
        int pos = -1; int pos2= -1; 
        System.out.println("Ingrese el numero de cuenta");
        int id = Integer.parseInt(Herramienta.leerEntrada());
        
        for (int i = 0; i < contadorClientes; i++) 
                    {
                    for (int j = 0; j < clientes[i].getContadorCuentas(); j++) 
                        {
                             System.out.println(clientes[i].cuentas[j].getNumeroCuenta()+" \t"+clientes[i].getNombreCliente()+" \t"+clientes[i].cuentas[j].getTipoCuenta());
                        if (clientes[i].cuentas[j].getIdCuentaBancaria()==id) 
                            {
                            pos=i;   pos2=j;
                                
                            }
                        }    
                 if(pos == -1)
                    {
                     System.out.println(" No hay coincidencias.");
                     Herramienta.presioneUnaTecla();
                    }
                 else
                    {
                        System.out.println("Numero Cuenta \tCliente \tTipo");
                        System.out.println(clientes[pos].cuentas[pos2].getNumeroCuenta()+" \t"+clientes[pos].getNombreCliente()+" \t"+clientes[pos].cuentas[pos2].getTipoCuenta());   
                        herramienta.Herramienta.presioneUnaTecla();
                    }   
                


    }
 }
       

    public static void main(String[] args) throws IOException, InterruptedException {
        int respuesta;
        tipoCuenta = new TipoCuenta[10];


        do {

            mostrarMenu();//muestro el menu 
            respuesta = Integer.parseInt(Herramienta.leerEntrada()); //leo una respuesta  


            switch (respuesta) {
                case 1:
                      nuevo_cliente();
                    break;
                case 2:
                    nuevoTipodeCuenta();
                    break;
                case 3:
                      ingresar_tipos_operaciones();
                      break;
                case 4:
                      abrir_cuenta_bancaria();
                      break;
                case 5:
                      seleccioneReporte();
                      break;
                case 6:
                      seleccioneOperacion();
                      break;
                case 7:
                       Herramienta.acercaDe();
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
        } while (respuesta != 8);
    }
}
