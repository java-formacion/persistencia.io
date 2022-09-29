package com.txurdi.persitencia.io.excepciones;

import java.util.Scanner;

/**
 * 
 * Ejercicio basico para perdir un int por pantalla, Capturando la Excepcion que
 * pueda lanzar y solicitamos de nuevo la edad al usuario. La edad debe estar
 * comprendida entre 0 y 120 años.
 * 
 * @author ander uraga
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		do {
			try {
				System.out.println("Dime tu edad");
				String sEdad = sc.nextLine();
				int edad = Integer.parseInt(sEdad);
				
				if ( edad > 0 && edad <= 120) {				
					System.out.printf("Tu edad es %s \n", edad);
					flag = false;
				}else {	
					System.out.println("No es correcta la edad, debe estar comprendida entre 0 y 120");
				}

			} catch (Exception e) {
				System.out.println("No es correcta la edad, debe estar comprendida entre 0 y 120");

			}
		} while (flag);
		System.out.println("Agur");
		sc.close();

	}

}
