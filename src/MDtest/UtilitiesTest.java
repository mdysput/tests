package MDtest;

import org.junit.Test;


import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyWithChar() {

        Utilities utils = new Utilities();
        char[] output = utils.everyWithChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char[] output2 = utils.everyWithChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output2);

    }

    @Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        System.out.println();
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEFF"));
        System.out.println();
        assertNull("did not get null returned", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", "");
    }

    @Test
    public void converter() {
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void convert_artmeticException() throws Exception {
        Utilities util = new Utilities();
        util.converter(10, 0);
    }

    @Test
    public void nullIfOddLenght() throws Exception {
        Utilities util = new Utilities();
        assertNull(util.nullIfOddLenght("odd"));
        assertNotNull(util.nullIfOddLenght("even"));
    }
}