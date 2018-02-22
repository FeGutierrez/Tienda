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
public class Main {
    
    public static void main(String[] args) {
        
        Tienda tienda = new Tienda();
        
        Scanner sc= new Scanner(System.in);
         int x = sc.nextInt() - 1;
         System.out.println(x);
        
        tienda.registrarProductosAStock();
        
        
    }
    
}


