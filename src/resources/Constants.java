package resources;

import org.openqa.selenium.By;

public class Constants {
	
	//Home page
	public static final String URL_HOME = "https://www.humanity.com/";
	public static final By LOGIN_HOME = By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[2]/p");
	public static final By POPUP_HOME = By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button");
	public static final By HEADER_HUMANITY = By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div/div/div/nav/div[1]/a/svg");
	public static final By HEADER_PLATFORM = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");
	public static final By HEADER_SOLUTIONS = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
	public static final By HEADER_INTEGRATIONS = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]");
	public static final By HEADER_RESOURCES = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a");
	public static final By HEADER_PRICING = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a");
	public static final By HEADER_ABOUT_US = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a");
		public static final By ABOUT_ABOUT_US = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]");
	
	//Login page
	public static final String URL_LOGIN = "https://www.humanity.com/app/";
	public static final By INPUT_USERNAME = By.id("email");
	public static final By INPUT_PASSWORD = By.id("password");
	public static final By CLICK_LOGIN = By.xpath("//*[@id=\"LoginForm\"]/div[3]/div/button[1]");
	
	//Header
	public static final By HEADER_DASH = By.id("sn_dashboard");
	public static final By HEADER_SCHEDULE = By.id("sn_schedule");
	public static final By HEADER_TIMECLOCK = By.id("sn_timeclock");
	public static final By HEADER_REQUESTS = By.id("sn_requests");
	public static final By HEADER_TRAINING = By.id("sn_training");
	public static final By HEADER_STAFF = By.id("sn_staff");
	public static final By HEADER_AVAILABILITY = By.id("sn_availability");
	public static final By HEADER_PAYROLL = By.id("sn_payroll");
	public static final By HEADER_REPORTS = By.id("sn_reports");
	public static final By HEADER_SETTINGS = By.id("sn_admin");
	public static final By HEADER_USER_MENU = By.id("wrap_us_menu");
	public static final By USER_PROFILE = By.xpath("//*[@id=\"userm\"]/div/a[1]");
	public static final By USER_SETTINGS = By.xpath("//*[@id=\"userm\"]/div/a[2]");
	public static final By USER_SIGN_OUT = By.xpath("//*[@id=\"userm\"]/div/div[5]/a");
	
	//Dashboard
	public static final String URL_DASH = "https://electrickoolaid.humanity.com/app/dashboard/";
	
	
	
}
