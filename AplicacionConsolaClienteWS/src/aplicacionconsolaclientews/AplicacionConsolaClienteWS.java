/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionconsolaclientews;
////import Producto;
//import org.me.calculator.model.Tarjeta;
import java.util.Scanner;

/**
 *
 * @author soma
 */
public class AplicacionConsolaClienteWS {
//        Producto smoothie_de_vegetales_verdes = new Producto(1, 12, 30,012);
//        Producto coctel_de_jicama_con_pepino = new Producto(2, 13, 10,013);
//        Producto aguacate_relleno_de_atun = new Producto(3, 14, 10,014);
//                                        //id tarjeta nombre id_client CVV
//        Tarjeta cliente_1 =new Tarjeta("1123","Ian","0001" , 77479);
//        Tarjeta cliente_2 =new Tarjeta("1553","Nefta","0002" , 73554);
//        Tarjeta cliente_3 =new Tarjeta("1791","Fernando","0003" , 34484);
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Producto smoothie_de_vegetales_verdes = new Producto(1, 12, 30,012);
//        Producto coctel_de_jicama_con_pepino = new Producto(2, 13, 10,013);
//        Producto aguacate_relleno_de_atun = new Producto(3, 14, 10,014);
//                                        //id tarjeta nombre id_client CVV
//        Tarjeta cliente_1 =new Tarjeta("1123","Ian","0001" , 77479);
//        Tarjeta cliente_2 =new Tarjeta("1553","Nefta","0002" , 73554);
//        Tarjeta cliente_3 =new Tarjeta("1791","Fernando","0003" , 34484);
//        //logic of the program
          Scanner scannerObject = new Scanner(System.in);
          System.out.println("Ingrese su numero de tarjeta");
          long numero_de_tarjeta= scannerObject.nextLong();
          
          System.out.println("Ingrese la cantidad de nectar de maracuya que comprara cada uno cuesta $40 ");
          int cantidad_necta = scannerObject.nextInt();
          System.out.println("ingrese su nombre");
          String nombre = scannerObject.nextLine();
          pagar(numero_de_tarjeta, 40, nombre, 40*cantidad_necta);
          long idprod=389757894;
          int precio=40;
          comprar(idprod, precio, 15, cantidad_necta*40);
//        if (str.equals(cliente_1.getIdcliente())) {
//                System.out.println("Ud es el cliente "+cliente_1.getIdcliente()+" su nombre es "+cliente_1.getCli_nombre());
//                
//        }else if(str.equals(cliente_2.getIdcliente())){
//            System.out.println("Ud es el cliente"+cliente_2.getIdcliente()+" su nombre es "+cliente_2.getCli_nombre());
//            
//        }else if(str.equals(cliente_3.getIdcliente())){
//            System.out.println("Ud es el cliente"+cliente_3.getIdcliente()+" su nombre es "+cliente_3.getCli_nombre());
//            
//                }
        
        
    }

    private static Boolean comprar(long idProducto, int precio, int numProd, int total) {
        aplicacionconsolaclientews.CalculadoraWS_Service service = new aplicacionconsolaclientews.CalculadoraWS_Service();
        aplicacionconsolaclientews.CalculadoraWS port = service.getCalculadoraWSPort();
        //va a dar como resultado si se puede hacer o no la compra
//            if     ()
        
        return port.comprar(idProducto, precio, numProd, total);
        
    }

    private static Boolean pagar(long numeroTarjeta, int monto, java.lang.String nombre, int codigoCVV) {
        aplicacionconsolaclientews.CalculadoraWS_Service service = new aplicacionconsolaclientews.CalculadoraWS_Service();
        aplicacionconsolaclientews.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.pagar(numeroTarjeta, monto, nombre, codigoCVV);
    }
    
    
}
