package ExcelLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMulDataXlsx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//s1 Java object for file path
		FileInputStream fis= new FileInputStream("./Data/TestScriptData.xlsx");
		
		//S2 open work book in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//S3 get the sheet control
		Sheet sh=wb.getSheet("Stu");
		//s4: get the control of roww
		// maximum rows
		int n=sh.getLastRowNum();
		System.out.println(n);
		for(int i=1;i<=n;i++) {
			Row r=sh.getRow(i);
			//S5: get the control on coluumn and print the value
			String key=r.getCell(0).toString();
			String data=r.getCell(1).toString();
			System.out.println(key+"\t"+data);
		}
		
	}

}

