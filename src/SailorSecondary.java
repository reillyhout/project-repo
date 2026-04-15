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

/**
     * Reports whether this is equal to the given object.
     *
     * @param obj
     *            the object to compare with this
     * @return true iff the given object is a Sailor with the same state as this
     */
    @Override
    public boolean equals(Object obj) {
        boolean areEqual = false;

        if (obj instanceof Sailor) {
            Sailor other = (Sailor) obj;

            areEqual = this.getRank().equals(other.getRank())
                    && this.getExperience() == other.getExperience()
                    && this.getSaltiness() == other.getSaltiness()
                    && this.getYearsForeTheMast()
                            == other.getYearsForeTheMast();
        }

        return areEqual;
    }
    //i had absolutely no idea how to do this. i googled it and tried to copy down 
    //the sailor specific equivelant of what the person on reddit said 
}
