package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.model.line.LOCLine;
import edu.escuelaing.arem.ASE.app.model.line.PhysicalLine;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.io.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    public AppTest(){

    }

    /**
    * Should correctly count the physical lines on the ArchiveTest.java file
    */
    @Test    
    public void CalculateTheNumberOfPhysicalLinesOfTheFile() throws IOException{
        String file = "src/test/resources/ArchiveTest.java";
        PhysicalLine physicalLine = new PhysicalLine();
        int result = physicalLine.countLines(file);
        assertTrue(result == 14);
    }
    
    /**
    * Should correctly count the physical lines on the ArchiveTest.java file
    */
    @Test    
    public void CalculateTheNumberOfLOCLinesOfTheFile() throws IOException{
        String file = "src/test/resources/ArchiveTest.java";
        LOCLine locLine = new LOCLine();
        int result = locLine.countLines(file);
        assertTrue(result == 6);
    }

    /**
    * Does not calculate lines because the file is non-existent
    */
    @Test
    public void DoesNotCalculateNonexistentFileLines(){
        String file = "src/test/resources/NonExistentFile.java";
        PhysicalLine physicalLine = new PhysicalLine();
        LOCLine locLine = new LOCLine();
        try {            
            int result = physicalLine.countLines(file);
            int result2 = locLine.countLines(file);
        } catch (IOException e){
            assertTrue(true);
        }
    }
}


