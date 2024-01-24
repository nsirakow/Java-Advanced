import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cars> carsList = new ArrayList<>();
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCost = Double.parseDouble(input[2]);
            Cars currentCar = new Cars(model, fuelAmount, fuelCost, 0);
            carsList.add(currentCar);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String model = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);
            for (Cars car : carsList) {
                if (car.getModel().equals(model)) {
                    if (car.enoughFuel(car, amountOfKm)) {
                        car.setFuelAmount(amountOfKm);
                        car.setDistanceTravelled(amountOfKm);
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Cars cars : carsList) {
            System.out.printf("%s %.2f %d%n", cars.getModel(), cars.getFuelAmount(), cars.getDistanceTravelled());
        }
    }
}
