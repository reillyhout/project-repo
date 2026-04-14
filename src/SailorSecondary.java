/**
 * Secondary methods for Sailor.
 */
public abstract class SailorSecondary implements Sailor {

    /**
     * Saltiness added when a sailor complains.
     */
    private static final int COMPLAIN_SALTINESS = 5;

    /**
     * Minimum experience needed for promotion.
     */
    private static final int PROMOTION_EXPERIENCE = 100;

    /**
     * Mimum saltiness needed for promotion.
     */
    private static final int PROMOTION_SALTINESS = 80;

    /**
     * Increases this sailor's saltiness by complaining.
     */
    @Override
    public void complain() {
        this.addSaltiness(COMPLAIN_SALTINESS);
    }

    /**
     * Reports whether this sailor can be promoted.
     */
    @Override
    public boolean canPromote() {
        return this.getExperience() >= PROMOTION_EXPERIENCE
                && this.getSaltiness() > PROMOTION_SALTINESS;
    }

    /**
     * Promotes this sailor if eligible.
     */
    @Override
    public void promote() {
        if (this.canPromote()) {
            this.advanceRank();
        }
    }

    /**
     * Returns a string representation of this sailor.
     *
     * @return string representation of this sailor
     */
    @Override
    public String toString() {
        String result = "Rank: " + this.getRank() + ", Experience: "
                + this.getExperience() + ", Saltiness: " + this.getSaltiness()
                + ", Years 'fore the mast: " + this.getYearsForeTheMast();

        return result;
    }
}
