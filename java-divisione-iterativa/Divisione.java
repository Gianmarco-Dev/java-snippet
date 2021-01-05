import java.util.*;

 class Divisione{
/**
Dati in ingresso: interi per dividendo e Divisore;
Dati in uscita: interi quoziente, resto
Condizione di ingresso: Dividendo >= 0, divisore > 0
Condizione di uscita: Dividendo = (quoziente * divisore + resto) && resto < divisore
*/
    public static void main (String [] args){
        int Dividendo = 14;
        int divisore = 3;
        int quoziente = 0;
        int resto = Dividendo;
    while (resto >= divisore) { /** l'invariante: resto>= divisore  non e' significativa**/
        quoziente = quoziente + 1;
        resto = resto - divisore;
    }
    System.out.println("Il risultato di " + Dividendo + " diviso " + divisore + " è " + quoziente + ", con resto di:  " + resto);
    }
}
