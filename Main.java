public class Main {
	public static void main(String args[])
	{
		Task t1 = new Task();
		Power p1 = new Power(t1);
		Factorial f1 = new Factorial(t1);
		p1.start();
		f1.start();
	}
}