import components.standard.Standard;

/**
 * Kernel interface for the Sailor component.
 */
public interface SailorKernel extends Standard<Sailor> {

     /**
      * Adds experience to this sailor.
      *
      * @param xp
      *             experience points to add
      *
      * @updates this
      * @ensures experience of this has increased by xp
      */
     void addExperience(int xp);

     /**
      * Adds saltiness to this sailor.
      *
      * @param amount
      *             amount of saltiness to add
      * @updates this
      * @ensures saltiness of this has increased by amount
      */
     void addSaltiness(int amount);

     /**
      * Advances the sailor one year 'fore the mast.
      *
      * @updates this
      * @ensures yearsForeTheMast of this has decreased by 1
      */
     void serveYear();

     /**
      * Reports the current rank of this sailor.
      *
      * @return current rank
      * @ensures getRank = rank of this
      */
     String getRank();

     /**
      * Reports the saltiness of this sailor.
      *
      * @return current saltiness
      * @ensures saltiness = saltiness of this
      */
     int getSaltiness();

     /**
      * Reports the number of years remaining for this sailor.
      *
      * @return years remaining
      * @ensures getYearsForeTheMast = yearsForeTheMast of this Reports the
      *          number of years remaining for this sailor.
      *
      * @return years remaining
      * @ensures getYearsForeTheMast = yearsForeTheMast pf this
      */
     int getYearsForeTheMast();
}