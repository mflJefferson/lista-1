package lista1;

public class Bus implements Vehicle{

    @Override
    public int getHourlyPrice() {
        return 6;
    }

    @Override
    public int getDailyPrice() {
        return 48;
    }

    @Override
    public int getMonthlyPrice() {
        return 600;
    }
}
