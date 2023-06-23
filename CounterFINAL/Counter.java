public class Counter
{
	protected int val;
	public Counter(int val) {this.val=val;}
	public int getValue() {return val;}
	public void inc() {val++;}
	public void copy(Counter x) {this.val=x.val;}
	public boolean equals(Counter x) {return this.val==x.val;}
	public String toString() {return "sono un contatore di valore "+val;}
}