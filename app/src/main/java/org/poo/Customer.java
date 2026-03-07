package org.poo;

import java.util.List;

/**
 * Clase Customer.
 * Representa un cliente del sistema con identificador, nombre, email
 * y contraseñas hash y direcciones asociadas.
 * Nota: la exposición de campos públicos podría favorecer encapsulación
 * adicional (private con getters/setters) para mejorar la seguridad.
 */
public class Customer {

    /** Identificador del cliente. */
    public String customerId;
    
    /** Nombre del cliente. */
    public String name;
    
    /** Correo electrónico del cliente. */
    public String email;
    
    /** Hash de la contraseña del cliente. */
    private String passwordHash;
    
    /** Direcciones del cliente. */
    protected List<Addres> addresses;

	public Customer(String customerId, String name, String email, String passwordHash, List<Addres> addresses) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.passwordHash = passwordHash;
		this.addresses = addresses;
	}

	public Order placeOrder() {
		// TODO : Pendiente de implementación
		return new Order();
	}

	public List<Order> viewOrders() {
		// TODO : Pendiente de implementación
		return null;
	}

	public boolean validateCredentials() {
		// TODO : Pendiente de implementación
		return false;
	}

	protected void updateProfile() {
		// TODO : Pendiente de implementación
	}
	
	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

}
