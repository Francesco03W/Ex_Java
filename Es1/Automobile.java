public class Automobile extends Veicolo
{
	private String targa;
	private boolean avviata;
	public Automobile(String targa) 
	{
		super();
		this.targa=targa;
	}
	public void avvia() {avviata=true;}
	public void spegni() {avviata=false;}
	public void accelera(double accelerazione, int secondi)
	{
		if(avviata=true)
		{
			setVelocity(getVelocity()+(accelerazione*secondi));
			setAcceleration(getAcceleration()+accelerazione);
		}
	}
	@Override
	public void printNRuote() {System.out.println("Numero di ruote dell'auto 4");}
}