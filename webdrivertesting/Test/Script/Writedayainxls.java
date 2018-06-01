package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedayainxls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream ("P:\\Akansha\\Selenium\\Data\\Aka.xlsx");

		XSSFWorkbook  wb = new XSSFWorkbook(fis);;

		XSSFSheet Sheet1 = wb.getSheetAt(0);
	
		Sheet1.getRow(0).createCell(3).setCellValue("pass");
		Sheet1.getRow(1).createCell(3).setCellValue("Fail");
		Sheet1.getRow(2).createCell(3).setCellValue("copy");
		Sheet1.getRow(3).createCell(3).setCellValue("paste");
		
		FileOutputStream Fileout = new FileOutputStream("P:\\Akansha\\Selenium\\Data\\Aka.xlsx");
		
		wb.write(Fileout);
		
		wb.close();

	}

}
