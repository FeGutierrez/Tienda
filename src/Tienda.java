import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
public class Tienda {
    Scanner sc = new Scanner(System.in);
    //Atributos
    
    //Constructor
    public Tienda(){
        
    };
    
    
    //Métodos
      
    public void registrarProductosAStock(){
        System.out.println("Ingrese cantidad de productos a registrar.");        
        int cantidadProductos = sc.nextInt();
        Producto arrProducto[] = new  Producto[1];
        sc.nextLine();
        
        for (int i=0; i<cantidadProductos; i+=1){
            System.out.println("Por favor, indique el nombre del producto." );
            String nombreProducto = sc.nextLine();
            System.out.println("Por favor, indique el tipo del producto. (1) para papelería, (2) para supermercado, (3) para droguería" );
            int comodin = sc.nextInt();
            
            
            //System.out.println("Por favor, indique el stock del producto.");
            //int cantidadDisponible = sc.nextInt();
            //System.out.println("Por favor, indique el stock minimo del producto.");
            //int cantidadMinima= sc.nextInt();
            System.out.println("Por favor, indique el precio base del producto.");
            double precioBase=sc.nextDouble();
            //System.out.println("Por favor, indique el precio final del producto.");
            //double precioFinal=sc.nextDouble();
            arrProducto[i]= new Producto(i, nombreProducto, comodin, /*cantidadDisponible, cantidadMinima, */precioBase/*, precioFinal*/);            
        };
        
        for(int i=0; i<cantidadProductos; i+=1){
            arrProducto[i].descripcionProducto();
        };   
    };
    
    public void venderProductoACliente(Producto producto, int cantidad){
                
    }
    
    public void hacerPedidoXTopeMinimo(){
        
    }
    
    
}
