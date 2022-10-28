import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class createExcel {


        public static void main(String[] args) throws FileNotFoundException, IOException
        {
            //creating an instance of Workbook class
            Workbook wb = new HSSFWorkbook();
            //creates an excel file at the specified location
            OutputStream fileOut = new FileOutputStream("D:\\demo\\new.xlsx");
            System.out.println("Excel File has been created successfully.");
            wb.write(fileOut);
        }
    }

