public class EsempioOrologio
{
	public static void main(String[] args)
	{
		Orologio Orol = new Orologio();
		int i=0;
		while(i<70)
		{
			Orol.tic();
			System.out.println(Orol.toString());
			i++;
		}
		
	}
}