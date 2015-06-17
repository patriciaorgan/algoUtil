/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
import java.util.List; //required for the passed ArrayList

public class InsertionSort extends Sorts {
	// constructor
	public InsertionSort(){
		super();
	}
	//methods
	public String toString(){
		//method to return the name of the Class that was run
		String name = "InsertionSort.txt";
		return name;
	}//end toString method
	
	public void Sort(List<Integer> list,int start, int end){
		//declare variable for counting
				int count;
				//declare variable to hold value to be inserted
				int insert; 
				//unsorted start position index, using this for more readability to code
				int unSstart=1;
				
				//loop from start to 1 before end of ArrayList
				for( int i=0; i< list.size()-1; i++){
					//this variable count will be counting each time the insert value (start value of unsorted right side)
					//is less then values in sorted arrayList left side
					count=0;
					insert= list.get(unSstart);
					//loop from end of sorted left side down to zero
					for (int j=unSstart-1; j >= 0; j--){
						//identify if the new insert is less then sorted values
						if (insert < list.get(j)){
							//as we have saved the value for the insert we can overwrite it
							//by moving each value up one on array that is less then insert
							list.set(j+1, list.get(j));
							count++;
						}//end if
					}//end for loop
					
					//and at the end we place the insert where we want it, based on count we know
					//it is this far down the sorted side
					list.set(unSstart-count, insert);
					//we move the starting position up one could have used i+1 but thought more readable this way
					unSstart++;
						
				}//end for loop
	}//end sort method
	
	//override methods
	public int SortReturn(List<Integer> list,int start,int end) {return 0;}
	public void SortTempA(List<Integer> list, int[] temp, int start, int middle, int end){	}

}//end InsertionSort Class
