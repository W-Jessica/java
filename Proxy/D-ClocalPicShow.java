package DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClocalPicShow {
	private Object target;
	public ClocalPicShow(Object target)
	{
		super();
		this.target=target;
	}
	public Object getProxyInstance()
	{
		return Proxy.newProxyInstance(
                   target.getClass().getClassLoader(),
                   target.getClass().getInterfaces(),
                   new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("◊º±∏‘ÿ»ÎÕº∆¨"+args[0].toString());
						Thread thr=new Thread (new Runnable() {

							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									method.invoke(target, args);
								} catch (IllegalAccessException | IllegalArgumentException
										| InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}); 
						thr.start();
						return null;
					}
                	   
                   });
	}
}