package sikuliTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://www.youtube.com/watch?v=xbMF6zBzaKI");
		driver.get("https://tekarch.com/");
		
		
		Screen s = new Screen();
		 
		//TekarchLogin
		Pattern image = new Pattern("C:\\All_Eclipse_Projects\\sikuliTest\\TekarchLogo.png").similar(0.25f);
		 try {
	            // Wait for the image to appear on the screen with 95% similarity, timeout is 10 seconds
	            s.wait(image, 10);

	            // If the image is found, perform the action or assert success
	            System.out.println("Image matched with at least 95% precision!");

	        } catch (FindFailed e) {
	            // Handle the case where the image is not found or doesn't match with enough precision
	            System.out.println("Image did not match with 95% precision or was not found.");
	        } 
		
		 
		 Pattern loginbtn = new Pattern("C:\\All_Eclipse_Projects\\sikuliTest\\login.png");
		 s.wait(loginbtn,5000);
		 s.click(loginbtn);
		 System.out.println("login button found!and clicked");
		 driver.close();
		 
		/*YouTube Test 
		 Pattern pause = new Pattern("C:\\All_Eclipse_Projects\\sikuliTest\\pause.png"); 
		  try {
			s.wait(pause,10000);
			 System.out.println("Pause button found!");
			 s.click();
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			 System.out.println("Play button not found!");
			e.printStackTrace();
		}
		 */

		 
	}

}
