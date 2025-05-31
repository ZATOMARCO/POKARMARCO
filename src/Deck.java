import java.util.*;

public class Deck {
    private List<Card> cartas = new ArrayList<>();
    private final String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
    private final String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    public Deck() {
        inicializarDeck();
    }

    private void inicializarDeck() {
        for (String palo : palos) {
            String color = (palo.equals("corazones") || palo.equals("diamantes")) ? "rojo" : "negro";
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void cabeza() {
        if (cartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return;
        }
        Card carta = cartas.remove(0);
        System.out.println(carta);
        System.out.println("Quedan " + cartas.size());
    }

    public void seleccionarManoAlAzar() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano de 5.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona ENTER para recibir una mano de 5 cartas al azar...");
        scanner.nextLine(); // Espera entrada del usuario

        Random rand = new Random();
        List<Card> mano = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int indice = rand.nextInt(cartas.size());
            mano.add(cartas.remove(indice));
        }

        for (Card carta : mano) {
            System.out.println(carta);
        }
        System.out.println("Quedan " + cartas.size());
    }

    public void repartirMano() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck para repartir 5.");
            return;
        }
        for (int i = 0; i < 5; i++) {
            Card carta = cartas.remove(0);
            System.out.println(carta);
        }
        System.out.println("Quedan " + cartas.size());
    }
}
