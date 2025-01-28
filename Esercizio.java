//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String c;
        int n, i, e;
        System.out.println("Inserisci la dimensione del vettore: ");
        n = input.nextInt();
        int[] v = new int[n * 10];
        azzeraVettore(v, n);
        do {
            c = leggiComando();
            if (c.equals("I")) {
                System.out.println("Valore da inserire");
                e = input.nextInt();
                do {
                    System.out.println("In quale posizione?");
                    i = input.nextInt();
                } while (i < 0 || i >= n);
                n = inserisciInVettore(v, n, e, i);
            }
            if (c.equals("E")) {
                do {
                    System.out.println("Quale cella del vettore eliminare? (indice)");
                    i = input.nextInt();
                } while (i < 0 || i >= n);
                n = eliminaDaVettore(v, n, i);
            }
            if (c.equals("R")) {
                System.out.println("Valore da cercare");
                e = input.nextInt();
                i = ricercaNelVettore(v, n, e);
                if (i >= 0) {
                    System.out.println("elemento " + e + " trovato in posizione " + i);
                } else {
                    System.out.println("Elemento " + e + " non trovato.");
                }
            }
            if (c.equals("D")) {
                System.out.println("Rimozione dei duplicati");
                n = rimuoviDuplicati(v, n);
            }
            if (c.equals("V")) {
                visualizzaVettore(v, n);
            }
        } while (!c.equals("X"));
    }
    
    public static void azzeraVettore(int[] v, int n) {
        int i;
        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
    }
    
    public static int eliminaDaVettore(int[] v, int n, int i) {
        int n2, j;
        n2 = n;
        int[] w = new int[n - 1];
        for (j = 0; j <= i - 1; j++) {
            w[j] = v[j];
        }
        for (j = i + 1; j <= n - 2; j++) {
            w[j] = v[j + 1];
        }
        for (j = 0; j <= n - 2; j++) {
            v[j] = w[j];
        }
        n2 = n - 1;
        
        return n2;
    }
    
    public static int inserisciInVettore(int[] v, int n, int e, int i) {
        int nDimensione;
        nDimensione = n;
        int[] w = new int[n + 1];
        int j;
        for (j = 0; j <= i - 1; j++) {
            w[j] = v[j];
        }
        w[i] = e;
        for (j = i + 1; j <= n; j++) {
            w[j] = v[j - 1];
        }
        for (j = 0; j <= n; j++) {
            v[j] = w[j];
        }
        nDimensione = n + 1;
        
        return nDimensione;
    }
    
    public static String leggiComando() {
        String c;
        do {
            System.out.println("1. [I]Inserisci elemento " + (char) 10 + "2. [E]Elimina elemento " + (char) 10 + "3. [R]Ricerca valore " + (char) 10 + "4. [D]Elimina Duplicati " + (char) 10 + "5. [V]Visualizza vettore " + (char) 10 + "6. [X]Esci");
            c = input.nextLine();
        } while (!c.equals("I") && !c.equals("E") && !c.equals("R") && !c.equals("D") && !c.equals("V") && !c.equals("X"));
        
        return c;
    }
    
    public static int ricercaNelVettore(int[] v, int n, int valore) {
        int i;
        i = 0;
        
        return i;
    }
    
    public static int rimuoviDuplicati(int[] v, int n) {
        int n2;
        n2 = n;
        
        return n2;
    }
    
    public static void visualizzaVettore(int[] v, int n) {
        int i;
        i = 0;
        while (i < n) {
            System.out.println(v[i]);
            i = i + 1;
        }
    }
}



//LEGGERE LE ISTRUZIONI NEL FILE README.md