package com.tmary;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class ExcelDataManager {

    public void getMembers() throws IOException {

        // access the Excel file
        String path = "/Users/nadavdayan/Desktop/Oracle Certification/Java/Documents/Worksheet in Ex-1-Birthday-Listings.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheetAt(0);

        int rowMax = sheet.getLastRowNum();
        int columnMax = sheet.getRow(0).getLastCellNum();

        for (int r = 3; r < rowMax; r++) {
            Row entry = sheet.getRow(r);
            int id = 0;
            String name = "";
            Date dateOfBirth = null;
            int weekNumber = 0;

            for (int c = 0; c < columnMax; c++) {
                Cell cell = entry.getCell(c);
                switch (c) {
                    case 0 -> id = (int) cell.getNumericCellValue();
                    case 1 -> name = cell.getStringCellValue();
                    case 2 -> dateOfBirth = cell.getDateCellValue();
                    case 3 -> weekNumber = (int) cell.getNumericCellValue();
                }
            }
            Members member = new Members(id, name, dateOfBirth, weekNumber);
            Application.membersList.add(member);
        }
    }
}
