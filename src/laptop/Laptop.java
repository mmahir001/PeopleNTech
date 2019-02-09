package laptop;

public class Laptop {
	
	public String laptop;
	public static String purpose;
	public int value;
	public static int years;
	
	public Laptop(String laptop){
		this.laptop = laptop;
		System.out.println(laptop);
	}
	
	public Laptop(int laptop){
		this.value = value;
		System.out.println("I use this laptop " + laptop + " times a week.");
	}

	public static void cost(){
		int cost = 1200;
		System.out.println("I baught this laptop for $" + cost);
	}
	
	public static void purpose(){
		purpose = "I use this laptop to mostly work on class work.";
		System.out.println(purpose);
	}
	
}