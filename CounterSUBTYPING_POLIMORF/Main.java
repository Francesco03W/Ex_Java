public class Main
{
	public static void main(String[] args)
	{
		Counter C1= new BiCounter();
		//c1.dec mi darebbe errore, perché non è un metodo previsto dal tipo Counter
		BiCounter B1= (BiCounter) C1;
		B1.dec();
		System.out.println(C1.toString());
	}
}