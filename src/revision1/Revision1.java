/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revision1;

import java.util.Scanner;

/**
 *
 * @author kamal
 */
public class Revision1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);   //input from user
String word=sc.next();

char[] rev=new char[word.length()];
for(int i=0; i<word.length(); i++)      
{
    rev[i]= word.charAt(i);     //splitting the word
    }
for(int i=rev.length-1; i>=0; i--){
    System.out.print(rev[i]);     //reverse printing
}
    
}
    
}
