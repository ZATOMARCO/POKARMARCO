import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck mazo = new Deck();

        int opcion;

        do {
            System.out.println("\n--- MENÚ DEL DECK DE CARTAS ---");
            System.out.println("1. Mezclar el mazo");
            System.out.println("2. Mostrar la primera carta (cabeza)");
            System.out.println("3. Seleccionar una mano al azar (5 cartas)");
            System.out.println("4. Repartir una mano desde arriba (5 cartas)");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mazo.mezclar();
                    break;
                case 2:
                    mazo.cabeza();
                    break;
                case 3:
                    mazo.seleccionarManoAlAzar();
                    break;
                case 4:
                    mazo.repartirMano();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el programa!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
