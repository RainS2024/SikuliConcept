package sikuliTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		 Screen screen = new Screen();
		 System.out.println(System.getProperty("user.dir"));
		 Pattern image = new Pattern("C:\\All_Eclipse_Projects\\sikuliTest\\Google_Logo.png").similar(0.80f);
		 try {
	            // Wait for the image to appear on the screen with 95% similarity, timeout is 10 seconds
	            screen.wait(image, 10);

	            // If the image is found, perform the action or assert success
	            System.out.println("Image matched with at least 95% precision!");

	        } catch (FindFailed e) {
	            // Handle the case where the image is not found or doesn't match with enough precision
	            System.out.println("Image did not match with 95% precision or was not found.");
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	
	}
	}


