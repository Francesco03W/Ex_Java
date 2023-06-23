public class Veicolo 
{
	private double velocity;
	private double acceleration;
	public Veicolo() {
		this.velocity=0;
		this.acceleration=0;
	}
	public Veicolo(double velocita,double accelerazione) 
	{
		this.velocity=velocita;
		this.acceleration=accelerazione;
	}
	public void setVelocity(double velocity) {this.velocity=velocity;}
	public double getVelocity() {return this.velocity;}
	public void setAcceleration(double acceleration) {this.acceleration=acceleration;}
	public double getAcceleration() {return this.acceleration;}
	static public void printVelocity(Veicolo V) {System.out.println(V.velocity);}
	public void printNRuote() {}
}