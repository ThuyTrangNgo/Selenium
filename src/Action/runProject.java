package Action;

import java.io.IOException;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import junit.framework.Assert;

public class runProject extends loadPage {
	dangKy dk;
	 

	loadPage ln = new loadPage();

	@BeforeMethod
	public void start() {
		ln.loadPage();
	}

	// data cua form dang ky
	@DataProvider(name = "readExcell")
	public Object[][] docExcell() throws IOException {
		Object[][] doc = ln.readExcell();
		// System.out.println(doc);
		return doc;

	}

	// data cua form dang nhap
	/*
	 * @DataProvider(name = "readSheet2") public Object[][] getSheet2() throws
	 * IOException { Object[][] get = ln.readSheet2(); // System.out.println(doc);
	 * return get;
	 * 
	 * }
	 * 
	 * //ghi data
	 * 
	 * @DataProvider(name = "writeExcell") public Object[][] ghiExcell() throws
	 * IOException { Object[][] doc = ln.readExcell(); // System.out.println(doc);
	 * return doc;
	 * 
	 * }
	 */

	@Test(dataProvider = "readExcell")
	public void dangKy(String User, String Pass, String Repass, String Fullname, String Sex, String Email,
			String Address, String NumberPhone, String Select_Date, String Value_Date, String Select_Month,
			String Value_Month, String Select_Year, String Value_Year, String Expected_results,String Actual_results)
			throws Exception {
		dk = new dangKy(driver);
		// dk.dangKy_btn();
		dk.dangKy_btn();
		dk.dangKy_User(User);
		dk.dangKy_Pass(Pass);
		dk.dangKy_RePass(Repass);
		dk.dangKy_HoTen(Fullname);
		dk.dangKy_Email(Email);
		dk.dangKy_Address(Address);
		dk.dangKy_NumberPhone(NumberPhone);
		dk.dangKy_GioiTinh();
		dk.dangKy_ngaySinh(Select_Date, Value_Date);
		dk.dangKy_thangSinh(Select_Month, Value_Month);
		dk.dangKy_namSinh(Select_Year, Value_Year);
		dk.dangKy_End();
		//ln.check();
		ln.Writer();
		Thread.sleep(2000);
		dk.quit();
	}

	/*
	 * @Test(dataProvider = "readSheet2") public void dangNhap(String User, String
	 * Pass) throws InterruptedException, IOException { dn = new dangNhap(driver);
	 * dn.dangNhap_tab(); dn.dangNhapUser_txt(User); dn.dangNhapPass_txt(Pass);
	 * dn.dangNhap_btn(); dn.quit(); }
	 * 
	 * @Test(dataProvider = "writeExcell") public void dangNhap(String User, String
	 * Pass, String Repass, String HoTen, String Gioitinh, String Email, String
	 * Address, String NumberPhone, String Select_Ngay, String Value_Ngay, String
	 * Select_Thang, String Value_Thang, String Select_Nam, String Value_Nam) throws
	 * InterruptedException, IOException { dn = new dangNhap(driver);
	 * dn.dangNhap_tab(); dn.dangNhapUser_txt(User); dn.dangNhapPass_txt(Pass);
	 * dn.dangNhap_btn(); dn.quit(); }
	 */

}
