
public class VeicoloMain
{

	public static void main(String[] args)
	{
		Automobile a = new Automobile("CA42RU");
		/*si potrebbe anche fare

		Veicolo a = new Automobile("CA42RU");
		Automobile auto= (Automobile)a; ora posso usare i metodi di automobile non presenti in veicolo
		 */
		Bicicletta b = new Bicicletta();
		a.accelera(2,5);
		b.pedala(4,2);

		System.out.println("La velocità dell'auto è ");
		Veicolo.printVelocity(a);
		System.out.println("La velocità della bici è ");
		Veicolo.printVelocity(b);

		a.printNRuote();
		b.printNRuote();
	}


}