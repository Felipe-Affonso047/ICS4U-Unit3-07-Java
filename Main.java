/*
* This program test vehicle class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-22
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int FITHTEEN = 15;

    /**
    * Constant.
    */
    public static final int TEN = 10;

    /**
    * Constant.
    */
    public static final int ONE_HUNDRED = 100;

    /**
    * Constant.
    */
    public static final int FOUR = 4;

    /**
    * Constant.
    */
    public static final int FOURTY = 40;

    /**
    * Constant.
    */
    public static final String NEW_SPEED = "New speed:";

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Bike bmx = new Bike("Red", FOURTY);

        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("Set the cadense to 10\n");
        bmx.setCadense(TEN);
        bmx.status();

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(FITHTEEN);
        bmx.status();

        System.out.println("\nRing bell.");

        final Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(TEN, TEN);
        System.out.println(NEW_SPEED + bigTruck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(TEN, TEN);
        System.out.println(NEW_SPEED + bigTruck.getSpeed());

        System.out.println("\nApplyed air pressure of 10:");
        bigTruck.applyAir(10);
        System.out.println(NEW_SPEED + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
