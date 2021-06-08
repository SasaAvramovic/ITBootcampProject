package resources;

import org.openqa.selenium.By;

public class Constants {
	
	public static final String PATH_FILES = System.getProperty("user.dir") + "\\src\\files\\";
	public static final String PATH_DRIVERS = System.getProperty("user.dir") + "\\src\\drivers\\";
	public static final String USER = "lucy@the.sky";
	public static final String PASSWORD = "PurpleHaze";
	public static final By STATUS = By.xpath("//*[@id=\"_status\"]");
	
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
	public static final By HEADER_LEAVE = By.id("sn_requests");
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
	//page titles for testing purposes
	public static final String DASH_TITLE = "Dashboard - Dashboard - Humanity";
	public static final String SCHEDULE_TITLE = "ShiftPlanning - Humanity";
	public static final String TIMECLOCK_TITLE = "Timeclock - Overview - Humanity";
	public static final String LEAVE_TITLE = "Leave - Vacation - Humanity";
	public static final String TRAINING_TITLE = "Training - Overview - Humanity";
	public static final String STAFF_TITLE = "Staff - List - Humanity";
	public static final String AVAILABILITY_TITLE = "Humanity";
	public static final String PAYROLL_TITLE = "Payroll - Scheduled-hours - Humanity";
	public static final String REPORTS_TITLE = "Reports - Reports Home - Humanity";
	public static final String SETTINGS_TITLE = "Settings - Manage Settings - Humanity";
	public static final String PROFILE_TITLE = "Staff - Detail - Humanity";
	public static final String USER_SETTINGS_TITLE = "Staff - New User - Humanity";
	public static final String USER_PROFILE_TITLE = "Staff - Overview - Humanity";
	
	//Dashboard
	public static final String URL_DASH = "https://electrickoolaid.humanity.com/app/dashboard/";
	
	//Staff
	public static final String STAFF_FIRST_NAME = "Itan";
	public static final String STAFF_LAST_NAME = "Hawk";
	public static final String STAFF_EMAIL = "itan.hawk@hotmail.com";
	public static final String STAFF_RENAME = "Johnatan";
	public static final String STAFF_URL = "https://electrickoolaid.humanity.com/app/staff/list/load/true/";
	public static final By STAFF_ADD = By.id("act_primary");
	public static final By STAFF_SAVE = By.id("_as_save_multiple");
	public static final By STAFF_LIST_INPUT = By.className("_ns_row");
	public static final By STAFF_LIST_FNAME = By.className("_ns_fname");
	public static final By STAFF_LIST_LNAME = By.className("_ns_lname");
	public static final By STAFF_LIST_EMAIL = By.className("_ns_email");
	public static final By STAFF_EMPLOYEES = By.xpath("//*[@id=\"stafftl_\"]/div[1]");
	public static final By STAFF_ALL_STAFF = By.xpath("//*[@id=\"StaffSchedules\"]/ul[1]/li[1]/a");
	public static final By STAFF_CHECKBOX = By.xpath("//*[@id=\"staff-list-container\"]/div[1]/div/div[1]/span/input");
	public static final By STAFF_BULK_EDIT = By.xpath("//*[@id=\"_topnav\"]/button[2]");
	public static final By STAFF_MANAGE_USER = By.xpath("//*[@id=\"manageAccount\"]/label/input");
	public static final By STAFF_NEXT_STEP = By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div/form/button");
	public static final By STAFF_CONFIRM = By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div/div/button");
	public static final By STAFF_CLICK_NAME = By.partialLinkText(STAFF_FIRST_NAME);
	public static final By STAFF_CLICK_EDIT = By.xpath("//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]");
	public static final By STAFF_UPLOAD_PHOTO = By.id("fileupload");
	
	//edit details
	public static final By EDIT_NAME = By.id("first_name");
	public static final By SAVE_EMPLOYEE = By.xpath("//*[@id=\"act_primary\"]");
	
	//settings
	public static final By SETTINGS_LANGUAGE = By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select");
	public static final By SETTINGS_SAVE = By.xpath("//*[@id=\"act_primary\"]");
	public static final By SETTINGS_NOTIFICATIONS_EMAIL = By.id("pref_pref_email");
	public static final By SETTINGS_NOTIFICATIONS_SMS = By.id("pref_pref_sms");
	public static final By SETTINGS_NOTIFICATIONS_PUSH = By.id("pref_pref_mobile_push");
	
	//profile settings
	public static final String NEW_NICKNAME = "Mickey";
	public static final String NEW_WAGE = "15";
	public static final By PROFILE_NICKNAME = By.id("nick_name");
	public static final By PROFILE_WEEKLY_OVERTIME = By.id("overtime");
	public static final By PROFILE_WAGE = By.id("wage");
	public static final By PROFILE_PRIVACY_EMAIL = By.xpath("//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[10]/td[2]/input[1]");
	public static final By PROFILE_PRIVACY_PHONE = By.xpath("//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[10]/td[2]/input[2]");
	
	

}
