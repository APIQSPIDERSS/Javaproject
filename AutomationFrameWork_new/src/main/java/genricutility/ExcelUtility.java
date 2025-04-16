package genricutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * It is used to read data from excel
	 * It returns String data
	 * @param sheetName
	 * @param rowIndex
	 * @param cloumnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataExcelFile(String sheetName,int rowIndex,int cloumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(rowIndex).getStringCellValue();
	}
	/**
	 * It is used to read numeric data from Excel File
	 * It returns Numeric value
	 * * @param sheetName
	 * @param rowIndex
	 * @param cloumnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

}
