
public class test 
{   
	public static void main(String[] args)
	{     
		//ԭ��A����   
		Resume a = new Resume("����");   
		a.setPersonInfo("2.29", "��", "XX��ѧ");   
		a.setWorkExperience("2018.09.01", "XX�Ƽ����޹�˾"); 
		//��¡B����   
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
