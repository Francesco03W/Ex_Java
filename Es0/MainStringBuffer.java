/*
Scrivere il seguente programma Java:
Si leggano N stringhe da riga di comando.
Per ogni stringa si sostituiscano tutte le occorrenze di old_char con new_char (variabili inizializzate nel codice).
Utilizzando la classe StringBuffer (e relativi metodi) stampare l’ID dell’istanza ad ogni modifica dell’oggetto
Utilizzando la classe String (e relativi metodi) stampare l’ID dell’istanza ad ogni modifica della stringa

*/

//VERSIONE STRINGBUFFER
import java.util.Scanner;
public class MainStringBuffer
{
	public static void main(String[] args)
	{
		//lettura N stringhe,Per ogni stringa si sostituiscano tutte le occorrenze di old_char con new_char (variabili inizializzate nel codice).
		System.out.println("inserire numero di stringhe da inserire ");
		Scanner scanner=new Scanner(System.in);

		int num=scanner.nextInt();
		//https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/StringBuffer.html
		StringBuffer[] SB=new StringBuffer[num];

		for(int i=0;i<num;i++)
		{
			System.out.println("Inserire stringa numero "+i);
			
			SB[i]= new StringBuffer(scanner.next());
		}

		char old_char='a';
		char new_char='e';

		for (int i=0;i<num ;i++ ) {
			for (int j=0; j<SB[i].length();j++ ) {
				//controllo ogni carattere, se è old char o meno
				if(SB[i].charAt(j)==old_char)
					SB[i].setCharAt(j,new_char);
			}
		}
		
		for (int i=0; i<num;i++ ) {
			System.out.println("Stringa: "+SB[i]+" con ID StringBuffer "+SB[i].hashCode());
		}

	}
}