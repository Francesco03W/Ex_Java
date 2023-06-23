public class BiCounter extends Counter
{
	public BiCounter()
	{
		super(0);
	}
	public void dec() {val--;}
	@Override
	public String toString() {return "Sono un contatore bidirezionale di valore "+ val;}
}