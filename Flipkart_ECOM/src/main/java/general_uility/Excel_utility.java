package general_uility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
	public String exceldata(String sheet,int rownum,int cellnum) throws Throwable {
		FileInputStream fls=new FileInputStream("src/test/resources/Flipkart_all.xlsx");
		Workbook bo=WorkbookFactory.create(fls);
		DataFormatter daf=new DataFormatter();
		String value = daf.formatCellValue(bo.getSheet(sheet).getRow(rownum).getCell(cellnum));
		return value;	
	}

}
