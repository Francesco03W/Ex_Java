public class esempiocounter
{
	public static void main(String[] args)
	{
		BiCounter c1= new BiCounter();
		c1.reset();
		c1.inc();
		c1.inc();
		BiCounter c2= new BiCounter();
		c2.copy(c1);
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
		//ora decremento
		c1.dec();
		System.out.println("valore di c1 "+c1.getValue());
		System.out.println("c1 decrementato è uguale a c2?"+c1.equals(c2));

	}
}