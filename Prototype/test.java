
public class test 
{   
	public static void main(String[] args)
	{     
		//原型A对象   
		Resume a = new Resume("张三");   
		a.setPersonInfo("2.29", "男", "XX大学");   
		a.setWorkExperience("2018.09.01", "XX科技有限公司"); 
		//克隆B对象   
		Resume b = (Resume) a.clone();     
      
		System.out.println("----------------A--------------");
		a.display();  
		System.out.println("----------------B--------------"); 
		b.display();             
	
		System.out.print("A==B?");    
		System.out.println( a == b);  
      	System.out.print("A.getClass()==B.getClass()?"); 
		System.out.println(a.getClass() == b.getClass());    
	}	
}
