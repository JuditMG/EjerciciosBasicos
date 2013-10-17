package edu.upc.eetac.dsa.jmale.basico;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 Similar al ejercicio 4.- pero leemos un fichero tipo JPG y contamos el número de bytes.
 **/
public class Ejercicio5 
{
    public static void main( String[] args )
    {
    	BufferedInputStream in = null;
		Date date = new Date();

    	PrintWriter out = null;
    	
    	 int contador = 0;
         int c=0;
   
        
         try {
             
          in = new BufferedInputStream (new FileInputStream ("images.jpg"));	
          out = new PrintWriter(new FileOutputStream("Registroejercicio5.txt"));





             while ((c = in.read()) != -1) {
             	
                 contador++;
  
                 
             }
             
         } 
         
         catch (FileNotFoundException e) {
             System.err.println("FileNotFoundException: " + e.getMessage());
            

         } catch (IOException e) {
             System.err.println("Caught IOException: " + e.getMessage());
         }
         finally {
            
         	/*out.println("la FECHA ACTUAL ES:"+ dia + "/" + mes + "/" + año + " " + hora + ":" + minutos + ":" + ":" + segundos );
         	//formato “27/09/2013 20:01:23” */

         	DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
           	out.println(hourdateFormat.format(date) + " " + "fichero.txt "+ contador);


         	
             System.out.println(contador);
             
         	 if (in != null) {
                  //in.close();
              }
              if (out != null) {
                  out.close();
              }

     }
     }
 }

