
public class ConcreteSubjectA extends SubjectS
{
	public ConcreteSubjectA()
	{
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		System.out.println("AĿ�귢���ı�");
		for(ObserverO obs:observers)
		{
			obs.response();
		}
	}
	
}