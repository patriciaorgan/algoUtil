/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
//imports for the writing to file and Exception handling
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//required for the passed ArrayList
import java.util.List;

public class Writing {
	//constructor
	public Writing(){
		
	}
	//method
	public void writeFile(List<Integer> list,String name){	
		//use a try catch to see if there is any problem with outputting to file
		try{
			//create FileWriter and BufferedWriter objects
			FileWriter outputFile = new FileWriter(name);
			BufferedWriter output = new BufferedWriter(outputFile);
			
			//loop through the integers in the ArrayList list
			for(int out:list){
				//need to convert the int value to String before writing to file using the String class method
				output.write(String.valueOf(out));
				output.newLine();
			}
			System.out.println("\nFile saved called " + name +
					"\nYou will find this in the working directory of your IDE.");
			output.close();
			
		}catch (IOException e){
			System.out.println("Failed to output because: " + e);
		}
		
	}//end writeFile method
}//end Writing Class
