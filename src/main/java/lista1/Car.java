package lista1;

public class Car implements Vehicle  {

    @Override
    public int getHourlyPrice() {
        return 2;
    }

    @Override
    public int getDailyPrice() {
        return 26;
    }

    @Override
    public int getMonthlyPrice() {
        return 300;
    }
}
