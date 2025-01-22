package ExcelLoad;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataXlsTest {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		//Step1 get the Excel Path Location and Java Object of the physical file
		FileInputStream fis= new FileInputStream("./Data/TestScriptData.xlsx");
		
		//Step 2; open the workBook in readMode
		Workbook wb=WorkbookFactory.create(fis);
		
		// Step 3: ge the control of the org sheet
		Sheet sh=wb.getSheet("Org");
		//Step 4: got the control of the sheet take row data
		Row row=sh.getRow(1);
		// Step 5  get the contorol of col and read the data
		Cell col=row.getCell(2);
		String data=col.getStringCellValue();
		System.out.println(data);
	}
	

}
