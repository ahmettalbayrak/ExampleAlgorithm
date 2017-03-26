/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Arrays;

/**
 *
 * @author AhmetALBAYRAK
 */
public class Q1 {

    static int aCount=0;
    static int itemValueCountA=0; 
    static String[] array={"aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l"};
    static String[] tempArray= new String[array.length];

    public static void control(String value){
        int getValueCountA = getACount(value);
        for (int i = 0; i < tempArray.length; i++) {
            itemValueCountA = getACount(tempArray[i]); 
            //Gelen String'in a değeri Arraydeki elemanın a değerinden fazla ise
            if(getValueCountA > itemValueCountA){
                for (int j = tempArray.length-1; j >i ; j--) {
                    tempArray[j]=tempArray[j-1];
                }
                tempArray[i]=value;
                break;
            //Gelen String'in ve Arraydeki elemanın A değerleri sıfır ise    
            }else if(getValueCountA==0 && itemValueCountA==0){           
                
                if(tempArray[i]==null)
                    tempArray[i]="";
                if(value.length() > tempArray[i].length()){                    
                    for (int j = tempArray.length-1; j >i ; j--) {
                    tempArray[j]=tempArray[j-1];
                }
                tempArray[i]=value;
                break;
                }
            }else if(tempArray[i]==null){
                tempArray[i]=value;
                break;
            }
        }
    }    
    
    public static void sort(){       
        for (int i = 0; i < array.length; i++) {
            control(array[i]);
        }
    }
    
    public static int getACount(String value){
        aCount=0;
        if(value!=null){
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i)=='a'){
                    aCount++;
            }
        }
        }
        return aCount;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        sort();
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }
       
    }
    
}
