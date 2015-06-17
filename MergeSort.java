/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
import java.util.List;//required for the passed ArrayList

public class MergeSort extends Sorts {
	// constructor
	public MergeSort(){
		super();
	}
	//methods
	public String toString(){
		//method to return the name of the Class that was run
		String name = "MergeSort.txt";
		return name;
	}//end toString method
	
	public void Sort(List<Integer> list, int start, int end){
		//create a temp array and initialising to the size of the ArrayList
		int[] temp = new int[list.size()];
		
		//when there is only 2 elements in the passed start and end 
		//there will be no need to merge just sort
		if (end-start == 1){
			this.SortTempA(list, temp, start,(int)((start+end)/2), end);
		}//end if
		//check to ensure the size from start to end is more then 2 in size
		else if(start+1 < end){
			//Recursively call method for left side
			this.Sort(list, start, (int)((start+end)/2));

			//Recursively call method for right side
			this.Sort(list, (int)((start+end)/2 + 1), end);

			//Do the sort and save
			this.SortTempA(list, temp, start, (int)((start+end)/2), end);
		}//end else if
	}//end sort method
	
	public void SortTempA(List<Integer> list, int[] temp, int start, int middle, int end){
 
		int p = start; //left side position marker
		int q = middle+1; //right side position marker	
		int j=middle+1;
		//recursively call sort for right side
		if (j < end){
				SortTempA(list,temp,j,(int)((j+end)/2),end);
		}
      
		//Do the sort of left side + right side after being done
		//merge and sort result into temp Array
		
		//check if the value of q after adding 1 is not greater then size of array
		if (q > end ){ q=end; }
		//loop for each element from passed start and end
		for (int k = start; k <=end; k++){
				//check to ensure don't loop too far so we go up to middle and up to end not passed
				if( (p <= middle ) && (q <= end) ){
					//compare p value to q value and move up one when success is found on either side
					if ( list.get(p) < list.get(q)){
						//when find lowest value place in temp array at beginning (in relation to passed values)
						//and next time it will move up one with counter k
						temp[k] = list.get(p);
						p++; //increase left side as value was found on left
					}else{
						temp[k] = list.get(q);
						q++; //increase right side as value was found on right
					}//end else if
					
				}//end if
				
				//if the left side has reached the end
				//copy the remaining right sorted elements
				else if( p == middle+1){
					temp[k] = list.get(q);
					q++;
				}//end else if
				//if the right side has reached the end
				//copy the remaining left sorted element
				else if( q == end+1){
					temp[k] = list.get(p);
					p++;
				}//end else if
		}// end for loop
		
		//Copy result back to array as you go along
		for (int i = start; i <= end; i++) {
			list.set(i,temp[i]);
		}//end for loop
	}//end sortTempA method
	
	//Override Method
	public int SortReturn(List<Integer> list,int start,int end) {return 0;}
	
}//end MergeSort Class
