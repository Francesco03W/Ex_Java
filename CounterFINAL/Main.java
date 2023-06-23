//stampare come oggetti dopo averli incrementati per 150 volte
public class Main
{
	public static void main(String[] args)
	{
		Counter c = new Counter(0);
		BiCounter c1= new BiCounter();

		for (int i=0;i<150;i++ ) 
		{
			c.inc();
			c1.inc();
		}
		System.out.println(c.toString());
		System.out.println(c1.toString());

	}
}