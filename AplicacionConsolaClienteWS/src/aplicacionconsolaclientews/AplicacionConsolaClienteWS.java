/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionconsolaclientews;
import aplicacionconsolaclientews.Producto;
import aplicacionconsolaclientews.Tarjeta;

/**
 *
 * @author soma
 */
public class AplicacionConsolaClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto smoothie_de_vegetales_verdes = new Producto(1, 12, 30,012);
        Producto coctel_de_jicama_con_pepino = new Producto(2, 13, 10,013);
        Producto aguacate_relleno_de_atun = new Producto(3, 14, 10,014);
                                        //id tarjeta nombre id_client CVV
        Tarjeta cliente_1 =new Tarjeta("1123","Ian","0001" , 77479);
        Tarjeta cliente_2 =new Tarjeta("1553","Nefta","0002" , 73554);
        Tarjeta cliente_3 =new Tarjeta("1791","Fernando","0003" , 34484);
        //logic of the program
        
        
    }

    private static Boolean comprar(long idProducto, int precio, int numProd, int total) {
        aplicacionconsolaclientews.CalculadoraWS_Service service = new aplicacionconsolaclientews.CalculadoraWS_Service();
        aplicacionconsolaclientews.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.comprar(idProducto, precio, numProd, total);
    }

    private static Boolean pagar(long numeroTarjeta, int monto, java.lang.String nombre, int codigoCVV) {
        aplicacionconsolaclientews.CalculadoraWS_Service service = new aplicacionconsolaclientews.CalculadoraWS_Service();
        aplicacionconsolaclientews.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.pagar(numeroTarjeta, monto, nombre, codigoCVV);
    }
    
}
