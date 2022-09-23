package weeks.week_04;

public class StringPractice {
	
	public static void main(String[] args) {
		
		length();
		substring();
		equalsIgnoreCase();
		contains();
		trim();
		charAt();
		toLowerCase();
		toUpperCase();
		interview();
		vowelsToX();
		stringVowelsOnly();
		stringVowelsOnly2();
		stringConsonantsOnly();
		noDublicateStr();
		
		
	}

	public static void length() {
		
		String temp = "I love Inar Academy";
		
		int length = temp.length();
		
		System.out.println(length);
		
	}
	
	public static void substring(){
		
		String temp = "Inar Academy";
		String yeni = temp.substring(0,5);
		
		System.out.println(temp);
		System.out.println(yeni);
	}
	
	public static void equalsIgnoreCase(){
		
		String str1 = "qwert";
		String str2 = "QwErT";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}
	
	public static void contains() {
		
		String str1 = "Ertugrul";
		String str2 = "tugrul";
		
		System.out.println(str1.contains(str2));
		
	}
	
	public static void trim(){
		
		String str = "          Ertugrul Donmez Trimmed          ";
		
		System.out.println(str.trim());
	}
	
	public static void charAt(){
		
		String str = "IAHL";
		
		System.out.println(str.charAt(2));
	}
	
	public static void toLowerCase(){
		
		String str ="ERTUGRUL DONMEZ TO LOWER CASE";
		
		System.out.println(str.toLowerCase());
	}
	
	public static void toUpperCase(){
		
		String str = "ertugrul donmez to upper case";
		
		System.out.println(str.toUpperCase());
		
		
	}
	
	public static void interview(){
		
		int i = -2524;
		
		String num =""+i;
		System.out.println(num);
		
		System.out.println(String.valueOf(i));
		
		System.out.println(Integer.toString(i));
	}
	
	public static void vowelsToX(){
		
		String str = "Java is Fun!!";
		
		String x = str.replace('a', 'X');
		x = x.replace('e', 'X');
		x = x.replace('i', 'X');
		x = x.replace('o', 'X');
		x = x.replace('u', 'X');
		x = x.replace('A', 'X');
		x = x.replace('E', 'X');
		x = x.replace('I', 'X');
		x = x.replace('O', 'X');
		x = x.replace('U', 'X');
		
		System.out.println(x);
		
	}
	
	public static void stringVowelsOnly(){
		
		String str = "ertugrul donmez";
		
		String result ="";
		
		for (int i=0; i <(str.length()); i++){
			
			
			char c = str.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				
				result += c;
			}
		}
		System.out.println(result);
	}
	
public static void stringVowelsOnly2(){
		
		String str = "ertugrul donmez";
		
		String result ="";
		
		for (int i=0; i <(str.length()); i++){
			
			
			char c = str.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				
				result += c;
			}
			
		}
		System.out.println(result);
	}
	
public static void stringConsonantsOnly(){
	
	String str = "ertugrul donmez";
	
	String result ="";
	
	for (int i=0; i <(str.length()); i++){
		
		char c = str.charAt(i);
		
		if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
			
			result = result + c;
			
		}
	}
	System.out.println(result);
}

public static void noDublicateStr(){

	String str = "Inar academy";
	String sum = "";
		
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		
		if (sum.contains("" + ch) == false) {
			sum += ch;
			}
		}
		System.out.println(sum);

	}
}
