
public class BMWVehicle extends AbstractVehicleBrand//����
{	//����
	INavigator navigator = null; 
	public void install(INavigator n) 
	{			
		navigator = n;
		} 
	public void open()
		{	
			navigator.work();	
		}
}

