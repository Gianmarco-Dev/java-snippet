
public class Fattoriale {
  /** Dati in ingresso: interi n>= 0
  n = numero di cui voglio sapere il fattoriale
  Dati in uscita: interi y>=0
  Condizione di ingresso: true
  Condizione di uscita: y = n!
  */
  public static void main (String[] args){
    /*istruzioni per esplorazione del grafo di funzione fattoriale
    generando ad ogni iterazione la coppia rilevante
    (argomento, valore della funzione) */
    
    int n = 10;
    int x = 0;
    int y = 1;
    while (x < n) {
      x = x + 1;
      y = x * y;
    }

    System.out.println("Il fattoriale di " + n + " e' : " + y);
  }
}
