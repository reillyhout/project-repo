public final class Sailor1 {
    private int experience;
    private int saltiness;
    private int yearsForeTheMast;
    private String rank;

    public Sailor1() {
        this.experience = 0;
        this.saltiness = 0;
        this.yearsForeTheMast = 100;
        this.rank = "E-1";
    }

    public void serveYear() {
        if (this.yearsForeTheMast > 0) {
            this.yearsForeTheMast--;
            this.experience += 50;
            this.saltiness += 10;

        }
        if (this.yearsForeTheMast == 0) {
            this.mutiny();
        }
    }

    public void complain() {
        this.saltiness += 5;
    }

    public boolean canPromote() {
        return this.experience >= 100 && this.saltiness < 80;
    }

    public void promote() {
        if (this.canPromote()) {
            this.rank = "E-2";
            this.experience = 0;
        }
    }

    public void addExperience(int xp) {
        this.experience += xp;
    }

    private void mutiny() {
        System.out.println("Mutiny! A hundred years 'fore the mast!");
        this.rank = "E-1";
        this.experience = 0;
        this.saltiness = 0;
        this.yearsForeTheMast = 100;
    }

    public String getRank() {
        return this.rank;
    }

    public int getYearsForeTheMast() {
        return this.yearsForeTheMast;
    }

    public static void main(String[] args) {

        Sailor1 s = new Sailor1();

        System.out.println("Starting rank: " + s.getRank());

        for (int i = 0; i < 100; i++) {
            s.serveYear();
        }

        System.out.println("Final rank: " + s.getRank());
        System.out.println("Years 'fore the mast: " + s.getYearsForeTheMast());
    }

}