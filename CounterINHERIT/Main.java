public class Main
{
	public static void main(String[] args)
	{
		Counter c1 = new Counter(5);
		BiCounter B1= new BiCounter();
		B1.dec();

		System.out.println(B1.val+" B1");
				System.out.println(c1.getValue()+" C1");
	}
}