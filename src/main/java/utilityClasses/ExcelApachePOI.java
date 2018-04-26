package utilityClasses;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelApachePOI {

    private static ArrayList<String> readExcelSheet(String sheetName) throws IOException {
        String excelFilePath = "/Users/poonamwadkar/Documents/ESFA_Repositories/AcademyAccountReturn/AR2_3/src/test/dataSheetsResources/AR_DataSheet/AR3_DataSheetReferences.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet workSheet = workbook.getSheet(sheetName);

        ArrayList<String> extractedFromExcel = new ArrayList<String>();
        int rowNum = workSheet.getLastRowNum() + 1;
        int colNum = workSheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNum][colNum];

        for(int i = 0; i <rowNum; i++){
            XSSFRow row = workSheet.getRow(i);
            for (int j = 0; j < colNum; j++){
                XSSFCell cell = row.getCell(j);
                String value = cell.toString();
                data[i][j] = value;
                extractedFromExcel.add(value);
                System.out.println ("the value is " + value);
            }
        }

        return extractedFromExcel;
    }

    public static ArrayList<String> getDataFromExcel(String sheetName) throws IOException {
        return readExcelSheet(sheetName);
    }


    /**
     *
     * @param sheetName is the name of the sheet to pick the data from
     * @param columnNumber1 is the column number in the sheet
     * @return the Arraylist of all the values in the column
     * @throws IOException is the File IO exception if occurred. This is checked exception.
     */
    private static ArrayList<String> readExcelSheetByColumnNumber(String sheetName, int columnNumber1) throws IOException {
        String excelFilePath = "/Users/poonamwadkar/Documents/ESFA_Repositories/AcademyAccountReturn/AR2_3/src/test/resources/DATA_SHEETS/AR3_DataSheetReferences.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet workSheet = workbook.getSheet(sheetName);

        ArrayList<String> extractedFromExcel = new ArrayList<String>();
        int rowNum = workSheet.getLastRowNum() + 1;
        int colNum = workSheet.getRow(0).getLastCellNum();

        String[][] data = new String[rowNum][columnNumber1];

        for(int i = 0; i <rowNum; i++){
            XSSFRow row = workSheet.getRow(i);
            for (int j = 0; j < colNum; j++){
                XSSFCell cell = row.getCell(j);
                String value = cell.toString();
                data[i][j] = value;
                extractedFromExcel.add(value);
                System.out.println ("the value is " + value);
            }
        }

        return extractedFromExcel;
    }


    public boolean areReferenceNumbersCorrectlyPresentAndDisplayed(String pageName){
        return true;
    }
}
