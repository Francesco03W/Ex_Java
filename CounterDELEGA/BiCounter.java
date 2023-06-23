// Esempio Delega, per aggiungere funzionalità alla funzione Counter senza doverla modificare direttamente
//delego tutte le funzioni a Counter, tranne i nuovi metodi da implementare

public class BiCounter
{
	private Counter C;
	public BiCounter() {C=new Counter();}
	public void reset() {C.reset();}
	public int getValue() {return C.getValue();}
	public void inc() {C.inc();}
	public void copy(BiCounter x) {C.copy(x.C);}
	public String toString() {return C.toString();}
	public boolean equals(BiCounter x) {return C.equals(x.C);}
	public void dec() {
		int nprec=C.getValue()-1;
		C.reset();
		for (int i=0;i<nprec;i++) {
			C.inc();
		}
	}
	
}