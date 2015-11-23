/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treecreator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author Miguel Pineda
 */
public class XLSReader {
    private Workbook wb = null;
    private Sheet sheet = null;
    private int rowCount = 0;
    private FileInputStream xlsFile = null;
    
    public XLSReader() {
        if(wb == null){
            wb = new HSSFWorkbook();
//            after inmediately initialized the workbook then get the first sheet
            sheet = wb.getSheetAt(0);
//            get how many rows the file contains
            rowCount = sheet.getPhysicalNumberOfRows();
        }
    }

    public XLSReader(String xlsFile) {
        try {
            this.xlsFile = new FileInputStream(xlsFile);
        } catch (FileNotFoundException e) {
            System.out.println("Please check your file path and name.");
        }
        
        if(wb == null){
            try {
                wb = new HSSFWorkbook(this.xlsFile);
                sheet = wb.getSheetAt(0);
                rowCount = sheet.getPhysicalNumberOfRows();
            } catch (IOException ex) {
                Logger.getLogger(XLSReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public FileInputStream getXlsFile() {
        return xlsFile;
    }

    public void setXlsFile(FileInputStream xlsFile) {
        this.xlsFile = xlsFile;
    }
    
    
}
