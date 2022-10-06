package com.txurdi.persitencia.serializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.txurdi.persitencia.pojo.Persona;

/**
 * Programa que escribe 3 objetos de tipo Persona en el fichero
 * personas-serializadas.dat.
 * 
 * @author Ander Uraga
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Se crea el fichero
		try (
				FileOutputStream fos = new FileOutputStream("personas-serilizadas.dat");
				ObjectOutputStream salida = new ObjectOutputStream(fos);
			) {

			// Se crea el primer objeto Persona
			Persona p = new Persona("Lucas González", 30);
			// Se escribe el objeto en el fichero
			salida.writeObject(p);

			// Se crea el segundo objeto Persona
			p = new Persona("Anacleto Jiménez", 28);
			// Se escribe el objeto en el fichero
			salida.writeObject(p);

			// Se crea el tercer objeto Persona
			p = new Persona("María Zapata", 35);
			// Se escribe el objeto en el fichero
			salida.writeObject(p);

		} catch (FileNotFoundException e) {
			System.out.println("1" + e.getMessage());
		} catch (IOException e) {
			System.out.println("2" + e.getMessage());
		}

	}

}
