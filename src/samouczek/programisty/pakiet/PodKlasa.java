package samouczek.programisty.pakiet;

/**
 * to nie jest podklasa
 */

public class PodKlasa {


    public void fillUp(FirstObject car) {
        double toFill = car.FUEL_TANK_CAPACITY - car.fuelLevel;
        System.out.println("Tankuje " + toFill + " litrow.");
        car.fuelLevel = car.FUEL_TANK_CAPACITY;


}}
