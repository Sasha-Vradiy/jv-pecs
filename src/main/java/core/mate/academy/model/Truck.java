package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxPayLoad;

    public Truck() {
    }

    public Truck(String name, String colour, int maxPayLoad) {
        super(name, colour);
        this.maxPayLoad = maxPayLoad;
    }

    public int getMaxPayLoad() {
        return maxPayLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
