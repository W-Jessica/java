class Window extends SingleContent{}    //����
class CenterPanel extends SingleContent{}//�м����
public class Client 
{
	public static void main(String[] args) {	
		// TODO �Զ����ɵķ������	
		Single s1, s2;	
		SingleContent c1, c2;		
		s1 = new Button();	
		s2 = new CheckBox();	
		c1 = new Window();	
		c2 = new CenterPanel();	
        c1.add(s1);	
        c1.add(c2);	
        c1.add(s2);	
        c2.add(s1);		
        c2.add(s2);		
        c1.show();		
        c2.show();
        }
}

