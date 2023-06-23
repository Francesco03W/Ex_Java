public class ImprovedCounter extends Counter
{
	private int step;
	public ImprovedCounter()
	{
		super();
		step=1;
	}
	public ImprovedCounter(int n)
	{
		super(n);
		step=1;
	}
	public ImprovedCounter(int val, int step)
	{
		super(val);
		this.step=step;
	}
	//ridefinisco inc()
	@Override
	public void inc() 
	{
		val=val+step;
	}
	
	public void inc(int n)
	{
		val=val+n;
	}
	public int getStep() {return step;}
	public void setStep(int step) {this.step=step;}

}