package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.calculations.Count;
import edu.escuelaing.arem.ASE.app.linkedlist.LinkedList;
import java.io.FileNotFoundException;



    /**
     * Class App
     * @author juaco
     */
public class App 
{
    /**
     * 
     * Main method.
     * @param args - input
     */
    public static void main( String[] args )
    {
    	Count count = new Count();
    	String file = "";
    	LinkedList list = new LinkedList();

    	try{
        	file = args[0];
    	} catch (ArrayIndexOutOfBoundsException e){
    		System.out.println("Did not specify the file path");
    	}

    	try{
    		list = count.createList(file);
    	} catch (FileNotFoundException e){
    		System.out.println("The specified file does not exist");
    	}

    	float average = count.average(list);
        System.out.println("Average: " +average);
    	float standardDev = count.standardDeviation(list);
        System.out.println("Standard deviation: " +standardDev);
    	
    }  
}