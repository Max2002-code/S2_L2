import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire il numero di elementi
        System.out.print("Inserisci il numero di parole: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consuma il resto della riga

        // Crea un HashSet per memorizzare le parole distinte
        Set<String> paroleDistinte = new HashSet<>();

        // Crea un HashSet per memorizzare le parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();

        // Chiedi all'utente di inserire le parole e aggiungile all'HashSet
        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci la parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            // Controlla se la parola è già presente nel set delle parole distinte
            if (!paroleDistinte.add(parola)) {
                // Se la parola è già presente, aggiungila al set delle parole duplicate
                paroleDuplicate.add(parola);
            }
        }

        // Stampa le parole duplicate
        System.out.println("Parole Duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        // Stampa il numero di parole distinte
        System.out.println("Numero di Parole Distinte: " + paroleDistinte.size());

        // Stampa l'elenco delle parole distinte
        System.out.println("Parole Distinte:");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }
    }
}
