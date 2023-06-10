public class Counter
{
	protected int val;
	public Counter(int n) {val=n;}
	public int getValue() {return val;}
	public String toString() {return "valore "+val;}
	public void inc() {val++;}
	public void reset() {val=0;}
	public void copy(Counter x) {val=x.val;}
	public Boolean equals(Counter x) {return val==x.val;}
}