package edu.upc.eetac.dsa.jmale.basico;

/*
Haz un programa que lea un fichero de texto y cuente el número de caracteres que tiene. 
Además debe añadir al fichero registro.txt la fecha y hora actuales (formato “27/09/2013 20:01:23”)
 el nombre del fichero de texto y el número de caracteres. En este ejercicio usar Buffered Streams.
*/


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
//import java.util.GregorianCalendar;
//import java.util.Calendar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




public class App {
   public static void main(String[] args) throws IOException {

       ;
   	BufferedInputStream in = null;
      
   	PrintWriter out = null;

   		Date date = new Date();
   	/*Calendar calendario = new GregorianCalendar();
   	int hora, minutos, segundos, dia, mes, año;

   	hora =calendario.get(Calendar.HOUR_OF_DAY);
   	minutos = calendario.get(Calendar.MINUTE);
   	segundos = calendario.get(Calendar.SECOND);
   	dia = calendario.get(Calendar.DAY_OF_MONTH);
   	mes = calendario.get(Calendar.MONTH);
   	año = calendario.get(Calendar.YEAR);*/


       int contador = 0;
       int c=0;
 
      
       try {
           
        in = new BufferedInputStream (new FileInputStream ("fichero.txt"));	
        out = new PrintWriter(new FileOutputStream("Registro.txt"));





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

       	DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       	out.println(hourdateFormat.format(date) + " " + "fichero.txt "+ contador);
       	

       	
           System.out.println(contador);
           
       	 if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

   }
   }
}


