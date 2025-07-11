import java.util.Arrays; //Se importa la clase Arrays
// Ejercicio 6: Crea un programa que genere 20 números enteros aleatorios comprendidos entre 20 y 400 (incluidos),
public class Codigo6 {
	public static void main(String[] args) {
		int[] n = new int[20];

		for (int i = 0; i < 20; i++) { //faltaba un +
			n[i] = (int)(Math.random() * 381) + 20;
			System.out.print(n[i] + " ");
		}

		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		int opcion = Integer.parseInt(System.console().readLine()); //Faltaba un parentesis de cierre

		int multiplo = (opcion == 1) ? 5 : 7; //Se cambian de lugar los simbolos de asignación para que se ajuste a la opción seleccionada

		for (int e : n) {
			if (e % multiplo == 0) {
				System.out.print("[" + e + "] ");
			} else {
					System.out.print(e + " ");
				}
			break; // se agrega un break para salir del bucle después de imprimir el primer número resaltado
			}

		}
	}


