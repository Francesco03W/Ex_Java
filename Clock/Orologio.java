
public class Orologio
{
	private Counter Ore,Min;
	public Orologio() 
	{
		Ore = new Counter();
		Min = new Counter();
	}
	public void tic()
	{
		Min.incr();
		if(Min.getValue()==60)
		{
			Min.reset();
			Ore.incr();
		}
		if(Ore.getValue()==24)
			Ore.reset();
	}
	public String toString()
	{
		return Ore.toString()+":"+Min.toString();
	}
}