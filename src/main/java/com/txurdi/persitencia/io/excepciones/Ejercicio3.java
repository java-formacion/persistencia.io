package com.txurdi.persitencia.io.excepciones;

import java.util.Scanner;

/**
 * Es un ejemplo para practicar con el debbugger y las excecpciones.
 * Este metodo main llamara a la Service que a su vez llama a la clase DAO.
 * En cualquier momento se puede producir una excepcion y deberemos saber como se propagan.
 * @author ander uraga
 *
 */
public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Comenzamos");

		try(Scanner sc = new Scanner(System.in)) {
			int resultado = Service.ejecutar(sc);
			System.out.printf("El resultado es %s \n", resultado);
			
		} catch (Exception e) {
			System.out.printf(" Excepcion %s \n", e.getMessage() );
			e.printStackTrace();
		}
		
		System.out.println("Terminamos");
		
	}

}
