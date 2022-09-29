package com.txurdi.persitencia.binarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que lee enteros por teclado y los escribe en el fichero datos.dat.
 * La lectura de datos acaba cuando se introduce -1
 * 
 * @author ander uraga
 *
 */
public class Binarios1 {

	public static void main(String[] args) {
		 
		
		int n;
		
		try (Scanner sc = new Scanner(System.in) ) {

			File carpeta = new File("datos.dat");
			if (!carpeta.exists()) {
				carpeta.createNewFile();
			}

			try( FileOutputStream fos = new FileOutputStream(carpeta);
				 DataOutputStream salida = new DataOutputStream(fos);
				) {			
			
				
				System.out.print("Introduce número entero. -1 para acabar: ");
				n = sc.nextInt();
	
				while (n != -1) {
					salida.writeInt(n); // se escribe el número entero en el fichero
					System.out.print("Introduce número entero. -1 para acabar: ");
					n = sc.nextInt();
				}
				
			}	
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} 
	}// main

}
