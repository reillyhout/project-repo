/**
 * Demonstrates a longer career simulation using the Sailor component.
 */
public final class SailorCareerSimulation {

    /**
     * Number of years to simulate.
     */
    private static final int YEARS_TO_SIMULATE = 3;

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private SailorCareerSimulation() {
    }

    /**
     * Runs the career simulation demo.
     *
     * @param args
     *            command-line arguments
     */
    public static void main(String[] args) {
        Sailor sailor = new Sailor1();

        System.out.println("Starting sailor:");
        System.out.println(sailor);

        for (int i = 0; i < YEARS_TO_SIMULATE; i++) {
            sailor.serveYear();
            System.out.println("After year " + (i + 1) + ":");
            System.out.println(sailor);
        }
    }
}
