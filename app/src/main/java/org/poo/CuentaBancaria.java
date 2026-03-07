package org.poo;

/**
 * Clase CuentaBancaria.
 * Representa una cuenta bancaria simple con un número de cuenta y un estado de activación.
 * 
 * Nota: el campo protected cualquier subclase puede hacer modificación y se rompe 
 * el encapsulamiento.
 */
public class CuentaBancaria {
    
    /** Número de cuenta. */
    private int accountNumber;
    
    /** Indica si la cuenta está activada. */
    protected boolean activated;

    /** Obtiene el número de cuenta. */
    public int getAccountNumber() {
        return accountNumber;
    }

    /** Establece el número de cuenta. */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /** Indica si la cuenta está activada. */
    public boolean isActivated() {
        return activated;
    }

    /** Establece el estado de activación de la cuenta. */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}
