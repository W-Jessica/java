
public class Client 
{
	public static void main(String[] args)
	{
		Television tv=new HaierTV();
		TVIterator it=tv.createIterator();
		System.out.println(it.next().getName());
		while(!it.isDone())
		{
			System.out.println(it.next().getName());
		}
	}
}
