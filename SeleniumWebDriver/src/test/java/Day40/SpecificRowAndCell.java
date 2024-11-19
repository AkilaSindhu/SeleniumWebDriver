package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpecificRowAndCell {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\dataRandam.xlsx");

		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet=book.createSheet("RandomData");
		
		XSSFRow totalrow=sheet.createRow(1);
		
		XSSFCell   totalcell	=totalrow.createCell(3);
		
		
		totalcell.setCellValue("Welcome");
		
		book.write(file);
		
		book.close();
		file.close();
		
		
		
	}

}
