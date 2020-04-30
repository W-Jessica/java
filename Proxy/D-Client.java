package DProxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	IShowPic isp=new CRemoPic();
		ClocalPicShow cpic=new ClocalPicShow(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		localpic.ShowPic("AAA");*/
		ITestInterface ipic=new CTest();
		ITestInterface proxy=(ITestInterface)new ClocalPicShow(ipic).getProxyInstance();
        proxy.SendMessage("AAA");	
	}

}
