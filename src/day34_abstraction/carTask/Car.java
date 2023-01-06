package day34_abstraction.carTask;

public  abstract   class Car {


    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println(" Invalid Price ");
            System.exit(1);
        }
        this.price = price;
    }

    public Car(String model, int year, double price, String color) {
        this.make = getClass().getSimpleName();
        this.model = model;
        this.year = year;
        if (year < 1886) {
            System.err.println(" Invalid year" + year);
            System.exit(1);
        }
        setPrice(price);
        setColor(color);
    }
       protected final void stop(){
            System.out.println( "Press the brake to stop " + make+" "+ model);
        }

        protected  abstract void start ();


    @Override
    public String toString() {
        return make +"{"+
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}

/*
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price
			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero
			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car
			Methods:
				stop() (final): prints "Press the brake"
				start() (abstract)
				toString(): prints the given car info when a car object is passed in the print statement
 */