package part1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarAppPart1 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Car> cars = new ArrayList<>();

	boolean valid = false;
	while (!valid) {
	    System.out.println("How many cars?");
	    try {
		int numCars = scan.nextInt();
		for (int i = 1; i <= numCars; i++) {
		    System.out.println("Car " + i + ":");
		    System.out.println("Make: ");
		    String make = scan.next();
		    System.out.println("Model: ");
		    String model = scan.next();
		    System.out.println("Year: ");
		    int year;
		    if (scan.hasNextInt()) {
			year = scan.nextInt();
		    } else {
			System.out.println("Let's try again.");
			continue;
		    }
		    System.out.println("Price: ");
		    double price;
		    if (scan.hasNextDouble()) {
			price = scan.nextDouble();
		    } else {
			System.out.println("Let's try again.");
			continue;
		    }
		    scan.nextLine();
		    cars.add(new Car(make, model, year, price));
		}
		valid = true;
	    } catch (InputMismatchException e) {
		System.out.println("Let's try again.");
		scan.nextLine();
	    }
	}

	System.out.println();
	for (Car car : cars) {
	    System.out.println(car);
	}

	scan.close();
    }

}
