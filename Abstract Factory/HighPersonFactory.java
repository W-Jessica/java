
public class HighPersonFactory implements IAbstractFactory {

    public Car getCar() {
        return new Bus();
    }

    public IBreakFast getBreakFast() {
        return new Milk();
    }
}
