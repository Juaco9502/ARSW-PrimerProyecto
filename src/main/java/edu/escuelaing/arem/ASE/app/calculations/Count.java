/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app.calculations;

import edu.escuelaing.arem.ASE.app.linkedlist.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author juaco
 */
public class Count {
    /**
     * Constructor Calculator 
     */
    public Count() {
    }
    
	/**
	* Create the LinkedList based on a file
	* @param file File
	* @return LinkedList 
	* @throws FileNotFoundException The specified file does not exist
	*/
	public LinkedList createList(String file) throws FileNotFoundException{

		LinkedList list = new LinkedList();
		Scanner scanner = new Scanner(new File(file));	
		while(scanner.hasNextFloat())
		{
     		list.setValueInPosition(list, scanner.nextFloat());
		}

		return list;

	}

	/**
	* Calculate the Average of the LinkedList
	* @param list LinkedList 
	* @return Average
	*/
	public float average(LinkedList list) {

		float suma = list.summatory(list);
		int tamano = list.sizeLinked(list);

		float result = (suma/tamano);

		return result;
	}

	/**
	* Calculate the Standard deviation of the LinkedList
	* @param list LinkedList 
	* @return Standard deviation
	*/
	public float standardDeviation(LinkedList list) {

		float average = average(list);
		float desvPartial = 0;
		for(int i=0; i<list.sizeLinked(list); i++){
			desvPartial += Math.pow(list.getValueInPosition(list,i) - average, 2);
		}

		float result = (float) Math.sqrt(desvPartial/(list.sizeLinked(list)-1));
		
		return result;
	}
 
}
