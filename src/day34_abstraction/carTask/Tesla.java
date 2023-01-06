package day34_abstraction.carTask;

public class Tesla  extends  Car{
    public Tesla(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println( " Use voice control to start ");
    }


    public void autopilot(){
        System.out.println( getMake() +" "+  getModel() + "  has autopilot ");
    }
}
