import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
	    //Location of the file 
				FileInputStream fis = new FileInputStream("/Users/AshwiniDesai/Desktop/Test Data for selenium.xlsx");
				XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook1.getSheetAt(0);
	                       
	         
				//Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		for(int i=0; i<=2; i++)
		{
				Row row = sheet.getRow(i);
				
				for(int j=0; j<=1 ; j++) {
				Cell cell = row.getCell(j);
				System.out.println(sheet.getRow(i).getCell(j));
				}
				System.out.println("*************");
				System.out.println("##########");
	}
	}

	
}