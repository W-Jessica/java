
public class Client {
	public static void main(String args[])
	{	
		INavigator bdNavigator = new BDNavigator();		
		INavigator sxzNavigator = new SXZNavigator();	
		//����װ��������		
		AbstractVehicleBrand bmw = new BMWVehicle();	
		System.out.println("���Ǳ���");
		bmw.install(bdNavigator);	
		bmw.open();	
	
		//���۰�װ�������ߵ���	
		AbstractVehicleBrand benz = new BMWVehicle();
		System.out.println("���Ǳ��ۣ�");
		benz.install(sxzNavigator);	
		benz.open();
		}
	}


