/**
 * Kernel implementation for Sailor.
 *
 * @convention experience >= 0 and saltiness >= 0 and yearsForeTheMast >=0 and
 *             rank is not null.
 * @correspondence this = (experience, saltiness, yearsForeTheMast, rank)
 */

public final class Sailor1 extends SailorSecondary {
    /**
     * Default years fore the mast.
     */
    private static final int DEFAULT_YEARS = 100;

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
        this.rank = "E-1";
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
    public void transferFrom();
    /*
     * um so i see how this is done on the other projects in the pre filled out
     * stuff but i really am not sure how to implement it here so i think im
     * going to try to mimic what was done in the other projects.
     */
    assert source!=null:"Violation of: source is not null";assert source!=this:"Violation of: source is not this";assert

    source instanceOf Sailor1:"Violation of: source is of dynamic type Sailor1";

}
