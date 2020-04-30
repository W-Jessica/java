
public class AbstractFactoryTest {
	    public static void main(String[] args) {
	        IAbstractFactory factory = new LowPersonFactory();
	        Car car = factory.getCar();
	        IBreakFast breakFast = factory.getBreakFast();
	        System.out.println("�Ե��緹�ǣ�");
	        breakFast.eat();
	        System.out.println("�ϰཻͨ�����ǣ�");
	        car.gotowork();

	        IAbstractFactory factory2 = new HighPersonFactory();
	        car = factory2.getCar();
	        breakFast = factory2.getBreakFast();
	        System.out.println("�Ե��緹�ǣ�");
	        breakFast.eat();
	        System.out.println("�ϰཻͨ�����ǣ�");
	        car.gotowork();
	    }
}
