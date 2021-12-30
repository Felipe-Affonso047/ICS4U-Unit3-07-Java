/*
* This program is a Vehicle class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-22
*/

/**
 * Vehicle.
 */
public class Vehicle {
    /**
    * Speed variable.
    */
    private int speed;

    /**
    * MaxSpeed variable.
    */
    private int maxSpeed;

    /**
    * Colour variable.
    */
    private String colour;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param inicialPlate plate
    * @param inicialDoor door
    * @param topSpeed speed
    */
    public void Vehicle(final String inicialColour, final int topSpeed) {
        this.colour = inicialColour;
        this.maxSpeed = topSpeed;
        this.speed = 0;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Setter.
    *
    * @param newColour good
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
    * Print all.
    */
    public void status() {
        System.out.println("Speed: " + speed + "\nMaxSpeed: " + maxSpeed
                           + "\nColour: " + colour);
    }

    /**
    * Accelerate.
    *
    * @param accPow power of acceleration
    * @param accTime time of acceleration
    */
    public void accelerate(final int accPow, final int accTime) {
        this.speed = (accPow * accTime) + this.speed;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
    * Breake.
    *
    * @param breakPow break power
    * @param breakTime time of break
    */
    public void breake(final int breakPow, final int breakTime) {
        this.speed = this.speed - (breakPow * breakTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
