public class Bicicletta extends Veicolo
{
	public Bicicletta() {super(); }
	public void pedala(int numPedalate,int secondi)
	{
		double accValue=numPedalate/Math.pow(secondi,2);
		setAcceleration(getAcceleration()+accValue);
		setVelocity(getVelocity()+(accValue*secondi));
	}
	//override funzione printNruote
	@Override
	public void printNRuote() {System.out.println("Numero di ruote della bici è 2");}
}