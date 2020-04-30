
public class Client {
	public static void main(String args[])
	{	
		INavigator bdNavigator = new BDNavigator();		
		INavigator sxzNavigator = new SXZNavigator();	
		//宝马安装北斗导航		
		AbstractVehicleBrand bmw = new BMWVehicle();	
		System.out.println("我是宝马！");
		bmw.install(bdNavigator);	
		bmw.open();	
	
		//奔驰安装了神行者导航	
		AbstractVehicleBrand benz = new BMWVehicle();
		System.out.println("我是奔驰！");
		benz.install(sxzNavigator);	
		benz.open();
		}
	}


