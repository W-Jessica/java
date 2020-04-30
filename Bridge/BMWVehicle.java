
public class BMWVehicle extends AbstractVehicleBrand//±¦Âí
{	//µ¼º½
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

