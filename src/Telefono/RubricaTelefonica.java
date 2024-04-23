package Telefono;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private final Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    // Metodo per l'inserimento di una coppia <Nome, telefono>
    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    // Metodo per la cancellazione di una coppia <Nome, telefono> a partire dal nome
    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    // Metodo per la ricerca di una Persona di cui si conosce il numero di telefono
    public String cercaPersonaDaNumero(String telefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null; // Restituisce null se il numero non è presente nella rubrica
    }

    // Metodo per la ricerca del numero di telefono di una Persona di cui si conosce il Nome
    public String cercaNumeroDaNome(String nome) {
        return rubrica.get(nome);
    }

    // Metodo per stampare tutti i contatti con nome e numero
    public void stampaRubrica() {
        System.out.println("Rubrica Telefonica:");
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        rubrica.inserisciContatto("Mario", "123456789");
        rubrica.inserisciContatto("Luigi", "987654321");
        rubrica.inserisciContatto("Giovanna", "456789123");

        rubrica.stampaRubrica();

        String nomeDaCercare = "Mario";
        String numeroDaCercare = "987654321";

        System.out.println("Il numero di telefono di " + nomeDaCercare + " è: " + rubrica.cercaNumeroDaNome(nomeDaCercare));
        System.out.println("Il nome della persona con numero " + numeroDaCercare + " è: " + rubrica.cercaPersonaDaNumero(numeroDaCercare));

        rubrica.cancellaContatto("Giovanna");

        rubrica.stampaRubrica();
    }
}
