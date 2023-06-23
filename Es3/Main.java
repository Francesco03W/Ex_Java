public class Main
{
	public static void main(String[] args)
	{
		Eroe e = new Eroe();
		Licantropo l = new Licantropo(true);
		Vampiro v = new Vampiro();

		for(int i=0;i<3;i++)
		{
			e.combatti();	
		}
		v.azzanna();
		for(int i=0;i<3;i++)
		{
			l.combatti();	
		}

		System.out.println(e.getForza());
		System.out.println(l.getForza());
		System.out.println(v.getForza());
		
	}
}