class Window extends SingleContent{}    //窗体
class CenterPanel extends SingleContent{}//中间面板
public class Client 
{
	public static void main(String[] args) {	
		// TODO 自动生成的方法存根	
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

