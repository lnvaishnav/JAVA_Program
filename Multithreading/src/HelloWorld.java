
class HappyThreading extends Thread 
{
	@SuppressWarnings("unused")
	public void run()
	{
		for (int i = 1; i<=4;i++)
		{
			System.out.println(i);
			throw new NullPointerException();
		}
	}
}
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Higher Threads...");
		
		HappyThreading ht = new 
				HappyThreading();
		ht.start();
		for (int i = 11; i<=20;i++)
		{
			System.out.println("Hello World...");
		}
	}

}
