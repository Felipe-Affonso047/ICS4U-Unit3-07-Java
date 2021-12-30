/*
* This program is a Truck class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-27
*/

/**
 * Truck.
 */
public class Truck extends Vehicle {
    /**
    * License plate variable.
    */
    private String licensePlate;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param topSpeed speed
    * @param inicialPlate plate
    */
    public void Truck(final String inicialColour, final int topSpeed,
                   final String inicialPlate) {
        super(inicialColour, topSpeed);
        this.licensePlate = inicialPlate;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
    * Setter.
    *
    * @param newPlate good
    */
    public void setLicensePlate(final String newPlate) {
        this.licensePlate = newPlate;
    }

    /**
    * Print all.
    */
    public void status() {
        super.status();
        System.out.println("License plate: " + licensePlate);
    }

    /**
    * Apply air.
    *
    * @param airPressure air pressure
    */
    public void applyAir(final int airPressure) {
        speed = speed - airPressure / 2;
    }
}
