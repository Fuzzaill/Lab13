public class Task {
	synchronized void printFactorial(int num)
	{
		int fact = num;
		for(int i=num-1;i>=1;i--)
		{
			System.out.print(fact+"*"+i+"  =  ");
			fact=fact*i;
			System.out.println(fact);
		}
	}
	void PrintPower(int num)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num+"^"+i+"  =  "+(int)Math.pow(num, i));
		}
	}
}