/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app.linkedlist;

    
/**
 * Class LinkedList
 * @author juaco
 */
public class LinkedList {

	Node head; 
  
    //Class Node
    static class Node { 
  
        float value; 
        Node next; 
  
        // Constructor 
        Node(float d) { 
            value = d; 
            next = null; 
        } 
    }    
  
    /**
    * Add data to the LinkedList
    * @param list LinkedList
    * @param value Value to add
    * @return Final LinkedList
    */
    public static LinkedList setValueInPosition(LinkedList list, float value) { 
         
        Node newNode = new Node(value); 
        newNode.next = null;  
        
        if (list.head == null) { 
            list.head = newNode; 
        } else {             
            Node tail = list.head; 
            while (tail.next != null) { 
                tail = tail.next; 
            } 
             
            tail.next = newNode; 
        }  
        
        return list; 
    }



    /**
    * Extract value in position
    * @param list LinkedList 
    * @param position position LinkedList
    * @return position value
    */
    public static float getValueInPosition(LinkedList list, int position){

    	Node currentNode = list.head;
    	float valor = 0;

    	if (position == 0 && currentNode != null) { 

            valor = currentNode.value;            
            return valor; 
        }  
        
        int cont = 0;        
        while (currentNode != null) { 
  
            if (cont == position) {                 
                valor = currentNode.value;  
                break; 
            } else {                 
                currentNode = currentNode.next; 
                cont++; 
            } 
        }
                
        return valor;

    }

    /**
    * Calculate the size of LinkedList
    * @param list LinkedList 
    * @return LinkedList length
    */
    public static int sizeLinked(LinkedList list){

    	Node currentNode = list.head;

    	int cont = 0;        
        while (currentNode != null) {                 
            currentNode = currentNode.next; 
            cont++;            
        }

        return cont;
    }

    /**
    * Summation of the elements of the LinkedList
    * @param list LinkedList 
    * @return summatory
    */
    public static float summatory(LinkedList list){

    	Node currentNode = list.head;

    	float cont = 0;        
        while (currentNode != null) {  
                             
            cont += currentNode.value;
            currentNode = currentNode.next;                        
        }

        return cont;

    }  
    
}
