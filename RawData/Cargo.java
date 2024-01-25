public class Cargo {
    private int cargoWeight;
    private String cargoType;

    public Cargo(int getCargoWeight, String cargoType) {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }
}
