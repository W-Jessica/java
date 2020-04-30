import java.util.Vector;

public class Controller implements TVIterator
{
	private int current=0;
	Vector channel;
	public Controller(Vector v)
	{
		channel=v;
	}
	@Override
	public Item first() {
		// TODO Auto-generated method stub
		current=0;
		return (Item)channel.get(current);
	}

	@Override
	public Item next() {
		// TODO Auto-generated method stub
		current++;
		return (Item)channel.get(current);
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current>=channel.size()-1;
	}

	@Override
	public Item currentItem() {
		// TODO Auto-generated method stub
		return (Item)channel.get(current);
	}

}
