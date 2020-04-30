
public class ConcreteSubjectA extends SubjectS
{
	public ConcreteSubjectA()
	{
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		System.out.println("A目标发生改变");
		for(ObserverO obs:observers)
		{
			obs.response();
		}
	}
	
}
