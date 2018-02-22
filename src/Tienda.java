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
    
        //System.out.println("Ingrese cantidad de productos a registrar.");        
        int cantidadProductos = sc.nextInt();
        Producto arrProducto[] = new  Producto[cantidadProductos];
        //sc.nextLine();
      
    public void registrarProductosAStock(){
        
        
        for (int i=0; i<cantidadProductos; i+=1){
            System.out.println("Por favor, indique el nombre del producto." );
            String nombreProducto = sc.nextLine();
            System.out.println("Por favor, indique el tipo del producto. (1) para papelería, (2) para supermercado, (3) para droguería" );
            int tipo = sc.nextInt();
            
            System.out.println("Por favor, indique el precio base del producto.");
            double precioBase=sc.nextDouble();            
            arrProducto[i]= new Producto(i+1, nombreProducto, tipo, precioBase);            
        };
        
        for (int i = 0; i < cantidadProductos; i++) {
            arrProducto[i].determinarValorFinal(arrProducto[i].codigoTipo);
        };
        
        
        for(int i=0; i<cantidadProductos; i+=1){
            System.out.println("Producto (" + i+1 +")");
            arrProducto[i].descripcionProducto();
        }; 
    };
    
    public void definirTopeMinimo(){
        System.out.println("Digite el ID del producto. ");
        int x = sc.nextInt() - 1;
        
    }
    
    
    
    public void venderProductoACliente(Producto producto, int cantidad){
                
    }
    
    public void hacerPedidoXTopeMinimo(){
        
    }
    
    
}
