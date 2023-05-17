/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author soma
 */
@WebService(serviceName = "CalculadoraWS")
public class CalculadoraWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagar")
    public Boolean pagar(@WebParam(name = "numero_tarjeta") long numero_tarjeta, @WebParam(name = "monto") int monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "codigo_CVV") int codigo_CVV) {
        //TODO write your implementation code here:
        System.out.println("su numero de tarjeta es: "+numero_tarjeta);
        System.out.println("el monto es: "+monto);
        System.out.println("su nombre es: "+nombre);
        System.out.println("su codigo cvv es: "+codigo_CVV);
        if (monto<=100) {
            System.out.println("si puede comprar\n");
        }else  {
            System.out.println(" no alcanza el dinero\n");
        }
        return monto<=100;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comprar")
    public Boolean comprar(@WebParam(name = "id_producto") long id_producto, @WebParam(name = "precio") int precio, @WebParam(name = "num_prod") int num_prod, @WebParam(name = "total") int total) {
        //TODO write your implementation code here:
        System.out.println("COMPRAR\n");
        System.out.println("el id del producto es: "+id_producto);
        System.out.println("el precio del producto es: $"+precio);
        System.out.println("el total de la compra es: $"+total);
        System.out.println("////////////////////////////////////////////////");
        if (num_prod <=5 && total<=100) {
            System.out.println("Puede realizar la compra\n ");
        }else{
            System.out.println("No puede realizar la compra\n");
        }   
          return num_prod <=5 && total<=100;
    }
}
