package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step1  get the java represtenation object of physical file
		FileInputStream fis=new FileInputStream("./Data/CommonData.properties");
		// Step 2 using properties class load all the keys
		Properties obj=new Properties();
		obj.load(fis);
		String BROWSER=obj.getProperty("browser");
		String URL=obj.getProperty("url");
		String UserName=obj.getProperty("username");
		String Password=obj.getProperty("password");
		//Step 3: get the value bvase on key
		/*System.out.println(URL);
		 
		 
		
		System.out.println(UserName);
		System.out.println(Password);*/
		WebDriver driver=null;
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(UserName);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
