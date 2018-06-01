package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Readxls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//File src = new File ("P:\\Users\\u5365293\\Desktop\\Selenium\\Aka.xlsx");

FileInputStream fis;
try {
	fis = new FileInputStream ("P:\\Akansha\\Selenium\\Data\\Aka.xlsx");

	XSSFWorkbook  wb = new XSSFWorkbook(fis);

	XSSFSheet Sheet1 = wb.getSheetAt(0);
	
	//String data0 = Sheet1.getRow(0).getCell(1).getStringCellValue();
	
	//System.out.println("Data from Excel is " +data0);
	
	
	
	int Rowcount = Sheet1.getLastRowNum();
	
	System.out.println("Totals Row is" +Rowcount);
	
	for (int i=0; i<Rowcount; i++)
	{
	
		String data0 = Sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1 = Sheet1.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println("Test Data From Sheet:  " +data0  +data1);
		//System.out.println("Test Data From Sheet:  " +data1);
		
		
		
		
	}
	
	wb.close();
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	e.printStackTrace();
}



	}

}
