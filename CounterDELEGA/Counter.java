public class Counter
{
	private int val;
	public Counter() {val=0;}
	public void reset() {val=0;}
	public int getValue() {return val;}
	public void inc() {val++;}
	public void copy(Counter x) {val=x.val;}
	public String toString() {return "Valore "+val;}
	public boolean equals(Counter x) {return val==x.val;}
}