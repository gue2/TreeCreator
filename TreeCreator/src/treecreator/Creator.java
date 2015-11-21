/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treecreator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author Miguel Pineda
 */
public class Creator {
    private Workbook wb = null;
    private FileInputStream xlsFile = null;
    
    public Creator() {
        if(wb == null){
            wb = new HSSFWorkbook();
        }
    }

    public Creator(String xlsFile) {
        try {
            this.xlsFile = new FileInputStream(xlsFile);
        } catch (FileNotFoundException e) {
            System.out.println("Please check your file path and name.");
        }
    }
    
    
}
