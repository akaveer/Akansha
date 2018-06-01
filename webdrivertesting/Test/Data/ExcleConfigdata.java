package Data;

import java.io.FileInputStream;
import java.lang.String;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ExcleConfigdata {
	
	XSSFWorkbook wb;
	XSSFSheet Sheet1;
	
	public ExcleConfigdata (String excelPath)
	{
		
		try {
			
			FileInputStream fis = new FileInputStream (excelPath);

			 wb = new XSSFWorkbook(fis);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	
 public XSSFWorkbook getWb() {
		return wb;
	}


	public void setWb(XSSFWorkbook wb) {
		this.wb = wb;
	}


	public XSSFSheet getSheet1() {
		return Sheet1;
	}


	public void setSheet1(XSSFSheet sheet1) {
		Sheet1 = sheet1;
	}


public String  ExcleConfigdata(int sheetNumber,int row,int colum)
	
	{
    Sheet1 = wb.getSheetAt(sheetNumber);
	String data= Sheet1.getRow(row).getCell(colum).getStringCellValue();
	 return data;
	
}
  
  
}

