package Gitprograms;

	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test1{
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver x=new ChromeDriver();
	  x.get("http://www.google.co.in");
	  Thread.sleep(5000);
	  x.close();
		}

	}
