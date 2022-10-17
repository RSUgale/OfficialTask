package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRuns 
{
	public static WebDriver driver;
	public static int RunsScoredByPlayer;
	
	@Test(priority=1)
	public void Scorecard() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-scores/2215/ind-vs-sl-final-icc-world-cup-2011");
		driver.manage().window().maximize();
		
		WebElement scorecard=driver.findElement(By.xpath("//a[@class='cb-nav-tab ']"));
		scorecard.click();
		
		WebElement Player1=driver.findElement(By.xpath("//a[text()=' Upul Tharanga '] "));
		String Run1=driver.findElement(By.xpath("//div[text()='2']")).getText();
		System.out.println(Player1.getText()+"= "+Run1);
		
		
		WebElement Player2=driver.findElement(By.xpath("//a[text()=' Tillakaratne Dilshan ']"));
		String Run2=driver.findElement(By.xpath("//div[text()='33']")).getText();
		System.out.println(Player2.getText()+"= "+Run2);
		
		WebElement Player3=driver.findElement(By.xpath("//a[text()=' Kumar Sangakkara ']"));
		String Run3=driver.findElement(By.xpath("//div[text()='48']")).getText();
		System.out.println(Player3.getText()+"= "+Run3);
		
		WebElement Player4=driver.findElement(By.xpath("//a[text()=' Mahela Jayawardene '] "));
		String Run4=driver.findElement(By.xpath("//div[text()='103']")).getText();
		System.out.println(Player4.getText()+"= "+Run4);
		
		WebElement Player5=driver.findElement(By.xpath("//a[text()=' Thilan Samaraweera '] "));
		String Run5=driver.findElement(By.xpath("//div[text()='21']")).getText();
		System.out.println(Player5.getText()+"= "+Run5);
		
		WebElement Player6=driver.findElement(By.xpath("//a[text()=' Chamara Kapugedera '] "));
		String Run6=driver.findElement(By.xpath("//div[text()='1']")).getText();
		System.out.println(Player6.getText()+"= "+Run6);
		
		WebElement Player7=driver.findElement(By.xpath("//a[text()=' Nuwan Kulasekara '] "));
		String Run7=driver.findElement(By.xpath("//div[text()='32']")).getText();
		System.out.println(Player7.getText()+"= "+Run7);
		
		WebElement Player8=driver.findElement(By.xpath("//a[text()=' Thisara Perera '] "));
		String Run8=driver.findElement(By.xpath("//div[text()='22']")).getText();
		System.out.println(Player8.getText()+"= "+Run8);
		
		
		int RunsScoredByPlayer=Integer.parseInt(Run1)+Integer.parseInt(Run2)+Integer.parseInt(Run3)+Integer.parseInt(Run4)+Integer.parseInt(Run5)+Integer.parseInt(Run6)+Integer.parseInt(Run7)+Integer.parseInt(Run8);
		System.out.println("Runs scored by all players= "+RunsScoredByPlayer);
		
	}
	
	@Test(priority=4)
	public void Comparison()
	{
		String Extra_Runs=driver.findElement(By.xpath("//div[text()=' 12 '] ")).getText();
		int ExtraRuns=Integer.parseInt(Extra_Runs);
		
		String Total_Runs=driver.findElement(By.xpath("//div[text()=' 274 '] ")).getText();
		int TotalRuns=Integer.parseInt(Total_Runs);
	
		if((ExtraRuns+RunsScoredByPlayer)==TotalRuns)
		{
			System.out.println("Runs scored by player + extras = Total runs ");
		}
		else
		{
			System.out.println("Runs scored by player + extras != Total runs");
		}
		driver.quit();
	}
	
	@Test(priority=2)
	public void Boundaries()
	{
		
		//Total boundaries by srilankan team
		String B1=driver.findElement(By.xpath("//div[text()='0'] ")).getText();
		String B2=driver.findElement(By.xpath("//div[text()='3'] ")).getText();
		String B3=driver.findElement(By.xpath("//div[text()='5'] ")).getText();
		String B4=driver.findElement(By.xpath("//div[text()='13'] ")).getText();
		String B5=driver.findElement(By.xpath("//div[text()='2'] ")).getText();
		String B6=driver.findElement(By.xpath("//div[text()='0'] ")).getText();
		String B7=driver.findElement(By.xpath("//div[text()='1'] ")).getText();
		String B8=driver.findElement(By.xpath("//div[text()='3'] ")).getText();

		int TotalBoundaries=Integer.parseInt(B1)+Integer.parseInt(B2)+Integer.parseInt(B3)+Integer.parseInt(B4)+Integer.parseInt(B5)+Integer.parseInt(B6)+Integer.parseInt(B7)+Integer.parseInt(B8);
		System.out.println("Total boundaries by srilankan team= " +TotalBoundaries);
	}
	
	
	@Test(priority=3)
	public void RunOutPlayer() throws InterruptedException
	{
		System.out.println("Test 4");
		System.out.println("Run out player= "+driver.findElement(By.xpath("//a[text()=' Nuwan Kulasekara '] ")).getText());	
	}
	
}
