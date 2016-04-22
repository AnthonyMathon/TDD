package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String resultat = "";
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
		int resultat=0;
		
		return ""+resultat;
	}

}
