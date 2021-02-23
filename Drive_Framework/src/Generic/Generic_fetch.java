package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_fetch 
{
  public static String getdata(String sheet,int row, int cell)
  {
	  String val="";
	  try
	  {
		  FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		  val=c.getStringCellValue();
	  }
	  catch(Exception e)
	  {
		  System.out.println("unable to fetch data");
	  }
	  return val;
  }
}

