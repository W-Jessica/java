
public class NoteBook {

    /**
     * �����������ӿ�
     */
    private ThreePower threePower;

    public NoteBook(ThreePower threePower) {
        this.threePower = threePower;
    }


    public static void main(String[] args) {
        //�̳з�ʽ��������ʹ�� ��������
        ThreePower threePower1 = new TwoToThreeAdapter2();
        NoteBook noteBook1 = new NoteBook(threePower1);
        noteBook1.recharge();
        noteBook1.work();

        // ��Ϸ�ʽ��������ʹ�� ����������
        // ����ֻ�ж����
        TwoPower twoPower = new TwoPower();
        ThreePower threePower = new TwoToThreeAdapter(twoPower);
        NoteBook noteBook = new NoteBook(threePower);
        // 1. ���
        noteBook.recharge();
        // 2. ����
        noteBook.work();
    }

    public void work() {
        System.out.println("�ʼǱ����Կ�ʼ����!");
    }

    public void recharge() {
        // ʹ��������
        threePower.powerByThree();
    }
}