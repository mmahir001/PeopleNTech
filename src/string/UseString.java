package string;

public class UseString {
	
	public static void main(String[] args) {
		
		String val1 = "Testing diffrent types of string methods";
		String val2  = "Strings are fun";
		String val3 = "empty value";
		String val4 = "This will take about 30 minutes"; 
		String val5 = "";
		
		System.out.println(val3.length());
		System.out.println(val3.hashCode());
		System.out.println(val4.getBytes());
		System.out.println(val2.trim());
		System.out.println(val3.charAt(2));
		System.out.println(val1.compareTo(val5));
		System.out.println(val3.equals(val1));
		System.out.println(val5.toString());
		System.out.println(val3.valueOf(2));
		System.out.println(val4.substring(2, 5));
		System.out.println(val1.equalsIgnoreCase(val2));
		System.out.println(val3.replace("y","i"));
		System.out.println(val1.replaceAll("T", "s"));
		System.out.println(val3.replaceFirst("e", "3"));
		System.out.println(val2.contentEquals("test"));
		System.out.println(val1.indexOf("s"));
		System.out.println(val4.startsWith("0"));
		System.out.println(val3.concat(" " +val4));
		System.out.println(val2.replaceFirst("S", "C"));
		System.out.println(val1.toUpperCase());
		System.out.println(val4.toLowerCase());
		System.out.println(val3.indexOf("t"));
		System.out.println(val2.intern());
		System.out.println(val4.lastIndexOf("e"));
		System.out.println(val2.endsWith("z"));
		System.out.println(val3.isEmpty());
		System.out.println(val4.split("a"));
		System.out.println(val1.compareToIgnoreCase("of"));
		System.out.println(val3.join("awsome"));
		System.out.println(val2.contains("test"));
		
		}
}
