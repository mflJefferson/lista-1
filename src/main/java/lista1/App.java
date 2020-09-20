/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lista1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas o veículo ficou no estacionamento? ");

        ParkedTime parkedTime = new ParkedTime(scanner.nextDouble());
        Payment payment = new Payment(parkedTime);

        System.out.println("Qual o tipo de veículo?");
        System.out.println("1 = Carro, 2 = Van, 3 = Onibus, 4 = Caminhão");
        Scanner scVehicle = new Scanner(System.in);

        switch (scVehicle.nextInt()) {
            case 1:
                Car car = new Car();
                payment.setVehicle(car);
                break;

            case 2:
                Vans vans = new Vans();
                payment.setVehicle(vans);
                break;

            case 3:
                Bus bus = new Bus();
                payment.setVehicle(bus);
                break;

            case 4:
                Scanner scAxis = new Scanner(System.in);
                System.out.println("Quantos eixos o caminhão possui?");
                Scanner scWeight = new Scanner(System.in);
                System.out.println("Quantos kilos o caminhão pesa?");
                Truck truck = new Truck(scAxis.nextInt(), scWeight.nextInt());
                payment.setVehicle(truck);
                break;

            default:
                break;
        }

        System.out.println(payment.getFinalPrice());
    }
}