package lista1;

public interface Vehicle {

    default int getHourlyPrice() {
        return 0;
    }

    default int getDailyPrice() {
        return 0;
    }

    default int getMonthlyPrice() {
        return 0;
    }
}
