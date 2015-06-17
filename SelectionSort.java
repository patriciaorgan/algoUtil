/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
import java.util.List;//required for the passed ArrayList

public  class SelectionSort  extends Sorts{
	// constructor
	public SelectionSort(){
		super();
	}
	//methods
	public String toString(){
		//method to return the name of the Class that was run
		String name = "SelectionSort.txt";
		return name;
	}//end toString method
	
	public void Sort(List<Integer> list,int start, int end){
		int temp; //required for swapping
		//int end = list.size()-1; //Variable to make code more readable
		int minpos = 0; //the index in the array where the minimum value is
		//loop through array until 1 before the end
		//each time increasing the start of the unsorted right side of array
		for(int j=0; j<end; j++) { 
			//initially set the min value to be the fist position in unsorted array and then 
			//increase by one in each iteration
			minpos = j; 
			//loop through unsorted right side of array till the last index
			for(int i = j+1; i<=end;i++){ 
				//check all in unsorted right side which is the minimum, each time you find keep record with minpos
				if (list.get(i) < list.get(minpos)){
					minpos=i; 
				} 	
			} 
			 //swap minimum value to the start of the unsorted right side(j)
			 temp = list.get(j);
			 list.set(j, list.get(minpos));
			 list.set(minpos, temp);
		} //end for
	}//end sort method
	
	//Override Methods
	public int SortReturn(List<Integer> list,int start,int end) {return 0;}
	public void SortTempA(List<Integer> list, int[] temp, int start, int middle, int end){}
	
}//end SelectionSort Class
