/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionconsolaclientews;

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
        long registros [][]=new long  [3][5];
        
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
