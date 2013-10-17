package edu.upc.eetac.dsa.jmale.basico;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ejercicio7 implements Serializable {

	//Este ejercicio no hemos sido capaces de hacerlo. 


	private static final long serialVersionUID = 4543501059994504708L;
	public int i;
	public char c;
	public String s;
	
	public static void main(String[] arg) throws IOException {
		
		Ejercicio7 d1= new Ejercicio7();
		Ejercicio7 d2 = new Ejercicio7();
		Ejercicio7 d3 = new Ejercicio7();
		
		d1.i=121;
		d2.c=('c');
		d3.s=("string");
		
		
		
		
		try {
			
			
		    
			FileOutputStream fileOut=new FileOutputStream("fichero.txt");
			ObjectOutputStream salida=new ObjectOutputStream(fileOut);
		      salida.writeObject(d1);
		      salida.writeObject(d2);
		      salida.writeObject(d3);
		      salida.close();
					      
	  
		      
		     
		      
			
			
		}

		catch (FileNotFoundException error) {
			error.printStackTrace();
		} 
		
		
		
		
		
		
		
	}
	
}
