
public class LowPersonFactory implements IAbstractFactory {
    public Car getCar() {
        return new Bike();
    }
    public IBreakFast getBreakFast() {
        return new Orange();
    }


}
