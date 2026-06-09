package Utils;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {	
	static XSSFWorkbook myDataBook;
	static XSSFSheet mySheet;
		
	public ExcelUtils(String bookLocation) {
		try {
			myDataBook = new XSSFWorkbook(bookLocation);
			mySheet = myDataBook.getSheetAt(0);
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		}
		
	}
	
	public static void getRowCount() {			
			System.out.println("Number of rows : " + mySheet.getPhysicalNumberOfRows());
	}
		
	public static void getCellValue(int rowNum, int cellNum) throws IOException{
		
		DataFormatter formatter = new DataFormatter();
		System.out.println("Cell Value : " + formatter.formatCellValue(mySheet.getRow(rowNum).getCell(cellNum)));
	}
	
	/*public static void main(String[] args) {
		try {
			getRowCount();
			getCellValue();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
}
