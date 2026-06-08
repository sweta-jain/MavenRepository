package Utils;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {	
	public static void main(String[] args) {
		//getRowCount();
		try {
			getCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getRowCount() {
		String projDir = System.getProperty("user.dir");
		//System.out.print(projDir);
		String bookLocation = projDir + "/testData/testData.xlsx";
		
		XSSFWorkbook myDataBook;
		try {
			myDataBook = new XSSFWorkbook(bookLocation);
			XSSFSheet mySheet = myDataBook.getSheetAt(0);
			System.out.print("Number of rows : " + mySheet.getPhysicalNumberOfRows());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void getCellValue() throws IOException{
		String projDir = System.getProperty("user.dir");
		//System.out.print(projDir);
		String bookLocation = projDir + "/testData/testData.xlsx";
			
		XSSFWorkbook myDataBook = new XSSFWorkbook(bookLocation);
		XSSFSheet mySheet = myDataBook.getSheetAt(0);
			
		System.out.print("Cell Value : " + mySheet.getRow(1).getCell(0).getStringCellValue());
	}
}
