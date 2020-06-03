/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app.model.line;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author juaco
 */
public class LOCLine {
    /**
     * Constructor LOCLine 
     */
    public LOCLine() {
    }
    
    /**
     * Calculate the number of lines and ignore comments and non-code elements
     * @param args - File path
     * @return int - Quantity of physical lines
     * @throws IOException 
     */
    public int countLines(String args) throws IOException{  
        int numberOfLines = 0;
        File file = new File(args);
        try{
            BufferedReader fileReader = new BufferedReader (new FileReader(file));
            String LineRead;
            while ((LineRead = fileReader.readLine()) != null){
                numberOfLines+=1;
                if(LineRead.replace(" ","").isEmpty() 
                || (LineRead.contains("/*") 
                || LineRead.contains("/**") 
                || LineRead.contains("*") 
                || LineRead.contains("//")
                )){
                    numberOfLines-=1;
                }
            }    
            fileReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("Error.");
        }
        return numberOfLines;
    }    
}
