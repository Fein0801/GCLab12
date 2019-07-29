package part2;

public class UsedCar extends Car {

    private double mileage;

    public UsedCar() {
	super();
    }

    public UsedCar(String make, String model, int year, double price) {
	super(make, model, year, price);
    }

    public UsedCar(String make, String model, int year, double price, double mileage) {
	super(make, model, year, price);
	this.mileage = mileage;
    }

    public double getMileage() {
	return mileage;
    }

    public void setMileage(double mileage) {
	this.mileage = mileage;
    }

    @Override
    public String toString() {
	String formattedMileage = getFormattedMileage();
	return super.toString() + " (Used) " + String.format("Mileage: %-15s", formattedMileage);
    }

    public String getFormattedMileage() {
	String formattedMileage = "";
	int mileageInt = (int) mileage;
	double mileageRemainder = mileage - mileageInt;
	formattedMileage += String.format("%,d", mileageInt) + String.format("%.2f", mileageRemainder).substring(1)
		+ " miles";
	return formattedMileage;
    }

}
