public class Person {
	private String name; // private = restricted access
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter 
	public void setName(String newName) {
		this.name = newName;
	}
}
 class Main {
	public static void main(String[]args) {
		Person myObj = new Person();
		myObj.setName("Alexandre"); // Set the valie of the
		System.out.println(myObj.getName());
		
		// Outputs "John"
	}
}