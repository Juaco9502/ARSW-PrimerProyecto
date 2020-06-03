package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.model.line.LOCLine;
import edu.escuelaing.arem.ASE.app.model.line.PhysicalLine;
import java.io.IOException;

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
        PhysicalLine physicalLine = new PhysicalLine();
        LOCLine locLine = new LOCLine();
        String file = args[0];
        try{
                
        	int resultphysi = physicalLine.countLines(file);
                int resultloc = locLine.countLines(file);
        	System.out.println("File selected: "+file);
        	System.out.println("Physical Lines: "+resultphysi);
                System.out.println("LOC Lines: "+resultloc);
        } catch (IOException e){
        	System.out.println("Error: Invalid file");
        }
    }
}