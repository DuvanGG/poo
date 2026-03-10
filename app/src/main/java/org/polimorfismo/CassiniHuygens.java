package org.polimorfismo;

public class CassiniHuygens extends RoboticShip {
	
	private final String name = "Cassini-Huygens";
    private final double push = 0.045;
    private final String fuel = "MMH/Tetróxido de nitrógeno";
    
    
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
		return fuel;
	}

    @Override
    public void showInfo() {
        System.out.printf("ROBÓTICA: %s | Empuje: %.3f ton | Combustible: %s | Vel: 18,000 km/h%n", getName(),
                getPush(), getFuel());
        System.out.println("→ Proyecto NASA/ESA/ASI - Activa desde 2004");
    }

    @Override
    public void maneuver() {
        System.out.println("Maniobra " + getName() + "para órbita saturniana");
        System.out.println("→ 7 años de viaje | 12 instrumentos científicos");
        System.out.println("→ Huygens separado hacia Titán (2004)");
    }

	@Override
    void getDestination() {
        System.out.println("DESTINO: Saturno y lunas");
        
    }

    @Override
    public void explore() {
        System.out.println(getName() + " explorando de forma autónoma con sensores.");
    }

}
