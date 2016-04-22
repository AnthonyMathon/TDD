package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void test1_I () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test3_III () {
		//Given
		String input = "3";
		String expected = "III";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test4_IV () {
		//Given
		String input = "4";
		String expected = "IV";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test7_VII () {
		//Given
		String input = "7";
		String expected = "VII";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test9_IX () {
		//Given
		String input = "9";
		String expected = "IX";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test19_XIX () {
		//Given
		String input = "19";
		String expected = "XIX";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test44_XLIV () {
		//Given
		String input = "44";
		String expected = "XLIV";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test52_LII () {
		//Given
		String input = "52";
		String expected = "LII";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test98_XCVIII () {
		//Given
		String input = "98";
		String expected = "XCVIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test423_CDXXIII () {
		//Given
		String input = "423";
		String expected = "CDXXIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test745_DCCXLV () {
		//Given
		String input = "745";
		String expected = "DCCXLV";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test999_CMXCIX () {
		//Given
		String input = "999";
		String expected = "CMXCIX";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test3483_MMMCDLXXXIII () {
		//Given
		String input = "3483";
		String expected = "MMMCDLXXXIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test3999_MMMCMXCIX () {
		//Given
		String input = "3999";
		String expected = "MMMCMXCIX";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test4490_MMMMCDXC () {
		//Given
		String input = "4490";
		String expected = "MMMMCDXC";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}

}
