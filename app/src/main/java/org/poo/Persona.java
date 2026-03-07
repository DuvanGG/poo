package org.poo;

import java.util.Date;

/**
 * Clase que modela a una persona con información básica.
 * Atributos expuestos mediante getters y setters.
 * 
 * Nota: Los atributos actuales son públicos, se puede mejorar la encapsulación 
 * al pasarlos a privados y dejando el acceso solo mediante los getters y setters.
 * 
 */
public class Persona {

	/** Nombre de la persona. */
	public String name;
	
	/** Primer apellido. */
	public String lastName1;
	
	/** Segundo apellido. */
	public String lastName2;
	
	/** Fecha de nacimiento. */
	public Date dateBirth;
	
	/** Altura de la persona. */
	public float height;

	/** Obtiene el nombre. */
	public String getName() {
		return name;
	}

	/** Establece el nombre. */
	public void setName(String name) {
		this.name = name;
	}

	/** Obtiene el primer apellido. */
	public String getLastName1() {
		return lastName1;
	}

	/** Establece el primer apellido. */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	/** Obtiene el segundo apellido. */
	public String getLastName2() {
		return lastName2;
	}

	/** Establece el segundo apellido. */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	/** Obtiene la fecha de nacimiento. */
	public Date getDateBirth() {
		return dateBirth;
	}

	/** Establece la fecha de nacimiento. */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	/** Obtiene la altura. */
	public float getHeight() {
		return height;
	}

	/** Establece la altura. */
	public void setHeight(float height) {
		this.height = height;
	}
	
}
