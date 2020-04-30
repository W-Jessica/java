import java.util.ArrayList;

public abstract class SingleContent implements IComponent
{	
	private ArrayList<IComponent> singlelist = new ArrayList<>();
	public void show()
	{		
		for (IComponent iComponent : singlelist)
		{			
			iComponent.show();	
		}	
	}	
	public IComponent add(IComponent ic)
	{	
		singlelist.add(ic);	
		return ic;	
	}	
	public void remove(IComponent ic)
	{	
		singlelist.remove(ic);
	}
}
