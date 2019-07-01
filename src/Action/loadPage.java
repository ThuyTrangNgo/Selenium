package Action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class loadPage {
	public static dangKy dk;
	public static WebDriver driver;

	public void loadPage() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/shopqq/index.php");
		driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div[2]/ul/li[6]/a")).click();

	}

	public Object[][] readExcell() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream IS = new FileInputStream("D:\\selenium\\dataShopQQ.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(IS);
		XSSFSheet s = wb.getSheet("Sheet1");
		/*
		 * XSSFSheet s1 = wb.getSheetAt(0);
		 * s1.getRow(1).createCell(15).setCellValue("Pass");
		 * s1.getRow(2).createCell(16).setCellValue("Fail"); FileOutputStream OS = new
		 * FileOutputStream("D:\\selenium\\dataShopQQ.xlsx"); wb.write(OS);
		 */

		int row = s.getLastRowNum();
		int col = s.getRow(0).getPhysicalNumberOfCells();
		// System.out.println(row);
		// System.out.println(col);

		// String string = s.getRow(1).getCell(1).getStringCellValue();
		// System.out.println(string);

		Object obj[][] = new Object[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				obj[i][j] = s.getRow(i + 1).getCell(j).toString();

			}
			/*
			 * obj[i][0] = s.getRow(i + 1).getCell(0).toString(); obj[i][1] = s.getRow(i +
			 * 1).getCell(1).toString(); obj[i][2] = s.getRow(i + 1).getCell(2).toString();
			*/

		}
		return obj;

	}

	////
	public Object[][] readSheet2() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream IS = new FileInputStream("D:\\selenium\\dataShopQQ.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(IS);
		XSSFSheet s = wb.getSheet("Sheet2");

		int row = s.getLastRowNum();
		int col = s.getRow(0).getPhysicalNumberOfCells();

		Object obj[][] = new Object[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				obj[i][j] = s.getRow(i + 1).getCell(j).toString();

			}

		}
		return obj;

	}

	public static void Writer() throws IOException {
		FileInputStream IS = new FileInputStream("D:\\selenium\\dataShopQQ.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(IS);
		XSSFSheet s = wb.getSheet("Sheet1");
		XSSFSheet s1 = wb.getSheetAt(0);
		int row = s.getLastRowNum();

		for (int i = 0; i < row; i++) {
			dk = new dangKy(driver);
			if (dk.getHomeHeading().equals(s.getRow(i + 1).getCell(14).toString())){
				s1.getRow(i + 1).createCell(15).setCellValue("Pass");
			} else {
				s1.getRow(i + 1).createCell(15).setCellValue("False");
			}
			// s1.getRow(2).createCell(15).setCellValue("False");
			// s1.getRow(3).createCell(15).setCellValue("Palse");
		}
		// s1.getRow(1).createCell(16).setCellValue("Pass");
		// s1.getRow(2).createCell(3).setCellValue("Fail");
		System.out.println();
		FileOutputStream OS = new FileOutputStream("D:\\selenium\\dataShopQQ.1.xlsx");
		wb.write(OS);
		wb.close();
	}

	/*
	 * public boolean check() { dk = new dangKy(driver);
	 * if(dk.getHomeHeading().equals("Đăng ký thành công")) { return true; }else {
	 * return false; } }
	 */

}
