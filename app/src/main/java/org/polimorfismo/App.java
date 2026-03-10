package org.polimorfismo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("Seleccione tipo de nave a crear: 1 CassiniHuygens, 2 NewHorizons, 3 ISS, 4 SaturnoV, 0 Salir");
			String line = scanner.nextLine();
			int option;
			try {
				option = Integer.parseInt(line);
			} catch (Exception e) {
				System.out.println("Entrada no válida. Intente de nuevo.");
				continue;
			}
			ISpacecraft scObj = null;
			switch (option) {
				case 1:
					scObj = new CassiniHuygens();
					break;
				case 2:
					scObj = new NewHorizons();
					break;
				case 3:
					scObj = new ISS();
					break;
				case 4:
					scObj = new SaturnoV();
					break;
				case 0:
					running = false;
					continue;
				default:
					System.out.println("Opción no válida");
					continue;
			}
			if (scObj != null) {
				scObj.showInfo();
				System.out.println("  - Name: " + scObj.getName() + " | Push: " + scObj.getPush() + " | Fuel: " + scObj.getFuel());
				scObj.executeMission();
			}
		}
		scanner.close();
	}
}
