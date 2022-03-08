package JavaEncapsulation;

public class AccessData {

	public static void main(String[] args) {
		EncapsulationPractice e = new EncapsulationPractice(1);

		e.setFirstName("Hello");
		e.setLastName("World");

		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		e.getMySSN();
		System.out.println("fatima added new update ");

	}
}
