package org.poo;

import java.util.ArrayList;

/**
 * Clase con el modelo simple de fruta con nombre, peso promedio y colores.
 */
public class Fruta {
    
    /** Nombre de la fruta. */
    public String name;
    
    /** Peso promedio de la fruta (en gramos). */
    private float averageWeight;
    
    /** Colores disponibles de la fruta. */
    public ArrayList<String> colors;
    
    /** Obtiene el nombre. */
    public String getName() {
        return name;
    }
    
    /** Establece el nombre. */
    public void setName(String name) {
        this.name = name;
    }
    
    /** Obtiene el peso promedio. */
    public float getAverageWeight() {
        return averageWeight;
    }
    
    /** Establece el peso promedio. */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    
    /** Obtiene los colores. */
    public ArrayList<String> getColors() {
        return colors;
    }
    
    /** Establece los colores. */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
