package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	//tests arabic2roman
	@Test
	public void testzeroarabic () {
		//Given
		String input = "0";
		String expected = "0";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
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
	
	//tests roman2arabic
	@Test
	public void testzeroroman () {
		//Given
		String input = "0";
		String expected = "0";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testI_1 () {
		//Given
		String input = "I";
		String expected = "1";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIII_3 () {
		//Given
		String input = "III";
		String expected = "3";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIV_4 () {
		//Given
		String input = "IV";
		String expected = "4";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testVII_7 () {
		//Given
		String input = "VII";
		String expected = "7";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIX_9 () {
		//Given
		String input = "IX";
		String expected = "9";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testXIX_19 () {
		//Given
		String input = "XIX";
		String expected = "19";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testXLIV_44 () {
		//Given
		String input = "XLIV";
		String expected = "44";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testLII_52 () {
		//Given
		String input = "LII";
		String expected = "52";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testXCVIII_98 () {
		//Given
		String input = "XCVIII";
		String expected = "98";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testCDXXIII_423 () {
		//Given
		String input = "CDXXIII";
		String expected = "423";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void testDCCXLV_745 () {
		//Given
		String input = "DCCXLV";
		String expected = "745";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testCMXCIX_999 () {
		//Given
		String input = "CMXCIX";
		String expected = "999";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testMMMCDLXXXIII_3483 () {
		//Given
		String input = "MMMCDLXXXIII";
		String expected = "3483";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testMMMCMXCIX_3999 () {
		//Given
		String input = "MMMCMXCIX";
		String expected = "3999";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testMMMMCDXC_4490() {
		//Given
		String input = "MMMMCDXC";
		String expected = "4490";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
}