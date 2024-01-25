import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tyres [] tyres = new Tyres[4];

    public Car (String model, Engine engine, Cargo cargo, Tyres [] tyres){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tyres[] getTyres() {
        return tyres;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
