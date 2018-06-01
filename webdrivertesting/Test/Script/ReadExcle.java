package Script;

import org.apache.xerces.util.SynchronizedSymbolTable;

import Data.ExcleConfigdata;

public class ReadExcle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcleConfigdata excle= new ExcleConfigdata ("P:\\Akansha\\Selenium\\Data\\Aka.xlsx");
		
		System.out.println(excle.ExcleConfigdata (0,0,0));

	}

}
