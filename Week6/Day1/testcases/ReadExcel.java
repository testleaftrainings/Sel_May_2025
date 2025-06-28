package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData() throws IOException {
		// Step1: Open the WorkBook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");

		// Locate the Worksheet
		// wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);

		// To count number of rows including header(row1)
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("Rows including header :" + physicalNumberOfRows);

		// To count number of rows excluding header(row1)
		int rowCount = ws.getLastRowNum();
		System.out.println("Rows excluding header :" + rowCount);

		// To count the number of columns
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The column Count is: " + columnCount);

		// To retrieve a single data
		String row1Cell1Value = ws.getRow(1).getCell(1).getStringCellValue();

		System.out.println("row1Cell1 Value is: " + row1Cell1Value);

		String[][] data = new String[rowCount][columnCount];

		// data[0][0]

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				data[i - 1][j] = allData;
				System.out.println("All data is: " + allData);

			}
		}

		wb.close();
		return data;

	}

}
