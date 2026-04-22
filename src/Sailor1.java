/**
 * Kernel implementation for Sailor.
 *
 * @convention experience >= 0 and saltiness >= 0 and yearsForeTheMast >= 0 and
 *             rank is not null
 * @correspondence this = (experience, saltiness, yearsForeTheMast, rank)
 *
 * @author Reilly Hout
 */

public final class Sailor1 extends SailorSecondary {
    /**
     * Default years fore the mast.
     */
    private static final int DEFAULT_YEARS = 100;

    /**
     * Experience gained from serving one year.
     */
    private static final int YEARLY_EXPERIENCE_GAIN = 50;

    /**
     * Saltiness gained from serving one year.
     */
    private static final int YEARLY_SALTINESS_GAIN = 10;

    /**
     * First sailor rank.
     */
    private static final String RANK_E1 = "E-1";

    /**
     * Second sailor rank.
     */
    private static final String RANK_E2 = "E-2";

    /**
     * Third sailor rank.
     */
    private static final String RANK_E3 = "E-3";

    /**
     * Fourth sailor rank.
     */
    private static final String RANK_E4 = "E-4";

    /**
     * Fifth sailor rank.
     */
    private static final String RANK_E5 = "E-5";

    /**
     * Sixth sailor rank.
     */
    private static final String RANK_E6 = "E-6";

    /**
     * Seventh sailor rank.
     */
    private static final String RANK_E7 = "E-7";

    /**
     * Eighth sailor rank.
     */
    private static final String RANK_E8 = "E-8";

    /**
     * Ninth sailor rank.
     */
    private static final String RANK_E9 = "E-9";

    /**
     * Sailor experience.
     */
    private int experience;

    /**
     * Sailor saltiness.
     */
    private int saltiness;

    /**
     * Years remaining 'fore the mast.
     */
    private int yearsForeTheMast;

    /**
     * Sailor rank.
     */
    private String rank;

    /**
     * Creates a new representation.
     */
    private void createNewRep() {
        this.experience = 0;
        this.saltiness = 0;
        this.yearsForeTheMast = DEFAULT_YEARS;
        this.rank = RANK_E1;
    }

    /**
     * No argument constructor.
     */
    public Sailor1() {
        this.createNewRep();
    }

    @Override
    public Sailor newInstance() {
        return new Sailor1();
    }

    @Override
    public void clear() {
        this.createNewRep();
    }

    @Override
    public void transferFrom(Sailor source) {

        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";

        Sailor1 sourceSailor = (Sailor1) source;

        this.experience = sourceSailor.experience;
        this.saltiness = sourceSailor.saltiness;
        this.yearsForeTheMast = sourceSailor.yearsForeTheMast;
        this.rank = sourceSailor.rank;

        sourceSailor.createNewRep();
    }

    @Override
    public void addExperience(int xp) {
        this.experience = this.experience + xp;
    }

    @Override

    public void addSaltiness(int amount) {
        this.saltiness = this.saltiness + amount;
    }

    @Override
    public void serveYear() {
        if (this.yearsForeTheMast > 0) {
            this.yearsForeTheMast--;
            this.experience = this.experience + YEARLY_EXPERIENCE_GAIN;
            this.saltiness = this.saltiness + YEARLY_SALTINESS_GAIN;
        }
    }

    @Override
    public void advanceRank() {
        if (this.rank.equals(RANK_E1)) {
            this.rank = RANK_E2;
        } else if (this.rank.equals(RANK_E2)) {
            this.rank = RANK_E3;
        } else if (this.rank.equals(RANK_E3)) {
            this.rank = RANK_E4;
        } else if (this.rank.equals(RANK_E4)) {
            this.rank = RANK_E5;
        } else if (this.rank.equals(RANK_E5)) {
            this.rank = RANK_E6;
        } else if (this.rank.equals(RANK_E6)) {
            this.rank = RANK_E7;
        } else if (this.rank.equals(RANK_E7)) {
            this.rank = RANK_E8;
        } else if (this.rank.equals(RANK_E8)) {
            this.rank = RANK_E9;
        }
    }

    @Override
    public int getExperience() {
        return this.experience;
    }

    @Override
    public String getRank() {
        return this.rank;
    }

    @Override
    public int getSaltiness() {
        return this.saltiness;
    }

    @Override
    public int getYearsForeTheMast() {
        return this.yearsForeTheMast;
    }
}
