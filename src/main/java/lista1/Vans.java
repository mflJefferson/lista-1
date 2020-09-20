package lista1;

public class Vans implements Vehicle {

    @Override
    public int getHourlyPrice() {
        return 4;
    }

    @Override
    public int getDailyPrice() {
        return 36;
    }

    @Override
    public int getMonthlyPrice() {
        return 400;
    }

}
