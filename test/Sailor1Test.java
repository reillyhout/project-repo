import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit tests for {@code Sailor1}.
 */
public class Sailor1Test {

    @Test
    public void testConstructor() {
        Sailor s = new Sailor1();

        assertEquals(0, getExperience());
        assertEquals(0, getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testAddSaltiness() {
        Sailor s = new Sailor1();

        s.addSaltiness(15);

        assertEquals(0, s.getExperience());
        assertEquals(15, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testServeYear() {
        Sailor s = new Sailor1();

        s.serveYear();

        assertEquals(50, s.getExperience());
        assertEquals(10, s.getSaltiness());
        assertEquals(99, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testAdvanceRankFromE1() {
        Sailor s = new Sailor1();

        s.advanceRank();

        assertEquals("E-2", s.getRank());
        assertEquals(0, s.getExperience());
        assertEquals(0, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
    }

    @Test
    public void testClear() {
        Sailor s = new Sailor1();

        s.addExperience(20);
        s.addSaltiness(30);
        s.advanceRank();
        s.clear();

        assertEquals(0, s.getExperience());
        assertEquals(0, s.getSaltiness());
        assertEquals(100, s.getYearsForeTheMast());
        assertEquals("E-1", s.getRank());
    }

    @Test
    public void testNewInstance() {
        Sailor s = new Sailor1();
        Sailor newS = s.newInstance();

        assertEquals(0, newS.getExperience());
        assertEquals(0, newS.getSaltiness());
        assertEquals(100, newS.getYearsForeTheMast());
        assertEquals("E-1", newS.getRank());
    }

    @Test
    public void testTransferFrom() {
        Sailor source = new Sailor1();
        Sailor target = new Sailor1();

        source.addExperience(40);
        source.addSaltiness(25);
        source.advanceRank();

        target.transferFrom(source);

        assertEquals(40, target.getExperience());
        assertEquals(25, target.getSaltiness());
        assertEquals(100, target.getYearsForeTheMast());
        assertEquals("E-2", target.getRank());

        assertEquals(0, source.getExperience());
        assertEquals(0, source.getSaltiness());
        assertEquals(100, source.getYearsForeTheMast());
        assertEquals("E-1", source.getRank());
    }
}
