public class ImprovedCounterMain
{
	public static void main(String[] args)
	{
		Counter iC1,iC2;
		iC1=new ImprovedCounter(0,1);
		iC2=new ImprovedCounter(5,2);
		
		int N=0;
		//generare intero N compreso tra due valori partendo da Math.random
		while(N<=5 || N>=20)
		{
			double rand=Math.random(); //returns value between 0.0 and 1.0
			

			N=(int)((rand*15)+5);
			System.out.println(N);
		}

		for (int i=0;i<N;i++) 
		{
			if(i%2==0)
			{
				iC1.inc();
				iC2.inc();
			}
			else
			{
				iC1.inc(i);
				iC2.inc(i);
			}
		}

		if(iC1.equals(iC2)==true)
			System.out.println("I due contatori hanno lo stesso valore");
		else
			System.out.println("I due contatori non hanno lo stesso valore");
		System.out.println(iC1.toString());
		System.out.println(iC2.toString());

	}
}