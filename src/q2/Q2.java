/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author AhmetALBAYRAK
 */
public class Q2 {
    
    /*public static int exampleRecursive(int sayi){
        
        int s1 = sayi;
        if (sayi == 2) {
            s1 = 2;
        } else {
            s1 = exampleRecursive(sayi / 2);
        }
        System.out.println(sayi);
        return s1;       
    }   */ 
    
    public static void exampleRecursive(int d){
        if (d/2>1) {
            exampleRecursive(d/2);            
        }
        System.out.println(d);
        
    }
    
    public static void main(String[] args) {
        exampleRecursive(9);
        
    }
}
