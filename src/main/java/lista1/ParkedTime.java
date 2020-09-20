package lista1;

public class ParkedTime {

    private final double hours;

    private double days;

    private double months;

    private boolean hourly = false;

    private boolean daily = false;

    private boolean monthly = false;

    public boolean isHourly() {
        return hourly;
    }

    public void setHourly(boolean hourly) {
        this.hourly = hourly;
    }

    public boolean isDaily() {
        return daily;
    }

    public void setDaily(boolean daily) {
        this.daily = daily;
    }

    public boolean isMonthly() {
        return monthly;
    }

    public void setMonthly(boolean monthly) {
        this.monthly = monthly;
    }

    public double getHours() {
        return hours;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double hours) {
        this.days = Math.round(hours / 24);
    }

    public double getMonths() {
        return months;
    }

    public void setMonths(double days) {
        this.months = Math.round(days / 30);
    }

    public ParkedTime(double hours) {
        this.hours = hours;
        setDays(hours);
        setMonths(getDays());
        setParkedRate();
    }

    public void setParkedRate() {
        if (this.days > 15) {
            this.monthly = true;
        }
        if (this.hours > 12 && this.days <= 15) {
            this.daily = true;
        }
        if (this.hours <= 12) {
            this.hourly = true;
        }
    }
}
