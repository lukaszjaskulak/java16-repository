package pl.mpas.advanced_programming.abstract_class.generics.carExercise;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Opel"));
        vehicles.add(new Plane("Boeing"));


        displayVehicle(vehicles);
        addCar(vehicles);

    }


    static void displayVehicle(List<? extends Vehicle> vehicles){
        for (Vehicle vehicle: vehicles) {
            System.out.println("Vehicles list \n" + vehicle);
            }
    }

   static void addCar(List<? super Vehicle> vehicles){
        vehicles.add(new Car("Bentley"));
        vehicles.add(new Plane("Concord"));
        System.out.println("Added new car and plane!\n" + vehicles);
    }
}
