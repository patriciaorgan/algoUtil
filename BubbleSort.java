/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
import java.util.List;//required for the passed ArrayList

public class BubbleSort extends Sorts{
	// constructor
	public BubbleSort(){
		super();
	}
	//methods
	public String toString(){
		//method to return the name of the Class that was run
		String name = "BubbleSort.txt";
		return name;
	}//end toString method
	
	public void Sort(List<Integer> list,int start, int end){
		//Variable to use when swapping
				int temp=0; 
				//Variable to keep track of end of unsorted section on left
				//int end = list.size()-1 ;
				
				//loop from beginning or array to 1 before the end 
				//but the end moves lower each time as the highest value gets placed at the top
				for (int j=0; j<end; end--){ 
					//loop from beginning of array to the end of unsorted array on left side
					for (int i =0; i <end; i++){ 
							//check each value starting from 0 and move it up one to end if it larger
							if (list.get(i) > list.get(i+1)){ 
								//swap the larger value to the right by 1. the loop will bring it to the end
								temp = list.get(i); 
								list.set(i, list.get(i+1)); 
								list.set(i+1, temp); 
							} //end if
					} //end for
				}//end for	
	}//end sort method
	
	//override methods
	public int SortReturn(List<Integer> list,int start,int end) {return 0;}
	public void SortTempA(List<Integer> list, int[] temp, int start, int middle, int end){}
	
}//end BubbleSort Class
