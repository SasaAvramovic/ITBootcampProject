package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Constants;

public class ExcelUtil {

	public static void inputStaffList(WebDriver driver, File staff) {
		// finding all possible entry fields
		List<WebElement> listAll = driver.findElements(Constants.STAFF_LIST_INPUT);
		int i = 1;
		for (WebElement list : listAll) {
			try {
				InputStream is = new FileInputStream(staff);
				XSSFWorkbook wb = new XSSFWorkbook(is);
				Sheet sheet = wb.getSheetAt(0);
				Row row = sheet.getRow(i);
				if (row != null) {
					String fname = row.getCell(0).toString();
					row = sheet.getRow(i);
					String lname = row.getCell(1).toString();
					row = sheet.getRow(i);
					String email = row.getCell(2).toString();
					row = sheet.getRow(i);

					list.findElement(Constants.STAFF_LIST_FNAME).sendKeys(fname);
					list.findElement(Constants.STAFF_LIST_LNAME).sendKeys(lname);
					list.findElement(Constants.STAFF_LIST_EMAIL).sendKeys(email);
					i++;
				}

				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	public static int listLength(WebDriver driver, File staff) {
		int i = 0;
		InputStream is;
		try {
			is = new FileInputStream(staff);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			i = sheet.getLastRowNum();
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public static String checkEntries(WebDriver driver, File staff, int i) {
		String email = "";
				try {
					InputStream is = new FileInputStream(staff);
					XSSFWorkbook wb = new XSSFWorkbook(is);
					Sheet sheet = wb.getSheetAt(0);
					Row row = sheet.getRow(i);
					email = row.getCell(2).toString();
					wb.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
		return email;
	}
	
}
