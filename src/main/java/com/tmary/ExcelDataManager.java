package com.tmary;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ExcelDataManager {

    public Members getMembers() throws IOException {
        Members member = null;

        // access the Excel file
        String path = "/Users/nadavdayan/Desktop/Oracle Certification/Java/Documents/Worksheet in Ex-1-Birthday-Listings.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheetAt(0);

        int rowMax = sheet.getLastRowNum();
        int columnMax = sheet.getRow(0).getLastCellNum();

        for (int r = 4; r < rowMax; r++) {
            Row entry = sheet.getRow(r);

            for (int c = 0; c < columnMax; c++) {
                int id;
                String name;
                Date dateOfBirth;
                int weekNumber;

                Cell cell = entry.getCell(c);
                switch (c) {
                    case 0:
                        id = (int) cell.getNumericCellValue();
                        break;
                    case 1:
                        name = cell.getStringCellValue();
                        break;
                    case 2:
                        dateOfBirth = cell.getDateCellValue();
                        break;
                    case 3:
                        weekNumber = (int) cell.getNumericCellValue();
                }

            }
        }


        // declare cells as variables
        return member;
    }
}
