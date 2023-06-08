/*
Si definisca la classe ImprovedCounter, sottoclasse (estensione) di Counter. 

ImprovedCounter ha in più un attributo intero di nome step.
Ai due costruttori di Counter (da modificare con l’aggiunta dell’inizializzazione a 1 della variabile step) aggiungere un terzo costruttore, il quale prende in ingresso due interi che andranno a costituire i valori iniziali di count e step.
ImprovedCounter ridefinisce inc() in modo che, ad ogni invocazione, sommi a count il valore di step (invece di 1) e offre, inoltre, una variante di inc(int n) che, preso in ingresso un intero, lo somma a count. 
Infine espone i metodi getStep(), che restituisce il valore di step e setStep(int n) che, preso in ingresso un intero, pone a questo valore step.

Definire una classe ImprovedCounterMain contenente un metodo main() che dichiari due ImprovedCounter iC1 e iC2.

Si inizializzi iC1.count a 0, iC1.step a 1, iC2.count a un valore diverso da 0, iC2.step a un valore diverso da 1.
Realizzare poi un ciclo con indice i da i a N con 5 < N < 20 scelto in maniera casuale. Per generare un numero random, utilizzare il metodo statico Math.random() che restituisce un valore double compreso tra 0.0 e 1.0.
All’interno del ciclo, se i è pari, invocare inc() su iC1 e iC2; se i è dispari, invocare inc(i) su iC1 e iC2.

Si stampi infine un messaggio che dica se iC1 e iC2 hanno lo stesso valore di conteggio o no, e il valore di conteggio e di step di entrambi.
*/