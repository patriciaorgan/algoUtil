/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
import java.util.List;//required for the passed ArrayList

public class QuickSort  extends Sorts{
	//constructor
	public QuickSort(){
		super();
	}
	
	//methods
	public String toString(){
		//method to return the name of the Class that was run
		String name = "QuickSort.txt";
		return name;
	}//end toString method
	
	public void Sort(List<Integer> list, int start, int end){
		if (start < end) { 
			//sorting and setting a split with pivot 
			int partition = this.SortReturn(list, start, end); 
			//split to left side, which in turn calls PivotSort
			this.Sort(list, start, partition-1); 
			//split right side, which in turn calls PivotSort
			this.Sort(list,partition+1,end); 
		} 
	}//end sort method
	
	public int SortReturn(List<Integer> list,int start,int end) {

		 //pick pivot - pick right most as it a random list
		int pivot =list.get(end) ;
		//variable used for the swapping
		int temp=0;
		//represent left side end but will start at the beginning of the passed value start, 
		//as the left side will always start with only one element
		int leftendP=start ;
			
		for( int i = start; i  < end;i++){ 
			if (list.get(i) <= pivot){ 
				//swap value less then pivot
				temp = list.get(i); 
				list.set(i, list.get(leftendP)); 
				list.set(leftendP, temp);
				leftendP++;	//increase index right only if the number was less than pivot			 
				} 	
				
		} 	//end for loop
		//at end of sort, swap the pivot value into the end position of the left side
		//we know all is less than this pivot
		temp = list.get(leftendP); 
		list.set(leftendP, list.get(end)); 
		list.set(end, temp);
		// return this left position index it will create the partition that is already sorted based on pivot
		//will mean the pivot number has been placed in the middle and all the number that are lower than it 
		//have been placed to the left and all the remaining on right are larger thanks pivot
		return leftendP ;
		
	}//end sortReturn method
	
	//override method
	public void SortTempA(List<Integer> list, int[] temp, int start, int middle, int end){}
	
	
}//end QuickSort Class
