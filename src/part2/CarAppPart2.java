package part2;

import java.util.ArrayList;
import java.util.Scanner;

public class CarAppPart2 {

    public static void main(String[] args) {
	ArrayList<Car> carList = createCars();
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to Ben's car lot!");

	boolean run = true;
	do {
	    printCarMenu(carList);
	    int selection = Validator.getInt(scan, "Which car would you like? ", 1, (carList.size() + 1));
	    if (selection == carList.size() + 1) {
		break;
	    }
	    Car car = carList.get(selection - 1);
	    System.out.println(car);

	    String input = Validator.getYesOrNo(scan, "Would you like to buy this car? ");

	    if (input.equalsIgnoreCase("yes")) {
		carList.remove(car);
		System.out.println("Excellent! Our finance department will be in touch shortly." + "\n");
	    }
	} while (run);

	System.out.println("Goodbye.");
    }

    private static ArrayList<Car> createCars() {
	ArrayList<Car> list = new ArrayList<>();
	list.add(new Car("Ford", "Fiesta", 2019, 54999.99));
	list.add(new Car("Nissan", "Sentra", 2019, 102999.99));
	list.add(new Car("Ford", "Mustang", 1969, 999.99));
	list.add(new Car("TopOf", "TheLine", 2025, 14000605));
	list.add(new UsedCar("Honda", "Accord", 1999, 14795.5, 3500));
	list.add(new UsedCar("VW", "Beetle", 1989, 10500, 10000));
	list.add(new UsedCar("Hyundai", "Elantra", 2015, 15000, 9000));
	return list;
    }

    private static void printCarMenu(ArrayList<Car> list) {
	for (int i = 0; i < list.size(); i++) {
	    System.out.println((i + 1) + ". " + list.get(i));
	}
	System.out.println((list.size() + 1) + ". Quit");
	System.out.println();
    }

}
