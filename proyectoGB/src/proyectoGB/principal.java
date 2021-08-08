package proyectoGB;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion = 0;
		int minutosTotales = 0;
		int contador = 0;

		objetos acts = new objetos();

		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Bienvenido a tu Organizador Diario. Por favor, ingresa tu nombre:");
		String nombusuario = scan.next();
		System.out.println("Cuantas actividades planeas realizar? ");
		int actividades = scan.nextInt();
		objetos aActs[] = new objetos[actividades];
		System.out.println("¡Hola " + nombusuario + "! ¿Te gustaría ver cómo se utiliza tu Organizador Diario?");
		
		System.out.println("oprime 1 si sí.");
		System.out.println("oprime 2 si no.");
		int op1 = scan.nextInt();

		while (op1 != 1 && op1 != 2) {
			System.out.println("Caracter inválido, ingrese uno válido.");
			op1 = scan.nextInt();
		}
		if (op1 == 1) {
			System.out.println("¡Fantástico! Empecemos.");
		} else {

			System.out.println("De acuerdo, ya puedes comenzar a utilizar tu Organizador Diario");
			

			do {

				System.out.println("actividad: ");
				acts.nombreActividad = scan1.nextLine();

				System.out.println("Duracion (en minutos): ");
				acts.minutosDeLaActividad = scan1.nextInt();

				scan1.nextLine();

				aActs[posicion] = acts;
				minutosTotales += acts.minutosDeLaActividad;
				posicion++;
				contador++;
			} while (contador < aActs.length);
			System.out.println("Vas a invertir " + minutosTotales + " minutos en " + aActs.length + " actividades");
		}

		System.out.println("¿Deseas continuar con los datos que ingresaste?");
		String decision = scan1.nextLine();
		if (decision.equalsIgnoreCase("no")) {
			System.out.println("Esta bien. Ahora puedes volver a ingresar los datos ");
			
			posicion = 0;
			contador = 0;
			minutosTotales = 0;
			do {
				
				System.out.println("actividad: ");
				acts.nombreActividad = scan1.nextLine();

				System.out.println("Duracion (en minutos): ");
				acts.minutosDeLaActividad = scan1.nextInt();

				scan1.nextLine();

				aActs[posicion] = acts;
				minutosTotales += acts.minutosDeLaActividad;
				contador++;
				posicion++;
			} while (contador < aActs.length);
			System.out.println("Vas a invertir " + minutosTotales + " minutos en " + aActs.length + " actividades");
			System.out.println("¿Deseas continuar con los datos que ingresaste?");
			String decision2 = scan1.nextLine();
			if (decision2.equals("no")) {
				System.out.println("no moleste, viejo tonto, ya vuelva a inicar :*");
			}
		} else {
			System.out.println("¡Perfecto!");
			objetos aActsDesordenado [] = new objetos [actividades];
			
			
		}

	}
}
