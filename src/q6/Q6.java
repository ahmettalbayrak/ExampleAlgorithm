/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.util.Arrays;

/**
 *
 * @author AhmetALBAYRAK
 */
public class Q6 {
    
    static String[] array = {"apple","pie","apple","red","red","red"};
    static String[] array2 = {"banana","banana","apple","blue","blue","red","banana","banana","banana"};
    //static String[] array2= new String[array.length];
    
    static String array(String[] getArray){
        int count=0;
        String maxString="";
        int stringCount=0;
        
        for (int i = 0; i < getArray.length; i++) {
            count=0;
            for (int j = 0; j < getArray.length; j++) { 
                
                if(getArray[i]==getArray[j]){
                    //System.out.println(array[i]+" "+array[j]);
                    count++;  
                }
            }
            if(count>stringCount){
                stringCount=count;
                maxString=getArray[i];
            }
        }
        return maxString;
    }
    
    public static void main(String[] args) {
        System.out.println("Most Repeated : "+array(array));
        System.out.println("Most Repeated : "+array(array2));
        //for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
        //}
    }
}
