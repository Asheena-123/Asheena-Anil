package excelpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	static FileInputStream f; // globally declared a class FileInputStream nd f is a obj
	static XSSFWorkbook w; // wrk with excel we use 
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\ASHEENA-\\Desktop\\Excelread.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1"); //excel sheet name
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
	} // entire code describes ->return the cell value
public static String getIntegerData(int a,int b) throws IOException
{
	f=new FileInputStream("C:\\Users\\ASHEENA-\\Desktop\\Excelread.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1"); //excel sheet name
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	int x= (int)c.getNumericCellValue();
	return String.valueOf(x); //valueOf means to read the string to integer
} //entire code describes -> string to integer
}
