package com.tmary;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelTest {

    public static void main(String[] args) throws IOException {
        String path = "/Users/nadavdayan/Desktop/Oracle Certification/Java/Documents/Worksheet in Ex-1-Birthday-Listings.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("All Members Birthdays");
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}
