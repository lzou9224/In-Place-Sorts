
import java.util.Arrays;
//Lingli Zou
//2/1/2017
//Lab 3.1: In Place Sort
public class ArrayMethods1 {

	public static void main(String[] args)
	{
		// testing different arrays
		int[] test1 = { 1,6,7,0,5 };
		double[] test2 = { 1.2,6.3,3.5,9.9,0.0 };		
		String[] test3 = { "Coconut", "Apple", "Eggplant", "Banana", "Dewberry" };	
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Insertion Sort Took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Selection Sort Took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Bubble Sort Took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));

	}	
	
	//Insertion takes each element from the array, and adds it to the front of the array in the correct order. 
	//We need to keep track of where we are inserting elements as we sort.
	
	public static void insertionSort(int[] list1)
	{
		int temp=0;
		for(int outside=1; outside<list1.length; outside++)
		{
			for(int inside=outside; inside>0; inside--)
			{
				if(list1[inside]<list1[inside-1])
				{
					temp=list1[inside-1];
					list1[inside-1]=list1[inside];
					list1[inside]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}
	
	//Selection sort finds the lowest element and moves it to the front of the array. 
	//Then searches the rest of the array for the next element, and repeats.
	
	public static void selectionSort(double [] list1)
	{
		double temp= 0.0;
		int smallest=0;
	
		for(int outside=0; outside<list1.length; outside++)
		{
			//System.out.println("Outside: " + outside);
			smallest=outside;
			for(int inside=1+outside; inside<list1.length; inside++)
			{
				if(list1[inside]<list1[smallest])
				{
					smallest = inside;		
					//System.out.println(smallest);

				}
			}
			temp=list1[smallest];
			list1[smallest]=list1[outside];
			list1[outside]=temp;
		}
	}	

	
	//Bubble sort iterates through the list, swapping any out of order elements. 
	//We keep iterating until no swaps are required
	
	public static void bubbleSort(String [] list1)
	{
		
	    String temp;
	    int swap=1000;
	    while(swap>0) 
	    {
	    	swap=0;
	    	for(int outside=0; outside<list1.length-1; outside++)
	    	{
	    		if(list1[outside+1].compareTo(list1[outside])<0)
	    		{
	    			swap++;
	    			temp=list1[outside];
	    			list1[outside]=list1[outside+1];
	    			list1[outside+1]=temp;
	    		}
	    	}
	    }
	    
	}
}
