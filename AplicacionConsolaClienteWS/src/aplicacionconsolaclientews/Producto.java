/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionconsolaclientews;
//import aplicacionconsolaclientews.Producto;
//import aplicacionconsolaclientews.Tarjeta;
/**
 *
 * @author soma
 */
public class Producto {
    private int id_producto;
    private float precio;
    private int cantidad ;
    private int CVV;
    public Producto(int id_prod,float precio,int cantidad,int cvv){
    this.id_producto=id_prod;
    this.precio= precio;
    this.cantidad=cantidad;
    this.CVV=cvv;
    }
    
}
