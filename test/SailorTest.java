import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit tests for secondary methods of {@code Sailor}.
 */

public class SailorTest {

    @Test
    public void testComplain() {
        Sailor s = new Sailor1();

        s.complain();

        assertEquals(5, s.getSaltiness());
        assertEquals(0, s.getExperience());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testCanPromoteFalseInitially() {
        Sailor s = new Sailor1();

        assertEquals(false, s.canPromote());
        assertEquals(0, s.getExperience());
        assertEquals(0, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testCanPromoteTrue() {
        Sailor s = new Sailor1();

        s.addExperience(100);
        s.addSaltiness(81);

        assertEquals(true, s.canPromote());
        assertEquals(100, s.getExperience());
        assertEquals(81, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testPromote() {
        Sailor s = new Sailor1();

        s.addExperience(100);
        s.addSaltiness(81);
        s.promote();

        assertEquals(100, s.getExperience());
        assertEquals(81, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-2", s.getRank());
    }

    @Test
    public void testPromoteWhenNotEligible() {
        Sailor s = new Sailor1();

        s.promote();

        assertEquals(0, s.getExperience());
        assertEquals(0, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testToString() {
        Sailor s = new Sailor1();

        assertEquals(
                "Rank: E-1, Experience: 0, Saltiness: 0, Years 'fore the mast: 100",
                s.toString());
    }

    @Test
    public void testEqualsSameObject() {
        Sailor s = new Sailor1();

        assertEquals(true, s.equals(s));
    }

    @Test
    public void testEqualsDifferentObjectSameState() {
        Sailor s1 = new Sailor1();
        Sailor s2 = new Sailor1();

        assertEquals(false, s1.equals(s2));
    }
}
