package edu.upc.eetac.dsa.jmale.basico;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;


public class Ejercicio6 {
	

    public static void main( String[] args )
    {
    	BufferedReader in = null;
    	BufferedReader in2 = null;

    	PrintWriter out = null;
    	         String c = null;
         
         String c2 =null;
         String num1 , num2;
         


   
     

         // in = new BufferedReader (new FileReader ("Registro.txt"));	
          Scanner s = null;
          Scanner n = null;

          double sum = 0;
          

          try {
              s = new Scanner(new BufferedReader(new FileReader("Registro.txt")));
              s.useLocale(Locale.US);
              n = new Scanner(new BufferedReader(new FileReader("Registroejercicio5.txt")));
              n.useLocale(Locale.US);

              while (s.hasNext()) {

        	  
            	  s.next();
            	  c= s.next();



           }
              while (n.hasNext()) {

            	  
            	  n.next();
            	  c2= n.next();



           }
              


          
         
         }
          
          
          catch (FileNotFoundException e) {
              System.err.println("FileNotFoundException: " + e.getMessage());
             

          } 
          finally {
        	  
        	  int x ,y;
              x  = Integer.parseInt(c);
              y = Integer.parseInt(c2);
              if (x >= y)
            	  System.out.println("Registro.txt y tiene tantos carácteres " + c);
              else
            	  System.out.println("Registroejercicio5.txt y tiene tantos bytes " + c2);
            	  

        	  if (s != null) {
                s.close();
              }
        	  if (n != null) {
                  n.close();
                }
              
          }
          
          
         }
    }
         
    
    
      
  



