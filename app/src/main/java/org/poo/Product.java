package org.poo;

/**
 * Clase Product.
 * Representa un producto del catálogo con identificador, nombre, precio, stock
 * y un SKU interno utilizado para auditoría.
 */
public class Product {

    public String productId;
    public String name;
    public double price;
    protected int stockQuantity;  
    private String internalSku;  

    /** Construye un producto con datos básicos (constructor). */
    public Product(String productId, String name, double price, int stockQuantity, String internalSku) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.internalSku = internalSku;
    }

    /** Añade una cantidad del producto al carrito. */
    public void addToCart(int quantity) {
        System.out.println("Adding " + quantity + " of '" + name + "' to cart.");
    }

    /** Obtiene una representación de los detalles del producto. */
    public String getDetails() {
        return "Product{id='" + productId + "', name='" + name + "', price=" + price +
                ", stock=" + stockQuantity + ", sku='" + internalSku + "'}";
    }

    /** Actualiza el stock del producto. */
    protected void updateStock() {
        System.out.println("Updating stock for product: " + name);
    }

    /** Auditoría interna de inventario. */
    private boolean auditInventory() {
        System.out.println("Auditing inventory for SKU: " + internalSku);
        return true;
    }

    /** Obtiene el identificador del producto. */
    public String getProductId() { 
    	return productId; 
    }
    
    /** Establece el identificador del producto. */
    public void setProductId(String productId) { 
    	this.productId = productId; 
    }

    /** Obtiene el nombre del producto. */
    public String getName() { 
    	return name; 
    }
    
    /** Establece el nombre del producto. */
    public void setName(String name) { 
    	this.name = name; 
    }

    /** Obtiene el precio del producto. */
    public double getPrice() { 
    	return price; 
    }
    
    /** Establece el precio del producto. */
    public void setPrice(double price) { 
    	this.price = price; 
    }

    /** Obtiene la cantidad de stock. */
    protected int getStockQuantity() { 
    	return stockQuantity; 
    }
    
    /** Establece la cantidad de stock. */
    protected void setStockQuantity(int stockQuantity) { 
    	this.stockQuantity = stockQuantity;
    }

    /** Obtiene el SKU interno. */
    private String getInternalSku() { 
    	return internalSku;
    }
    
    /** Establece el SKU interno. */
    private void setInternalSku(String internalSku) { 
    	this.internalSku = internalSku;
    }
}
