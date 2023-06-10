public class Counter
{
	protected int val;
	public Counter()
	{
		System.out.println("Costruttore default");
		val=0;
		
	}
	public Counter(int n) 
	{	
		System.out.println("Costruttore");
		val=n;
		
	}
	public void reset() {val=0;}
	public void inc() {val++;}
	public int getValue() {return val;}
	public String toString() {return "valore: "+val;}
    public void copy(Counter x) {val=x.val;}
	public Boolean equals(Counter x) {return val==x.val;}
}