public class BiCounter extends Counter 
{
	public void dec() {val--;}
	public BiCounter()
	{
		System.out.println("BiCounter:Costruttore Default");
		val=1;
	}
}