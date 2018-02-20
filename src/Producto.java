/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Flexxo333
 */
public class Producto {
    
    int idProducto;
    String nombre;
    String tipo;
    int cantidadDisponible=0;
    int cantidadMinima=0;
    double precioBase;
    double precioFinal;
    
    //Constructor
    
    public Producto(int idProducto, String nombre, String tipo, /*int cantidadDisponible,*/ /*int cantidadMinima,*/ double precioBase/*, double precioFinal*/){
        this.idProducto=idProducto;
        this.nombre=nombre;
        this.tipo=tipo;
        //this.cantidadDisponible=cantidadDisponible;
        //this.cantidadMinima=cantidadMinima;
        this.precioBase=precioBase;
        //this.precioFinal=precioFinal;
    };
    
    //Métodos
    Scanner sc = new Scanner(System.in);
    public void descripcionProducto(){
        System.out.println("ID: "+ this.idProducto + "\nNombre: " + this.nombre + "\nTipo: "+ this.tipo + "\nEn Stock: "+ this.cantidadDisponible + 
                "\nTope mínimo: " + this.cantidadMinima + "\nPrecio Base: " + this.precioBase + "\nPrecio + Impuestos: " +this.precioFinal);
    };
    
    
    //Dichos impuestos dependen del tipo de producto: Los de papelería 16%, los de supermercado 4% y los de droguería 12%
    public void determinarTipo(int x){
        switch(x){
            case 1: this.tipo="Papelería";
                break;
            case 2: this.tipo="Supermercado";
                break;
            case 3: this.tipo="Droguería";
                break;
        }
    }
    
    public void determinarValorFinal(){
        
    }
    
    //Métodos
    
};
