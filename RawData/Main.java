import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[5]);
            int tire2Age = Integer.parseInt(tokens[6]);
            double tire3Pressure = Double.parseDouble(tokens[5]);
            int tire3Age = Integer.parseInt(tokens[6]);
            double tire4Pressure = Double.parseDouble(tokens[5]);
            int tire4Age = Integer.parseInt(tokens[6]);

            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Engine engine = new Engine(engineSpeed, enginePower);
            Tyres tire1 = new Tyres(tire1Pressure, tire1Age);
            Tyres tire2 = new Tyres(tire2Pressure, tire2Age);
            Tyres tire3 = new Tyres(tire3Pressure, tire3Age);
            Tyres tire4 = new Tyres(tire4Pressure, tire4Age);
            Tyres[] tyres = new Tyres[]{tire1, tire2, tire3, tire4};

            Car car = new Car(model, engine, cargo, tyres);
            cars.add(car);
        }

        String input = scanner.nextLine();
        if (input.equals("fragile")) {
            for (Car car : cars) {
                if (car.getCargo().getCargoType().equals("fragile")) {
                    boolean correctTyrePressure = true;
                    for (Tyres tyre : car.getTyres()) {
                        if (tyre.getTirePressure() >= 1) {
                            correctTyrePressure = false;
                        }
                    }
                    if (correctTyrePressure) {
                        System.out.println(car.getModel());
                    }
                }
            }
        } else {
            for (Car car : cars) {
                if (car.getCargo().getCargoType().equals("flamable") && car.getEngine().getEnginePower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
