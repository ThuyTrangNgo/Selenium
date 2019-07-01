package InterFace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dangKy_inter {
	
	 public By menu = By.xpath("/html/body/header/div[3]/div/div/div/div[2]");
	 public By dangky_btn = By.xpath("/html/body/header/div[3]/div/div/div/div[2]/ul/li[6]/a");
	 public By user = By.xpath("//*[@id=\"txtTenDangNhap\"]");
	 public By pass = By.xpath("//*[@id=\"txtMatKhau1\"]");
	 public By repass = By.xpath("//*[@id=\"txtMatKhau2\"]");
	 public By hoten = By.xpath("//*[@id=\"txtHoTen\"]");
	 public By email = By.xpath("//*[@id=\"txtEmail\"]");
	 public By diachi = By.xpath("//*[@id=\"txtDiaChi\"]");
	 public By dienthoai = By.xpath("//*[@id=\"txtDienThoai\"]");
	 public By gt_nam = By.cssSelector("input[value='0']");
	 public By ngay = By.xpath("//*[@id=\"slNgaySinh\"]");
	 public By thang = By.xpath("//*[@id=\"slThangSinh\"]");
	 public By nam = By.xpath("//*[@id=\"slNamSinh\"]");
	 public By dangky_end = By.xpath("//*[@id=\"btnDangKy\"]");
	 public By dangnhap_tab = By.xpath("/html/body/header/div[3]/div/div/div/div[2]/ul/li[5]/a");
	 public By dangnhap_user = By.xpath("//*[@id=\"txtTenDangNhap\"]");
	 public By dangnhap_pass = By.xpath("//*[@id=\"txtMatKhau\"]");
	 public By dangnhap_btn = By.xpath("//*[@id=\"btnLogin\"]");
	 public By check_dangky = By.className("cssLoi");
	 //
   
}
