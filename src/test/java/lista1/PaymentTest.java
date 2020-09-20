package lista1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    void PaymentCarHourly() {
        ParkedTime parkedTime = new ParkedTime(10.0);
        Car car = new Car();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(car);
        assertEquals(20.0, payment.getFinalPrice());
    }

    @Test
    void PaymentCarDaily() {
        ParkedTime parkedTime = new ParkedTime(14.0);
        Car car = new Car();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(car);
        assertEquals(26.0, payment.getFinalPrice());
    }

    @Test
    void PaymentCarDaily2() {
        ParkedTime parkedTime = new ParkedTime(50.0);
        Car car = new Car();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(car);
        assertEquals(52.0, payment.getFinalPrice());
    }

    @Test
    void PaymentCarMonthly() {
        ParkedTime parkedTime = new ParkedTime(720.0);
        Car car = new Car();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(car);
        assertEquals(300.0, payment.getFinalPrice());
    }

    @Test
    void PaymentCarMonthly2() {
        ParkedTime parkedTime = new ParkedTime(1480.0);
        Car car = new Car();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(car);
        assertEquals(600.0, payment.getFinalPrice());
    }

    @Test
    void PaymentVansDaily() {
        ParkedTime parkedTime = new ParkedTime(10);
        Vans vans = new Vans();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(vans);
        assertEquals(40.0, payment.getFinalPrice());
    }

    @Test
    void PaymentBusDaily() {
        ParkedTime parkedTime = new ParkedTime(10);
        Bus bus = new Bus();
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(bus);
        assertEquals(60.0, payment.getFinalPrice());
    }

    @Test
    void PaymentTruckDaily() {
        ParkedTime parkedTime = new ParkedTime(10);
        Truck truck = new Truck(4, 600);
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(truck);
        assertEquals(100.0, payment.getFinalPrice());
    }

    @Test
    void PaymentTruckHeavyCargoDaily() {
        ParkedTime parkedTime = new ParkedTime(10);
        Truck truck = new Truck(8, 1200);
        Payment payment = new Payment(parkedTime);
        payment.setVehicle(truck);
        assertEquals(200.0, payment.getFinalPrice());
    }
}
