package AbstractFactoryPattern;

public class PigeonAdaptor implements Quackable {

    private Pigeon pigeon;
    public static int cooCount;

    public PigeonAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
        this.cooCount = 0;
    }
    @Override
    public void quack() {
        pigeon.coo();;
        pigeon.coo();
    }
}
