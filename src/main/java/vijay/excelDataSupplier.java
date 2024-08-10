package vijay;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataSupplier {

	public static void main(String[] args)throws Exception {
		File excelFile =new File("./src/resources/testBook1.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		
		for (int i = 1; i <noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				DataFormatter df=new DataFormatter();			
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			}
			System.out.println();
		}
		workbook.close();	
		fis.close();
		
	}

}
