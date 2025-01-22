/**
 * 
 */
package PracticeDDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

/**
 * @author Lenovo
 *
 */
public class ReadDataTestNGXmlTest {
	@Test
	public void SampleTest(XmlTest test)
	
	{
		System.out.println("executing Sample Test");
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("url"));
	}

}
