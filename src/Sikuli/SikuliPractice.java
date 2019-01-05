package Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuliPractice {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		   WebDriver anew= new ChromeDriver(); 
		  anew.manage().window().maximize();
		  anew.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  anew.get("https://www.facebook.com/");
		  Screen  screen= new Screen();
		  
		  Pattern un = new Pattern("D:\\fb\\email.png");
		  screen.wait(un,10);
		  screen.type(un,"sangledarshna@gmai.com");
		  
		  Pattern pw = new Pattern("D:\\fb\\password.png");
		  screen.wait(pw,10);
		  screen.type(pw,"Abcd@1234");

		  Pattern login = new Pattern("D:\\fb\\login.png");
		  screen.wait(login,10);
		  screen.click(login);
		  
		  
	}

}
