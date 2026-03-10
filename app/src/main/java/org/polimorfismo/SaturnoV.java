package org.polimorfismo;

public class SaturnoV extends Shuttle {

	private final String name = "Saturno V";
	private final double push = 3500.0;
	private final String fuel = "Hidrógeno/Oxígeno líquido";
	private final double capacity = 118.0;

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
		System.out.printf("LANZADERA: %s | Empuje: %.0f ton | Combustible: %s%n", getName(), getPush(), getFuel());
		System.out.printf("   → Capacidad LEO: %.0f ton | Altura: 110m | %d caballos x5 motores%n", capacity,
				32000);
		System.out.println("   → Transportó Apolo a la Luna (1969-1973)");
	}

	@Override
	void launch() {
		System.out.println(getName() + " INICIANDO SECUENCIA DE LANZAMIENTO:");
		System.out.println("   1. F-1 motores (1ra etapa): 3500 ton empuje");
		System.out.println("   2. Apolo separada | 118 ton a LEO");
		System.out.println("   3. Trayectoria translunar");
		System.out.println("   → ¡Hacia la LUNA!");
	}
	
	public void launch(double cargaTon) {
		System.out.printf("toneladas a órbita baja terrestre%n", getName(), cargaTon);
		if (cargaTon <= capacity) {
			System.out.println("Carga dentro de límites operativos");
		} else {
			System.out.println("Carga excede capacidad máxima");
		}
	}

	@Override
	public void executeMission() {
		launch();
	}

}
