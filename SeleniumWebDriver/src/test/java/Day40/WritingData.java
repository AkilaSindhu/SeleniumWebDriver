package Day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\data1.xlsx");

		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet=book.createSheet("Data");
		
		XSSFRow row0	= sheet.createRow(0);
		
		row0.createCell(0).setCellValue("java");
		row0.createCell(1).setCellValue(19);
		row0.createCell(2).setCellValue("Automation");
		
		
		book.write(file);
		
		book.close();
		file.close();
		
		System.out.println("file created");
	}

}
