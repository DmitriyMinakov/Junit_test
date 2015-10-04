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
          while (sc.hasNextLine()) {
        	//sc.useDelimiter(";");
            String line = sc.nextLine();
            //a1.add(sc.nextInt());
            System.out.println (line);
            scr = new Scanner(line);
            scr.useDelimiter(";");
            while (scr.hasNextLine()) {
            	a1.add(scr.nextLine());  
            }
            System.out.println((a1));           
        }
        sc.close();


	}   
}
