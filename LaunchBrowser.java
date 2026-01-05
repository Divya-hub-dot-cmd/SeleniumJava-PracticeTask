package week1.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		if(title.equals("Google")) {
			System.out.println(title + "Title is verified");
		}
		String currentUrl=driver.getCurrentUrl();
		if(currentUrl.contains("https://www.google.com")) {
			System.out.println(currentUrl+ "URL is Verified");
		}
		driver.quit();
	
		
		

	}

}
