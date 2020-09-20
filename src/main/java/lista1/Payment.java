package lista1;

public class Payment {

    private Vehicle vehicle;

    private ParkedTime parkedTime;

    private double finalPrice;

    public Payment(ParkedTime pTime) {
        this.parkedTime = pTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.setFinalPrice();
    }

    public ParkedTime getParkedTime() {
        return parkedTime;
    }

    public void setParkedTime(ParkedTime parkedTime) {
        this.parkedTime = parkedTime;
    }

    public void setFinalPrice()
    {

        if (this.parkedTime.isMonthly()) {
            this.finalPrice = this.vehicle.getMonthlyPrice() * this.parkedTime.getMonths();
        }

        if (this.parkedTime.isDaily()) {
            this.finalPrice = this.vehicle.getDailyPrice() * this.parkedTime.getDays();
        }

        if (this.parkedTime.isHourly()) {
            this.finalPrice = this.vehicle.getHourlyPrice() * this.parkedTime.getHours();
        }
    }

    public double getFinalPrice() {
        return finalPrice;
    }
}
