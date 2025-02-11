import java.util.Scanner;

class Esercizio {
    // Il programma parte con una chiamata a main().

    static int InserisciElemento(int[] V, int dimensione, int valore, int i){
        int nDimensione;

        int[] W = new int[dimensione + 1];
        for(int j = 0; j < i; j++){
            W[j] = V[j];
        }
        W[i] = valore;
        for(int j = i+1; j <= dimensione; j++){
            W[j] = V[j-1];
        }
        for(int j = 0; j <= dimensione; j++){
            V[j] = W[j];
        }

        nDimensione = dimensione + 1; 
        return nDimensione;
    }
    static int EliminaElemento(int[] V, int N, int ie){
        int N2;
        int i;
        N2 = N-1;
        int[] W = new int[N2];

        i = 0;
        while(i <= ie-1 && i < N){
            W[i] = V[i];
            i++;
        }

        i = ie+1;
        while(i < N){
            W[i-1] = V[i];
            i++;
        }

        i = 0;
        while(i < N2){
            V[i] = W[i];
            i++;
        }

        return N2;
    }
    static int ricercaNelVettore(int[] V, int dimensione, int valore){

        int i, j;
        i = -1;
        j = 0;
        while(i == -1 && j < dimensione){
            if(valore == V[j]){
                i = j;
            }
            j++;
        }
        return i;
    }

    static int ElminaDuplicati(int[] V , int N){
        int i, j , k;
        int N2;
        int[] W = new int[N];
        boolean spot = false;

        k = 0;
        i = 0;
        while (i < N) {
            spot = false;
            j = i + 1;
            while (j <  N && spot == false) {
                if(V[i] == W[j]){
                    spot = true;
                }
                j++;
            }
            if(spot == false){
                W[k] = V[i];
                k++;
            }
            i++;
        }
        
        for(i = 0; i < k; i++){
            V[i] = W[i];
        }

        N2 = k;

        return N2;
    }

    static void VisualizzaVettore(int[] V, int dimensione){
        for(int i = 0; i < dimensione; i++){
            System.out.println((i+1) + "Â° numero: " + V[i]);
        }
    }

    static int EliminaElementiOtt(int[] V, int N, int ie){
        int N2;
        int i;
        N2 = N - 1;
    
        i = ie;
        while(i <= N-2){
            V[i] = V[i+1];
            i = i+1;
        }       
        return N2;
    }

    static int InserisciElementoOtt(int[] V, int N, int e, int ie){
        int i;
        int N2;
        N2 = N + 1;
        for(i = N; i <= ie + 1; i--){
            V[i] = V[i-1];
        }
        V[ie] = e;
        return N2;
    }

    static int EliminaDuplicatiOtt(int[] V, int N){
        int N2;
        int i,j;
        
        i = 0;
        while(i < N-1){
            j = i + 1;
            while(j < N){
                if(V[i] == V[j]){
                    N = EliminaElementiOtt(V, N, j);
                }else{
                    j++;
                }
            }
            i++;
        }

        N2 = N;
        return N2;
    }

    //MAIN

    public static void main(String args[])
    {

        Scanner in = new Scanner( System.in );
        int N, o , valore,i;

        System.out.print("Inserire grandezza vettore: ");
        N = in.nextInt();
        int[] V = new int[N*10];
        
        for(i=0; i<N; i++){
            V[i] = 0;    
        }

        do{
            System.out.println("Scegli un'opzione: \n 1. Inserisci elemento \n 2. Elimina elemento \n 3. Ricerca elemento \n 4. Elimina duplicati \n 5. Visualizza vettore \n 6. Elimina Elemento Ott. \n 7. Inserisci Elemento Ott. \n 8. Elimina Duplicati Ott. \n 9.Esci ");
            System.out.print("Input: ");
            o = in.nextInt();
            if(o == 1){
                System.out.print("Inserire il valore da aggiungere: ");
                valore = in.nextInt();
                do{
                    System.out.print("Inserire la posizione in cui si deve inserire il valore: ");
                    i = in.nextInt();
                }while(i<0 || i>=N);
                N = InserisciElemento(V,N,valore,i);
            }
            if(o == 2){
                do{
                    System.out.print("Inserire la posizione dell'elemento da eliminare: ");
                    i = in.nextInt();
                }while(i < 0 || i >= N);
                N = EliminaElemento(V, N, i);
            }
            if(o == 3){
                System.out.println("Inserire valore da ricercare: ");
                valore = in.nextInt();
                valore = ricercaNelVettore(V, N, valore);
                if(valore == -1){
                    System.out.println("Il valore non Ã¨ presente nel vettore");
                }else{
                    System.out.println("Il valore Ã¨ presente nella posizione: " + valore);
                }
                
            }
            if(o == 4){
                N = ElminaDuplicati(V,N);
            }
            if(o == 5){
                VisualizzaVettore(V,N);
            }
            if(o == 6){
                do{
                    System.out.print("Inserire la posizione dell'elemento da eliminare: ");
                    i = in.nextInt();
                }while(i < 0 || i >= N);
                N = EliminaElementiOtt(V, N, i);
            }
            if(o == 7){
                System.out.print("Inserire il valore da aggiungere: ");
                valore = in.nextInt();
                do{
                    System.out.print("Inserire la posizione in cui si deve inserire il valore: ");
                    i = in.nextInt();
                }while(i<0 || i>=N);
                N = InserisciElementoOtt(V,N,valore,i);
            }
            if(o == 8){
                N = EliminaDuplicatiOtt(V, N);
            }
            if(o < 1 || i >9){
                System.out.println("Inserire un valore valido");
            }
        }while(o != 9);
    }
}