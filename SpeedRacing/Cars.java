public class Cars {
    private String model;
    private  double fuelAmount;
    private  double fuelCost;
    private  int distanceTravelled;
    
    public Cars(String model, double fuelAmount, double fuelCost, int distanceTravelled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTravelled = distanceTravelled;
    }
    
    public boolean enoughFuel(Cars car, int amountOfKm) {
                if (amountOfKm<car.getFuelAmount()/car.getFuelCost()){
                    return true;
                }
                else {
                    return false;
              }
    }
    
    public String getModel() {
        return model;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int amountOfKm) {
        this.fuelAmount = this.fuelAmount - (amountOfKm*this.fuelCost);
    }
    public void setDistanceTravelled(int amountOfKm) {
        this.distanceTravelled = distanceTravelled + amountOfKm;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
