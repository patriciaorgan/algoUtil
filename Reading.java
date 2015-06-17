/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
//imported for the reading and exception handling
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//required for the passed ArrayList
import java.util.List;
import java.util.Scanner;

public class Reading {
	//constructor
	public Reading(){
		
	}
	//method
	public void readFile(List<Integer> list){
		//create Scanner object for inputting from users
		Scanner input = new Scanner(System.in);
		//use a try catch to let user know if issue reading the file or the text inputed for file
		while (true){
			try{
				
				System.out.println("Enter the name of the file and it's extention .txt, (our example is RandomNumbers.txt)" +
						" \nbut please save the file in the Working Directory of your IDE first:");
				String file = input.next();
				//create a BufferedReader and pass it a FileReader and the file name given by user
				BufferedReader read = new BufferedReader(new FileReader(file));
			
				
				//loop over each line in the file
				while(true){
					String number = read.readLine();
					if (number == null){ 
						//when the last line is reached it will be null so break
						break;
					}
					//add the parsed string as an integer to the ArrayList
					list.add((Integer.parseInt(number)));
	
				}
				read.close();//close the BufferedReader
				//need a way to break out of the loop, so when file is read successfully we break
				if (read !=null){
					break;
				}
				
			}catch (IOException e){
				System.out.println("Something wrong with file, "+ e);
			}//end try catch
			
		}//end while loop
		input.close();//close the Scanner object
	}//end readFile method
}//end Reading Class
