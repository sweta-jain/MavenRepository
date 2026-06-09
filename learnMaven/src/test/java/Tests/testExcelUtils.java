package Tests;

import java.io.IOException;
import Utils.ExcelUtils;

public class testExcelUtils {
	
	//static String projDir = System.getProperty("user.dir");
	//static String bookLocation = projDir + "/testData/testData.xlsx";	
	static String bookLocation = "./testData/testData.xlsx";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		ExcelUtils excelUtil = new ExcelUtils(bookLocation);
		excelUtil.getRowCount();		
		excelUtil.getCellValue(1,1);
	}
}
