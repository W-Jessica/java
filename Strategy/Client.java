
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef chef=new Chef();
		ICutFruit cut=new FruitKnife();
		chef.SetCutMethod(cut);
		chef.CutFruit("����");
	}

}
