package lista1;

public interface CargoVehicle {

    default int getAxis() {
        return 0;
    }

    default int getWeight() {
        return 0;
    }

}
