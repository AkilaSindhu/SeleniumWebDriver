package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\dataDynamic.xlsx");

		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet=book.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows");
		
		int noofrows=sc.nextInt();
		
		System.out.println("How many cell");
		
		int noofcell=sc.nextInt();
		
		for(int r=0; r<=noofrows;r++) {
			
			XSSFRow currentsheet=sheet.createRow(r);
			
			for(int c=0;c<noofcell;c++) {
				
			XSSFCell currectcell =currentsheet.createCell(c);
			
			currectcell.setCellValue(sc.next());
			}
			
			book.write(file);
			
			book.close();
			
			file.close();
			
			System.out.println("file created");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
