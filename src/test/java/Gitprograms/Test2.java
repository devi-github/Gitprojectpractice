package Gitprograms;

	import org.openqa.selenium.WebDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test2{
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	  WebDriver driver=WebDriverManager.chromedriver().create();
	  Thread.sleep(5000);
	  driver.get("http://www.google.co.in");
		}

	}

