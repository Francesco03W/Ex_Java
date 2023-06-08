/*
Scrivere il seguente programma Java:
Si leggano N stringhe da riga di comando.
Per ogni stringa si sostituiscano tutte le occorrenze di old_char con new_char (variabili inizializzate nel codice).
Utilizzando la classe StringBuffer (e relativi metodi) stampare l’ID dell’istanza ad ogni modifica dell’oggetto
Utilizzando la classe String (e relativi metodi) stampare l’ID dell’istanza ad ogni modifica della stringa
*/
//VERSIONE CLASSE STRING
import java.util.Scanner;
public class MainString
{
	public static void main(String[] args)
	{
		//lettura N stringhe,Per ogni stringa si sostituiscano tutte le occorrenze di old_char con new_char (variabili inizializzate nel codice).
		System.out.println("inserire numero di stringhe da inserire");
		Scanner scanner=new Scanner(System.in);

		int num=scanner.nextInt();
		String[] stringhe = new String[num];

		for(int i=0;i<num;i++)
		{
			System.out.println("Inserire stringa n°"+i);
			stringhe[i]=new String(scanner.next());
		}

		char old_char='a';
		char new_char='e';

		for (int i=0; i<num;i++ ) {
			stringhe[i]=new String(stringhe[i].replace(old_char,new_char));
		}


		for (int i=0; i<num;i++ ) {
			System.out.println("Stringa:"+stringhe[i]+" di ID:"+stringhe[i].hashCode());
		}

	}
}