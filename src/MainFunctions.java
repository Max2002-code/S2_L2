import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainFunctions {

    // Funzione per generare una lista ordinata di N interi casuali da 0 a 100
    public static List<Integer> generaListaCasuale(int N) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101)); // Numeri casuali da 0 a 100 inclusi
        }
        Collections.sort(lista); // Ordina la lista
        return lista;
    }

    // Funzione per creare una nuova lista con gli elementi seguiti dall'inverso
    public static List<Integer> invertiLista(List<Integer> inputList) {
        List<Integer> nuovaLista = new ArrayList<>(inputList);
        Collections.reverse(nuovaLista); // Inverte la lista
        inputList.addAll(nuovaLista); // Aggiunge gli elementi invertiti alla fine della lista originale
        return inputList;
    }

    // Funzione per stampare i valori in posizioni pari o dispari
    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        System.out.println("Valori in posizioni " + (pari ? "pari" : "dispari") + ":");
        for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {
        // Utilizzo delle funzioni
        List<Integer> listaCasuale = generaListaCasuale(10);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaInvertita = invertiLista(listaCasuale);
        System.out.println("Lista con elementi seguiti dall'inverso: " + listaInvertita);

        stampaPosizioni(listaCasuale, true); // Stampa valori in posizioni pari
        stampaPosizioni(listaCasuale, false); // Stampa valori in posizioni dispari
    }
}
