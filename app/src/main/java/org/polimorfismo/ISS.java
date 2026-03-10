package org.polimorfismo;

public class ISS extends MannedSpacecraft{
	
    private final String name = "ISS";
    private final double push = 0.2; 
    private final String energy = "Eléctrico/Solar";
    private final double weight = 420.0;    
    private final int capacity = 7;
    private final double altitude = 386.0;
    

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPush() {
		return push;
	}

	@Override
	public String getFuel() {
		return energy;
	}

	@Override
    public void showInfo() {
        System.out.printf("TRIPULADA: %s | Empuje: %.1f ton | Peso: %.0f ton%n", 
                         getName(), getPush(), weight);
        System.out.printf("   → Capacidad: %d pers | Altitud: %.0f km | %s%n", 
        		capacity, altitude, getFuel());
        System.out.println("   → NASA/Rusia/Japón/Canadá/Europa - Activa 1998");
    }

    @Override
    void conductExperiment() {
        System.out.println(getName() + " experimentos en microgravedad:");
        System.out.println("   1. Cristalización proteínas (farmacéutica)");
        System.out.println("   2. Física fluidos (ingravidez)");
        System.out.println("   3. Biología humana (efectos largo plazo)");
        System.out.println("   4. Materiales avanzados");
        System.out.println("   → Rotación: " + capacity + " astronautas / 6 meses");
    }


}
