import java.util.Vector;

public class HaierTV implements Television{
	private Vector channel;
	public HaierTV() {
		channel=new Vector();
		channel.addElement(new Item("channel 1"));
		channel.addElement(new Item("channel 2"));
		channel.addElement(new Item("channel 3"));
		channel.addElement(new Item("channel 4"));
		channel.addElement(new Item("channel 5"));
		channel.addElement(new Item("channel 6"));
		channel.addElement(new Item("channel 7"));
	}

	@Override
	public TVIterator createIterator() {
		// TODO Auto-generated method stub
		return new Controller(channel);
	}

	@Override
	public Vector getChannel() {
		// TODO Auto-generated method stub
		return channel;
	}

}
