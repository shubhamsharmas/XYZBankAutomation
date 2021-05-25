package Stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.PageObjectForXYZBank;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class TC_01_Login_XYZ {

	static WebDriver driver;
	public static String username;
	WebDriverWait wait;
	PageObjectForXYZBank val = new PageObjectForXYZBank();
	static Properties Pro;

	@Given("I navigate to the bank URL")

	public static void loginIntoXYZBank() throws IOException {

		String str = System.getProperty("user.dir");
		File srcFile = new File(str + "\\src\\main\\java\\Helpers\\ReadConfig.properties");
		FileInputStream file = new FileInputStream(srcFile);
		Pro = new Properties();
		Pro.load(file);
		System.out.println(str + "\\Helper\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Helpers\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to(Pro.getProperty("URL"));

		// button[contains(text(), 'Customer Login')]

	}

	@And("I click on the customer login button with below details")

	public void clickLoginbutton(List<Map<String, String>> table) throws InterruptedException {

		username = table.get(0).get("Username");

		System.out.println(username);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(val.loginButton())).click();
		Thread.sleep(3000);

		Select user = new Select(driver.findElement(By.cssSelector(val.selectValuefromDropDown())));
		user.selectByVisibleText(username);

	}

	@And("I click on the Login Button")
	public void clickLogin() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(val.loginButtonUserSelected())).click();

	}

	@Then("User should be able to login successfully")

	public void verifyLogin() throws InterruptedException {
		Thread.sleep(3000);
		String str = driver.findElement(By.cssSelector(val.headerTextOfLoginPage())).getText();
		System.out.println(str);

		if (str.equals(username))
			System.out.println("Login Successful kano lowde");
		else
			Assert.fail("Login was not successfull lowdekeball");
	}

}
