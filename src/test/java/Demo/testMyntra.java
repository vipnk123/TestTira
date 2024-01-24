package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testMyntra {

@Test
	
	public void perfumeTest() {
	
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		//Assert.assertEquals("Pune", "Mumbai");
		System.out.println("Good Morning");
		
    }
}
