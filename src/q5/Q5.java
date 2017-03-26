/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author AhmetALBAYRAK
 */
public class Q5 {
    public static void main(String[] args) { 
        Runtime rt = Runtime.getRuntime();
	String str1 = "abc";
        System.out.println("Total memory "+rt.totalMemory());
	System.out.println("Free memory: "+ rt.freeMemory());
	String str2 = new String("abc");
        System.out.println("Total memory "+rt.totalMemory());
	System.out.println("Free memory: "+ rt.freeMemory());
	String str3 = "abc";
        System.out.println("Total memory "+rt.totalMemory());
	System.out.println("Free memory: "+ rt.freeMemory());
		
	str1=null;
	str2=null;
	str3=null;
		
        rt.gc();
	System.out.println("Total memory "+rt.totalMemory());
	System.out.println("Free memory: "+ rt.freeMemory());
    }
    
}
