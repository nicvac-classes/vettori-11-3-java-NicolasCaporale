//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {


    static void aggiungiElemento() {

    }
    static void rimuoviElemento() {

    }
    static void cercaNelVettore(int array[], int valore, int lunghezza) {
        int indice, trovato;
        trovato = 0;
        while (indice = 0 && trovato < lunghezza) {
            if (valore == array[trovato]) {
                indice = trovato;
            }
        }
    }
    static void eliminaRipetizioni() {

    }
    static void mostraVettore(int array[], int lunghezza) {
        for (int indice = 0; indice < lunghezza; indice++) {
            System.out.println((indice + 1) + "° numero: " + array[indice]);
        }
    }

    public static void Main(String args[]) {

        Scanner input = new Scanner(System.in);
        int dimensione, scelta, numero;

        System.out.print("Inserire grandezza vettore: ");
        dimensione = input.nextInt();
        int[] array = new int[dimensione];

        for (int indice = 0; indice < dimensione; indice++) {
            array[indice] = 0;
        }

        do {
            System.out.println("Scegli un'opzione: \n 1. Aggiungi elemento \n 2. Rimuovi elemento \n 3. Cerca elemento \n 4. Elimina ripetizioni \n 5. Mostra vettore \n 6. Esci");
            System.out.print("Input: ");
            scelta = input.nextInt();
            if (scelta == 1) {
                aggiungiElemento();
            }
            if (scelta == 2) {
                rimuoviElemento();
            }
            if (scelta == 3) {
                System.out.println("Inserire valore da cercare: ");
                numero = input.nextInt();
                cercaNelVettore(array, numero, dimensione);
                System.out.println("Il valore è presente nella posizione: " + numero);
            }
            if (scelta == 4) {
                eliminaRipetizioni();
            }
            if (scelta == 5) {
                mostraVettore(array, dimensione);
            }
            if (scelta < 1 || scelta > 6) {
                System.out.println("Inserire un valore valido");
            }
        } while (scelta != 6);
    }
}


//LEGGERE LE ISTRUZIONI NEL FILE README.md