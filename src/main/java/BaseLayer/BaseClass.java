package BaseLayer;

import java.time.Duration;

public class BaseClass {
	
	
	
	public static void intialization() {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 
	
}

}
