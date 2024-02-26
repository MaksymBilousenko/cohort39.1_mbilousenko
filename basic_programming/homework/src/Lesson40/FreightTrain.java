package Lesson40;

public class FreightTrain extends Vehicle implements CargoTransport{
    private int cartAmount;
    private int cargo;
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }


    public int getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(int cartAmount) {
        this.cartAmount = cartAmount;
    }
    public FreightTrain(int cartAmount, double speed, double fuelAmount, double fuelPerKm) {
        super(speed, fuelAmount, fuelPerKm);
        this.cartAmount = cartAmount;
    }

    @Override
    public double caculateFuelConsumption(double distance) {
        return distance * (fuelPerKm + cartAmount * 0.1 * fuelPerKm + calculateCargoConsumptionPerKm());
    }

    @Override
    public double calculateCargoConsumptionPerKm() {
        return fuelPerKm * 0.00002 * cargo;
    }

    @Override
    public double getCargo() {
        return 0;
    }

    @Override
    public void setCargo(double cargo) {

    }
}
