/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author piyus
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str1 = s1.next();
        char[] reverse = new char[str1.length()];
        for(int i = 0; i<str1.length() ;i++){
            reverse[i] = str1.charAt(i);
        }
        for(int i = str1.length()-1 ; i >=0 ;i--){
            System.out.println(reverse[i]);
            /*modification  */
        
    }
        
  
        
        
        
        
        
    }
    
}
