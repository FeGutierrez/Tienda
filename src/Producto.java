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
    int codigoTipo;
    int cantidadDisponible=0;
    int cantidadMinima=0;
    double precioBase;
    double precioFinal;
    
    //Constructor
    
    public Producto(int idProducto, String nombre, int codigoTipo, double precioBase){
        this.idProducto=idProducto;
        this.nombre=nombre;
        this.codigoTipo=codigoTipo;
        this.precioBase=precioBase;
    };
    
    //Métodos
    Scanner sc = new Scanner(System.in);
    public void descripcionProducto(){
        System.out.println("ID: "+ this.idProducto + "\nNombre: " + this.nombre + "\nTipo: "+ this.codigoTipo + "\nEn Stock: "+ this.cantidadDisponible + 
                "\nTope mínimo: " + this.cantidadMinima + "\nPrecio Base: " + this.precioBase + "\nPrecio + Impuestos: " +this.precioFinal);
    };
    
    
    //Dichos impuestos dependen del tipo de producto: Los de papelería 16%, los de supermercado 4% y los de droguería 12%
    public void determinarTipo(int codigoTipo){
        switch(codigoTipo){
            case 1: System.out.println("Papelería");
                break;
            case 2: System.out.println("Supermercado");
                break;
            case 3: System.out.println("Droguería");
                break;
            default: System.out.println("Por favor, ingrese un codigo de tipo valido");
        }
    }
    
    public void determinarValorFinal(int codigoTipo){
        switch(codigoTipo){
            case 1: this.precioFinal=this.precioBase+(this.precioBase*16/100);
                break;
            case 2: this.precioFinal=this.precioBase+(this.precioBase*4/100);
                break;
            case 3: this.precioFinal=this.precioBase+(this.precioBase*12/100);
                break;
            default: 
        }
                
    }
    
    public void definirTopeMinimo(){       
        System.out.println("Digite tope minimo de: "+ this.nombre);        
        this.cantidadMinima=sc.nextInt();
    }
    
    //Métodos
    
};
