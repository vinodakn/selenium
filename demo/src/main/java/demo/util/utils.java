package demo.util;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utils {
	public static Workbook book;
	public static Sheet sheet;
	public static String path="D:\\Users\\VGSL-SW021\\eclipse-workspace\\demo\\src\\main\\java\\demo\\testdata\\New Microsoft Excel Worksheet.xlsx";
	
	public static  Object[][] getexceldata(String sheetname){
		FileInputStream file= null;
		try {
			file= new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum(); i++) {
			for (int j= 0; j<sheet.getRow(i).getLastCellNum(); j++){
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
			
		}
		
		
		
		return data;
		
}
}