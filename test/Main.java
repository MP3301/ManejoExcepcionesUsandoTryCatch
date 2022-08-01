/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author
 * x
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        int resultado = 10;
        
        try {
            resultado = 10/0;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
        System.out.println("resultado="+resultado);
    }
    
}
