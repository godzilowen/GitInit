import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("What you name?");
		
		Scanner in = new Scanner(System.in);
		String name = in.next();
		Hello hello = new Hello(name);
		
		System.out.println(hello.getHello());
	}

}
