package manisample;

import org.testng.annotations.Test;

public class Program1 {
	@Test
	public void demo() {
		System.out.println("First jenkins project");
		System.out.println("Second maven project");
	}

	@Test
	public void democycle() {
		System.out.println("First jenkins project");
		System.out.println("Second maven project");

		System.out.println("First jenkins project");
		System.out.println("First jenkins project");
		System.out.println("Second maven project");
	}

}
}
