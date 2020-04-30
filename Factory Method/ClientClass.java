
public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new AFactory();
		//Factory factory=new BFactory();
		Fruit fruit=factory.CreateFruit();
		fruit.eat();
	}

}
