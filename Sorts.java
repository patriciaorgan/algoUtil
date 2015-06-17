/**
 * Patricia Organ - 01110489 - CT853 Algorithms Assignment 2014
 */
package algoUtil;//this is the folder name I have locally for my package
import java.util.List;//required for the passed ArrayList

public abstract class Sorts{
	//constructor
	public Sorts(){
	}
	//common method
	public void testSort(List<Integer> list){
			//variable declared and initialised for testing sort
			String testResult = "sorted"; 
			//check through the sorted array to see if it is all sorted and output the result accordingly
			for(int i=0;i<list.size()-1;i++){
				 if (!(list.get(i)<= list.get(i+1))){
					 testResult = "not sorted";
				 } 
			}
			System.out.println("Array is " + testResult);
	}//end testSort
	
	//Abstract methods
	public abstract String toString();
	public abstract void Sort(List<Integer> list, int start, int end);
	public abstract void SortTempA(List<Integer> list, int[] temp, int start, int middle, int end);
	public abstract int SortReturn(List<Integer> list,int start,int end);

}//end SuperClass Sorts
