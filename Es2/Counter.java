public class Counter
{
	protected int val;
	public Counter() {val=0;}
	public Counter(int n) {val=n;}
	public void inc() {val++;}
	public int getValue() {return val;}
	public String toString() {return "Il valore del contatore è "+val;}
	public void copy(Counter x) {this.val=x.val;}
	public boolean equals(Object x) 
	{
		if(!(x instanceof Counter))
		{
			return false;
		}
		else
		{
			return (this.val==((Counter)x).val);
		}
	}
}