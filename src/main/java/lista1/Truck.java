package lista1;

public class Truck implements Vehicle, CargoVehicle {

    private final int axis;

    private final int weight;

    public Truck(int axis, int weight) {
        this.axis = axis;
        this.weight = weight;
    }

    @Override
    public int getHourlyPrice() {
        if (this.axis >= 8 || this.weight >= 1000) {
            return 10 * 2;
        }
        return 10;
    }

    @Override
    public int getDailyPrice() {
        if (this.axis >= 8 || this.weight >= 1000) {
            return 60 * 2;
        }
        return 60;
    }

    @Override
    public int getMonthlyPrice() {
        if (this.axis >= 8 || this.weight >= 1000) {
            return 1000 * 2;
        }
        return 1000;
    }

    @Override
    public int getAxis() {
        return this.axis;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

}
