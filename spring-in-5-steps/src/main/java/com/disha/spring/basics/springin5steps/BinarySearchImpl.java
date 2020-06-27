package com.disha.spring.basics.springin5steps;

public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] array,int search)
	{
		
		int[]sortedNumbers = sortAlgorithm.sort(array);
		System.out.println(sortAlgorithm);
		//Search the array
		
		return 3;
	}
}
