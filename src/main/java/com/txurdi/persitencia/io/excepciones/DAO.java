package com.txurdi.persitencia.io.excepciones;

import java.util.Scanner;

public class DAO {

	public  static int ejecutar(Scanner sc) throws Exception {
		System.out.println("ejecutando DAO");		
		return Utilidades.pedirEdad(sc);
	}
	
}
