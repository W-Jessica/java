
public class TwoToThreeAdapter  implements ThreePower{
	private TwoPower twoPower;

    public TwoToThreeAdapter(TwoPower twoPower) {
        this.twoPower = twoPower;
    }


    @Override
    public void powerByThree() {
        System.out.println("�������������ת�������");
        twoPower.powerByTwo();
    }
}
