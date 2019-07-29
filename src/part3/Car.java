package part3;

public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    public Car() {

    }

    public Car(String make, String model, int year, double price) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
    }

    public String getMake() {
	return make;
    }

    public void setMake(String make) {
	this.make = make;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    @Override
    public String toString() {
	String formattedPrice = String.format("%$.2f", price);
	String formatter = "Make: %-15s Model: %-15s Year: %-8s Price: %-15s";
	return String.format(formatter, make, model, Integer.toString(year), formattedPrice);
    }

}
