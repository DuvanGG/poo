package org.polimorfismo;

public class NewHorizons extends RoboticShip {

	private final String name = "New Horizons";
	private final double push = 0.008;
	private final String fuel = "Hidracina";
	private final double speed = 56000;

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

    public void showInfo() {
        System.out.printf("ROBÓTICA: %s | Empuje: %.3f ton | Combustible: %s%n", getName(), getPush(), getFuel());
        System.out.printf("   → Velocidad: %.0f km/h | %d motores | 9+ años viaje%n", speed, 16);
        System.out.println("   → Primera misión a Plutón (2015)");
    }

    @Override
    public void maneuver() {
		System.out.println(getName() + " maniobra inercial:");
		System.out.println("   → Trayectoria directa sin correcciones mayores");
		System.out.println("   → 16 motores RCS: 4 principales (0.44kg) + 12 auxiliares");
		System.out.println("   → Continúa hacia Cinturón de Kuiper post-Plutón");
    }

    @Override
    void getDestination() {
        System.out.println("Plutón y Cinturón de Kuiper");

    }

    @Override
    public void explore() {
        System.out.println(getName() + " explorando con sistemas autónomos en el espacio profundo.");
    }

	@Override
	public void executeMission() {
		explore();
		
	}

}
