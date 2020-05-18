package com.cmuhatia.playground.search;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Cornelius M.
 * @version 1.0.0, 18/05/2020
 */
public class KnuthMorrisPrattAlgorithmTest {

    @Test
    public void computeSuffixPrefix() {
        Character[] testChars = {'d', 's', 'g', 'w', 'a', 'd', 's', 'g', 'z'};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 2, 3, 0}, KnuthMorrisPrattAlgorithm.computeSuffixPrefix(testChars));
        testChars = new Character[]{'d', 's', 'g', 'w', 'a', 'd', 's', 'g'};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 2, 3}, KnuthMorrisPrattAlgorithm.computeSuffixPrefix(testChars));
        testChars = new Character[]{'a', 'b', 'a', 'b', 'd'};
        assertArrayEquals(new int[]{0, 0, 1, 2, 0}, KnuthMorrisPrattAlgorithm.computeSuffixPrefix(testChars));
        testChars = new Character[]{'a', 'b', 'c', 'd', 'a', 'b', 'c', 'a'};
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 2, 3, 1}, KnuthMorrisPrattAlgorithm.computeSuffixPrefix(testChars));
        testChars = new Character[]{'a', 'a', 'b', 'a', 'a', 'b', 'a', 'a', 'a'};
        assertArrayEquals(new int[]{0, 1, 0, 1, 2, 3, 4, 5, 2}, KnuthMorrisPrattAlgorithm.computeSuffixPrefix(testChars));
    }

    @Test
    public void contains() {
        Character[] testChars = {'d', 's', 'g', 'w', 'a', 'd', 's', 'g', 'z'};
        assertTrue(KnuthMorrisPrattAlgorithm.contains(testChars, new Character[]{'w', 'a', 'd'}));
        assertFalse(KnuthMorrisPrattAlgorithm.contains(testChars, new Character[]{'w', 'a', 'x'}));
        Integer[] testInts = {1, 2, 3, 0, 0, 4, 5};
        assertTrue(KnuthMorrisPrattAlgorithm.contains(testInts, new Integer[]{2, 3, 0}));
        String sentence = "In computer science, the Knuth–Morris–Pratt string-searching algorithm (or KMP algorithm) " +
                "searches for occurrences of a \"word\" W";
        assertTrue(KnuthMorrisPrattAlgorithm.contains(ArrayUtils.toObject(sentence.toCharArray()),
                ArrayUtils.toObject("\"word\"".toCharArray())));
    }
}