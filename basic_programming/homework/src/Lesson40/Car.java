package Lesson40;

public class Car extends Vehicle implements PeopleTransport {

    private String model;
    private int passengers;

    public Car(String model, double speed, double fuelAmount, double fuelPerKm) {
        super(speed, fuelAmount, fuelPerKm);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double caculateFuelConsumption(double distance) {
        System.out.println("Путь займет " + distance/speed + "ч");
        return distance * fuelPerKm + calculatePassengersConsumptionPerKm();
    }

    @Override
    public double calculatePassengersConsumptionPerKm() {
        return passengers * 0.01 * fuelPerKm;
    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
