public class BiCounter extends Counter
{
	public BiCounter()
	{
		super(0); //dato che non ho creato un costruttore default in Counter devo
		//manualmente usare il costruttore con parametro n
	}
	public void dec() {val--;}
}