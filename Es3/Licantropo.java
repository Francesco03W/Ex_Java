public class Licantropo implements Mostro,Umano 
{
	private boolean isUomo;
	protected int forzaUmano;
	protected int forzaMostro;
	public Licantropo(boolean isUomo)  
	{
		this.isUomo=isUomo;
		forzaUmano=10;
		forzaMostro=15;
	}
	public void setIsUomo(boolean x) {this.isUomo=x;}
	public void combatti()
	{
		if(isUomo==true)
		{
			forzaUmano=forzaUmano-3;
		}
		else
		{
			System.out.println("Impossibile attaccare durante le notti di luna piena");
		}
	}
	public void azzanna()
	{
		if(isUomo==false)
		{
			forzaMostro=forzaMostro-2;
		}
		else
		{
			System.out.println("Impossibile azzannare mentre si è umani");
		}
	}
	public String getForza() 
	{
		if(isUomo==true)
		{
			return "La forza umana del licantropo è "+forzaUmano;
		}
		else
		{
			return "La forza mostro del licantropo è "+forzaMostro;
		}
	}
}