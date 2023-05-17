/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionconsolaclientews;

/**
 *
 * @author soma
 */
public class Tarjeta {//id, saldo , id cliente
    private String idtarjeta;
    private String idcliente;
    private String cli_nombre;
    private int saldo;
    public Tarjeta(String m,String cl_n,String ic,int s){
    this.idtarjeta=m;
    this.cli_nombre=cl_n;
    this.idcliente=ic;
    this.saldo=s;
    
    }
}
