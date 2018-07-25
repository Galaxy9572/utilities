package com.github;

import com.github.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for StringUtils
 */
public class StringUtilsTest {
    /**
     * Test StringUtils.isBlank()
     */
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank("\t"));
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(!StringUtils.isBlank("Google\t"));
    }

    /**
     * Test StringUtils.isEmpty()
     */
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(!StringUtils.isEmpty(" "));
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(!StringUtils.isEmpty("Google\t"));
    }

    /**
     * Test StringUtils.trim()
     */
    @Test
    public void testTrim() {
        Assert.assertEquals("abc", StringUtils.trim("    abc  "));
        assertNotEquals("abc", StringUtils.trim(" ab c "));
        assertNotEquals(null, StringUtils.trim(""));
    }

    /**
     * Test StringUtils.removeAllWhiteSpace()
     */
    @Test
    public void testRemoveAllWhiteSpace() {
        assertEquals("abc", StringUtils.removeAllWhiteSpace("abc"));
        assertEquals("abc", StringUtils.removeAllWhiteSpace(" \n   a\t\rbc  "));
        assertEquals("abc", StringUtils.removeAllWhiteSpace(" a\nb \tc"));
        assertNotEquals(null, StringUtils.removeAllWhiteSpace(""));
    }

    /**
     * Test StringUtils.toCamelCase()
     */
    @Test
    public void testCamelCaseToUnderline() {
        assertEquals("world_cup", StringUtils.camelCaseToUnderline("worldCup", false));
        assertEquals("WORLD_CUP", StringUtils.camelCaseToUnderline("worldCup", true));
    }

    /**
     * Test StringUtils.toCamelCase()
     */
    @Test
    public void testToCamelCase() {
        assertEquals("worldCup", StringUtils.toCamelCase("world_cup", '_'));
        assertEquals("worldCup", StringUtils.toCamelCase("world cup", ' '));
    }
}
