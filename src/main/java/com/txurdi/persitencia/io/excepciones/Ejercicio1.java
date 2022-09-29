package com.txurdi.persitencia.io.excepciones;

import java.util.Scanner;

/**
 * Ejercicio basico para perdir un int por pantalla, sin capturar la Excepcion que pueda lanzar
 * @author ander uraga
 *
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");				
		String sEdad = sc.nextLine();
		int edad = Integer.parseInt(sEdad);
		
		System.out.printf("Tu edad es %s \n", edad);
		System.out.println("Agur");

		sc.close();
		
		
	}

}
