package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.calculations.Count;
import edu.escuelaing.arem.ASE.app.linkedlist.LinkedList;
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
    * Calculate average and Standard deviation of the elements of the file DevelopmentHours.txt
    */
    @Test    
    public void CalculateAverageAndStandardDeviationFileItemsTestOption1() throws IOException{
        String file = "src/test/resources/DevelopmentHours.txt";
        Count count = new Count();
        LinkedList list = new LinkedList();
        list = count.createList(file);
        float result = count.average(list);
        float result2 = count.standardDeviation(list);
        assertTrue(result == (float) 60.32);
        assertTrue(result2 == (float) 62.255833);
    }

            
    /**
    * Calculate average and Standard deviation of the elements of the file ProxySize.txt
    */
    @Test    
    public void CalculateAverageAndStandardDeviationFileItemsTestOption2() throws IOException{
        String file = "src/test/resources/ProxySize.txt";
        Count count = new Count();
        LinkedList list = new LinkedList();
        list = count.createList(file);
        float result = count.average(list);
        float result2 = count.standardDeviation(list);
        assertTrue(result == (float) 550.6);
        assertTrue(result2 == (float)572.02686);
    }

    /**
    * Does not calculate lines because the file is non-existent
    */
    @Test
    public void DoesNotCalculateNonexistentFileLines(){
        String file = "src/test/resources/FileNoExist.txt";
        Count count = new Count();
        LinkedList list = new LinkedList();
        try { 
            list = count.createList(file);
            float result = count.average(list);
            float result2 = count.standardDeviation(list);
        } catch (IOException e){
            assertTrue(true);
        }
    }
}



