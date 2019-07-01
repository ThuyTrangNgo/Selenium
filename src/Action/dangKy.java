package Action;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import InterFace.dangKy_inter;

public class dangKy extends dangKy_inter {
	public WebDriver driver;
	//dangKy_inter dk;

	public dangKy(WebDriver driver) {
		this.driver = driver;
	}

	public void dangKy_btn() {
		WebElement el = driver.findElement(menu);
		Actions action = new Actions(driver);
		action.moveToElement(el).build().perform();
		WebElement ac = driver.findElement(dangky_btn);
		ac.click();
		// driver.findElement(arg0)
	}

	public void dangKy_User(String User) throws InterruptedException {
		driver.findElement(user).sendKeys(User);
		Thread.sleep(1000);
	}

	public void dangKy_Pass(String Pass) throws InterruptedException {

		driver.findElement(pass).sendKeys(Pass);
		Thread.sleep(1000);
	}
	public void dangKy_RePass(String Repass) throws InterruptedException {

		driver.findElement(repass).sendKeys(Repass);
		Thread.sleep(1000);
	}
	
	public void dangKy_HoTen(String HoTen) throws InterruptedException {

		driver.findElement(hoten).sendKeys(HoTen);
		Thread.sleep(1000);
	}
	public void dangKy_Email(String Email) throws InterruptedException {

		driver.findElement(email).sendKeys(Email);
		Thread.sleep(1000);
	}
	public void dangKy_Address(String Address) throws InterruptedException {
		driver.findElement(diachi).sendKeys(Address);
		Thread.sleep(1000);
	}
	public void dangKy_NumberPhone(String NumberPhone) throws InterruptedException {
		driver.findElement(dienthoai).sendKeys(NumberPhone);
		Thread.sleep(1000);
		
	}
	public void dangKy_GioiTinh() throws InterruptedException {
		driver.findElement(gt_nam).click();
		Thread.sleep(1000);
	}
	
	public void dangKy_ngaySinh(String Select_Ngay, String Value_Ngay) throws InterruptedException {
		WebElement s_ngay = driver.findElement(ngay);
		Select selectElement = new Select(s_ngay);
		selectElement.selectByVisibleText(Select_Ngay);
		selectElement.selectByValue(Value_Ngay);
		Thread.sleep(1000);
	}
	public void dangKy_thangSinh(String Select_Thang, String Value_Thang) throws InterruptedException {
		WebElement s_thang = driver.findElement(thang);
		Select selectElement = new Select(s_thang);
		selectElement.selectByVisibleText(Select_Thang);
		selectElement.selectByValue(Value_Thang);
		Thread.sleep(1000);
	}
	public void dangKy_namSinh(String Select_Nam, String Value_Nam) throws InterruptedException {
		WebElement s_nam = driver.findElement(nam);
		Select selectElement = new Select(s_nam);
		selectElement.selectByVisibleText(Select_Nam);
		selectElement.selectByValue(Value_Nam);
		Thread.sleep(1000);
	}
	
	
	//
	public void dangKy_End() throws InterruptedException {
		driver.findElement(dangky_end).click();
		Thread.sleep(1000);
	}
	
	 public String getHomeHeading()  {
	        String heading = driver.findElement(check_dangky).getText();
	        return  heading;
	    }
	public void quit() {
		driver.quit();
	}
	
}
