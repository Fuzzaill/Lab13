public class Factorial extends Thread {
	Task m1;
	Factorial(Task m1)
	{
		this.m1=m1;
	}
	public void run()
	{
		m1.printFactorial(2);
	}
	System.out.println("It is a change in file");
}
