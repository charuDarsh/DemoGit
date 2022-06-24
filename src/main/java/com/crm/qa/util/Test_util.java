package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.base.TestBase;

public class Test_util extends TestBase {
	public static long Page_Load_Timeout=20;
	public static long implicitly_Wait=20;
	static Workbook workbook;
	static Sheet sheet;
	
	public  Object[][] getdatas(String sheetname) throws IOException {
		FileInputStream file=null;
		try {
			file=new FileInputStream("C:\\Users\\Anuj Singhal\\Selenium\\udemy-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testData\\Excel.xlsx");
					
		}catch(IOException e) {
			e.printStackTrace();
		}
		 try {
			workbook=WorkbookFactory.create(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	sheet=workbook.getSheet(sheetname);
	Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for(int i=0;i<sheet.getLastRowNum();i++) {
		for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
			data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		}
		
	}
	return data;
	}
	public static void screenShotMethodAs() throws IOException {
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(f,new File("C:\\Users\\Anuj Singhal\\Selenium\\udemy-workspace\\FreeCRMTest" + System.currentTimeMillis()+".jpg"));
	}
}
