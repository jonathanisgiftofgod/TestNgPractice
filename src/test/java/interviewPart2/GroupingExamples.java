package interviewPart2;

import org.testng.annotations.Test;

public class GroupingExamples {
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple Testing 1");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple Testing 2");
	}
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("Moto 1");
	}
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("moto 2");
	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("vivo Testing 1");
	}
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("vivo Testing 2");
	}
	@Test(groups= {"lennova"})
	public void lennova1() {
		System.out.println("lennova 1");
	}
	@Test(groups= {"lennova"})
	public void lennova2() {
		System.out.println("lennova 2");
	}
	
}
