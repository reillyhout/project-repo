
/**
 * Enhanced interface for Sailor.
 */
public interface Sailor extends SailorKernel {
    /**
     * Increases the sailor's saltiness by complaining.
     *
     * @updates this
     * @ensures saltiness of this has increased by 5
     */
    void complain();

    /**
     * Reports whether this sailor can be promoted.
     *
     * @return true iff this sailor is eligible for promotion
     * @ensures canPromote = (experience of this >= 100 and saltiness of this <
     *          80)
     */
    boolean canPromote();

    /**
     * Promotes this sailor if eligible.
     *
     * @updates this
     * @ensures this is promoted if eligible; otherwise this is unchanged
     */
    void promote();
}