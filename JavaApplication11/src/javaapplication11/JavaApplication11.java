/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaApplication11 {

   static int liczslowa(String string)  
        {  
          int count=0;
  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) || (ch[i-1]==','))
                    count++;  
            }  
            
            
            return count;  
        }  
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan=new Scanner(System.in);
        String string=scan.nextLine();
        int licz=liczslowa(string);
        if(licz==0){
        System.out.println("help");
                } else
        System.out.println(liczslowa(string) + " slow."); 
        
         File file = new File("file.txt");
            try(Scanner sc = new Scanner(new FileInputStream(file))){
            int count=0;
                while(sc.hasNext()){
                    sc.next();
                    count++;
                                    }
        System.out.println("Ilosc slow: " + count);
}
    }
    
}
