package Day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\testdata\\data.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int totalrow=sheet.getLastRowNum();
		
		int totalcells=sheet.getRow(0).getLastCellNum();
		
		System.out.println(totalrow);
		System.out.println(totalcells);
		
		for(int r=0;r<=totalrow;r++) {
			XSSFRow currentr=sheet.getRow(r);
			
			for (int c=0;c<totalcells;c++) {
				
				XSSFCell currentcell =currentr.getCell(c);
				System.out.print( currentcell.toString()+"\t");
			}
			System.out.println();
		}
		
		book.close();
		file.close();		
		
	}

}
