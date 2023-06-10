public class Counter
{
	private int val;
	public Counter() {val=0;}
	public Counter(int n) {val=n;}
	public int getValue() {return val;}
	public void incr() {val++;}
	public void reset() {val=0;}
	public String toString() {return val+"";}

}