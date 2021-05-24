public class Power extends Thread {
	Task m1;
	Power(Task m1)
	{
		this.m1=m1;
	}
	public void run()
	{
		m1.PrintPower(2);
	}
}
