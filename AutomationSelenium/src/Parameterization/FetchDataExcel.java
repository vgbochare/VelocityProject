package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"D:\\Vaibhav\\Software Testing\\Automation Testing\\Selenium\\Parameterization\\DemoParameterization.xlsx");

		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();

		System.out.println(data);
	}

}
