package com.platzi.javatests.romanNumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {
    @Test
    public void return_I_when_input_is_1() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals( "I",romanNumerals.arabicToRoman(1));
        assertEquals( "II",romanNumerals.arabicToRoman(2));
        assertEquals( "III",romanNumerals.arabicToRoman(3));
        assertEquals( "IV",romanNumerals.arabicToRoman(4));
        assertEquals( "V",romanNumerals.arabicToRoman(5));
        assertEquals( "VI",romanNumerals.arabicToRoman(6));
        assertEquals("VII",romanNumerals.arabicToRoman(7));
        assertEquals("VIII",romanNumerals.arabicToRoman(8));
        assertEquals("IX", romanNumerals.arabicToRoman(9));
        assertEquals("X",romanNumerals.arabicToRoman(10));
        assertEquals("XI",romanNumerals.arabicToRoman(11));
        assertEquals("XII",romanNumerals.arabicToRoman(12));
        assertEquals("XIII",romanNumerals.arabicToRoman(13));
        assertEquals("XIV",romanNumerals.arabicToRoman(14));
        assertEquals( "XV",romanNumerals.arabicToRoman(15));
        assertEquals("XVI",romanNumerals.arabicToRoman(16));
        assertEquals("XIX",romanNumerals.arabicToRoman(19));
        assertEquals("XXIV",romanNumerals.arabicToRoman(24));
        assertEquals("XL",romanNumerals.arabicToRoman(40));
        assertEquals("XLIX",romanNumerals.arabicToRoman(49));
        assertEquals("L",romanNumerals.arabicToRoman(50));
        assertEquals("LI",romanNumerals.arabicToRoman(51));
        assertEquals( "LV",romanNumerals.arabicToRoman(55));
        assertEquals("LVI",romanNumerals.arabicToRoman(56));
        assertEquals( "LX",romanNumerals.arabicToRoman(60));
        assertEquals("LXX",romanNumerals.arabicToRoman(70));
        assertEquals( "LXXX",romanNumerals.arabicToRoman(80));
        assertEquals("LXXXVI",romanNumerals.arabicToRoman(86));
        assertEquals("XC",romanNumerals.arabicToRoman(90));
        assertEquals("XCIX",romanNumerals.arabicToRoman(99));
        assertEquals( "CXXVI",romanNumerals.arabicToRoman(126));
        assertEquals( "CD",romanNumerals.arabicToRoman(400));
        assertEquals( "CDXLIV",romanNumerals.arabicToRoman(444));
        assertEquals( "CDLXIX",romanNumerals.arabicToRoman(469));
        assertEquals( "CM",romanNumerals.arabicToRoman(900));
        assertEquals( "MMDVII",romanNumerals.arabicToRoman(2507));



    }
}