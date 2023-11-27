package com.learnautomation.utility;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelData {
XSSFWorkbook wb;

public ExcelData() {
	
	File src=new File(".//TestData//Data.xlsx");
	
    try {
    	FileInputStream fis=new FileInputStream(src);//Reading source file
    	wb=new XSSFWorkbook(fis);//get excel data from source file
    }catch(Exception e){
    	System.out.println("Unable to read excel file"+e.getMessage());
    }
}
public String getStringData(String sheetName,int row, int column) {
	return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();}

}
