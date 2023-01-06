package day34_abstraction.carTask;

public class Honda extends  Car{

    public Honda(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println( " Turn the key to start " + getMake()+ "" + getModel());
    }
}
