/**
 * Demonstrates promotion-related use of the Sailor component.
 */
public final class SailorPromotionDemo {
    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private SailorPromotionDemo() {
    }

    /**
     * Runs the promotion demo.
     *
     * @param args
     *            command-line arguments
     */
    public static void main(String[] args) {
        Sailor sailor = new Sailor1();

        System.out.println("Initial sailor:");
        System.out.println(sailor);

        sailor.addExperience(100);
        sailor.addSaltiness(81);

        System.out.println("Can promote? " + sailor.canPromote());

        sailor.promote();

        System.out.println("After promotion attempt:");
        System.out.println(sailor);
    }
}
