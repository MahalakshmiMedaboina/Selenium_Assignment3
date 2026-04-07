package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {

    public static Object[][] getTestData(String filePath, String sheetName) throws IOException {

        FileInputStream fis = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) { // skip header
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
            }
        }

        workbook.close();
        return data;
    }
}