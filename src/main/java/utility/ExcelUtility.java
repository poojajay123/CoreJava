package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public ExcelUtility(String excelPath, String string) {
		// TODO Auto-generated constructor stub
	}

	public static String getCellValue(String sheetName, int rowNum, int colNum) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream("TestData/AmazonRegistrationData.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);
			value = cell.toString();
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static Object[][] getAllDataRegistartion(String Registartion) {
		Object[][] data = null;
		try {
			FileInputStream fis = new FileInputStream("D:/Java_Project/AmazonMaven/AmazonData/AmazonProject.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Registartion");
			int rows = sheet.getPhysicalNumberOfRows();
			int cols = sheet.getRow(0).getPhysicalNumberOfCells();
			data = new Object[rows - 1][cols];
			for (int i = 1; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
				}
			}
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	
	public static Object[][] getAmazonLoginExcelData(String path, String sheetName) throws IOException {
	    FileInputStream fis = new FileInputStream(path);
	    Workbook workbook = WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet(sheetName);

	    int totalRows = sheet.getPhysicalNumberOfRows();
	    int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();

	    List<Object[]> validRows = new ArrayList<>();

	    for (int i = 1; i < totalRows; i++) {
	        Row row = sheet.getRow(i);
	        if (row == null || row.getCell(0) == null || row.getCell(0).toString().trim().isEmpty()) {
	            continue; // skip empty row
	        }

	        Object[] rowData = new Object[totalCols];
	        for (int j = 0; j < totalCols; j++) {
	            Cell cell = row.getCell(j);
	            rowData[j] = (cell == null) ? "" : cell.toString();
	        }
	        validRows.add(rowData);
	    }
	    

	    Object[][] data = new Object[validRows.size()][];
	    for (int i = 0; i < validRows.size(); i++) {
	        data[i] = validRows.get(i);
	    }

	    return data;
	}

}