package org.poo;

/**
 * Clase Order.
 * Representa una orden de compra con identificador, monto total, estado
 * y un token de pago asociado.
 */
public class Order {

    /** Identificador de la orden. */
    public int orderId;
    
    /** Monto total de la orden. */
    public double totalAmount;
    
    /** Estado de la orden. */
    protected String status;
    
    /** Token de pago para la transacción. */
    private String paymentToken;
	
	
    /** Obtiene el token de pago. */
    public String getPaymentToken() {
        return paymentToken;
    }

    /** Establece el token de pago. */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }
	
    /** Confirma la orden. */
    public boolean confirmOrder() {
        //TODO: por implementar
        return false;
    }

    /** Cancela la orden. */
    public void cancelOrder() {
        //TODO: Por implementar
    }

    /** Calcula impuestos de la orden. */
    protected double calculateTaxes() {
        // TODO: por implementar
        return 0.0;
    }

    /** Procesa un reembolso de la orden. */
    private void processRefund() {
        // TODO: por implementar
    }

}
