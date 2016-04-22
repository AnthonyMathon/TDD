package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String resultat = "";
		if (arabe == "0"){return "0";}
		while (Integer.parseInt(arabe)>=1000){
			resultat = resultat+"M";
			arabe = ""+ (Integer.parseInt(arabe)-1000);
		}
		if (Integer.parseInt(arabe)>=900){
			resultat = resultat+"CM";
			arabe = ""+ (Integer.parseInt(arabe)-900);
		}
		while (Integer.parseInt(arabe)>=500){
			resultat = resultat+"D";
			arabe = ""+ (Integer.parseInt(arabe)-500);
		}
		if (Integer.parseInt(arabe)>=400){
			resultat = resultat+"CD";
			arabe = ""+ (Integer.parseInt(arabe)-400);
		}
		while (Integer.parseInt(arabe)>=100){
			resultat = resultat+"C";
			arabe = ""+ (Integer.parseInt(arabe)-100);
		}
		if (Integer.parseInt(arabe)>=90){
			resultat = resultat+"XC";
			arabe = ""+ (Integer.parseInt(arabe)-90);
		}
		while (Integer.parseInt(arabe)>=50){
			resultat = resultat+"L";
			arabe = ""+ (Integer.parseInt(arabe)-50);
		}
		if (Integer.parseInt(arabe)>=40){
			resultat = resultat+"XL";
			arabe = ""+ (Integer.parseInt(arabe)-40);
		}
		while (Integer.parseInt(arabe)>=10){
			resultat = resultat+"X";
			arabe = ""+ (Integer.parseInt(arabe)-10);
		}
		if (Integer.parseInt(arabe)>=9){
			resultat = resultat+"IX";
			arabe = ""+ (Integer.parseInt(arabe)-9);
		}
		while (Integer.parseInt(arabe)>=5){
			resultat = resultat+"V";
			arabe = ""+ (Integer.parseInt(arabe)-5);
		}
		if (Integer.parseInt(arabe)>=4){
			resultat = resultat+"IV";
			arabe = ""+ (Integer.parseInt(arabe)-4);
		}
		while (Integer.parseInt(arabe)>=1){
			resultat = resultat+"I";
			arabe = ""+ (Integer.parseInt(arabe)-1);
		}
		return resultat;
	}


	public String convertFromRoman(String roman) {
		if (roman == "0"){return "0";}
		int resultat=0;
		
			while (roman != "" && roman.charAt(0) == 'M'){
				roman = roman.substring(1,roman.length());
				resultat += 1000;
			}
			if (roman != "" && roman.charAt(0)== 'C' && roman.charAt(1)=='M'){
				roman = roman.substring(2,roman.length());
				resultat += 900;
			}
			if (roman != "" && roman.charAt(0) == 'D'){
				roman = roman.substring(1,roman.length());
				resultat += 500;
			}
			if (roman != "" && roman.charAt(0)== 'C' && roman.charAt(1)=='D') {
				roman = roman.substring(2,roman.length());
				resultat += 400;
			}
			while (roman != "" && roman.charAt(0) == 'C'){
				roman = roman.substring(1,roman.length());
				resultat += 100;
			}
			if (roman != "" && roman.charAt(0)== 'X' && roman.charAt(1)=='C') {
				roman = roman.substring(2,roman.length());
				resultat += 90;
			}
			if (roman != "" && roman.charAt(0) == 'L'){
				roman = roman.substring(1,roman.length());
				resultat += 50;
			}
			if (roman != "" && roman.charAt(0)== 'X' && roman.charAt(1)=='L') {
				roman = roman.substring(2,roman.length());
				resultat += 40;
			}
			while (roman != "" && roman.charAt(0) == 'X'){
				roman = roman.substring(1,roman.length());
				resultat += 10;
			}
			if (roman != "" && roman.charAt(0)== 'I' && roman.charAt(1)=='X') {
				roman = roman.substring(2,roman.length());
				resultat += 9;
			}
			if (roman != "" && roman.charAt(0)== 'V') {
				roman = roman.substring(1,roman.length());
				resultat += 5;
			}
			if (roman != "" && roman.charAt(0)== 'I' && roman.charAt(1)=='V') {
				roman = roman.substring(2,roman.length());
				resultat += 4;
			}
			while (roman != "" && roman.charAt(0) == 'I'){
				roman = roman.substring(1,roman.length());
				resultat += 1;
			}
		
		return ""+resultat;
	}

}
