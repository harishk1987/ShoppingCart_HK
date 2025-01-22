package PracticeDDT;

import org.testng.annotations.Test;

public class ReadRunTimeMavenTest {

	@Test
	public void RunTest() {
		String URL=System.getProperty("url");
		System.out.println("Env Data==>URL==>"+URL);
		
	}
}
