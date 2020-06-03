/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app.model.line;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
    
/**
 * Class PhysicalLine
 * @author juaco
 */
public class PhysicalLine {
    
    /**
    * Constructor PhysicalLine
    */
    public PhysicalLine() {
    }
    
    /**
     * Calculate the physical lines.
     * @param args - File path
     * @return int -    Quantity of physical lines
     * @throws IOException 
     */
    public int countLines(String args) throws IOException{  
        int numberOfLines = 0;
        File file = new File(args);
        try{
            FileReader fileReader = new FileReader(file);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            lineNumberReader.skip(Long.MAX_VALUE);
            numberOfLines = lineNumberReader.getLineNumber();
            numberOfLines += 1;
        }catch (FileNotFoundException e) {
            System.out.println("Error.");
        }
        return numberOfLines;
    }
    
}
