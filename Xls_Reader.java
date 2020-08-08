package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Xls_Reader 
{
	String filepath=null;
	
	public Xls_Reader(String filepath)
	{
		this.filepath=filepath;
	}
	
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		//Row
		XSSFRow row=sheet.getRow(rowNum-1);
		
		//Cell
		XSSFCell cell=row.getCell(colNum-1);
		
		String value=cell.getStringCellValue();
		
		return value;
		
	}
	
	public void setCellData(String sheetName, int rowNum, int colNum, String value) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		//Row
		XSSFRow row=sheet.getRow(rowNum-1);
		if(row==null)
			row=sheet.createRow(rowNum-1);
		
		//Cell
		XSSFCell cell=row.getCell(colNum-1);
		if(cell==null)
			cell=row.createCell(colNum-1);
		
		cell.setCellValue(value);		

		FileOutputStream fileOut = new FileOutputStream(filepath);

		wb.write(fileOut);
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		return sheet.getLastRowNum()+1;
	}
	
	public int getColumnCount(String sheetName) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		return sheet.getRow(0).getLastCellNum();
	}

}
