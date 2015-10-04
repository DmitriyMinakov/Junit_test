package ru.mytest.maven_test;

import java.util.Scanner; 
import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {
	public static void main (String[] args) throws FileNotFoundException {
	FileReader fr = new FileReader (("data.txt"));
	Scanner sc = new Scanner(fr);
	Scanner scr;
    ArrayList<String> a1 = new ArrayList<String>();
    //ArrayList<Integer> a2    = new ArrayList<Integer>();

        while (sc.hasNextLine()) {
        	//sc.useDelimiter(";");
            String line = sc.nextLine();
            //a1.add(sc.nextInt());
            System.out.println (line);
            scr = new Scanner(line);
            scr.useDelimiter(";");
            while (scr.hasNextLine()) {
            	a1.add(scr.nextLine());
         
         //       if (scr.hasNext()) a2.add(scr.nextInt());
            }
 //           System.out.println (a1+a2);
            System.out.println((a1));
        //    System.out.println((a2));   
           
        }
        sc.close();


	}   
}
