import java.util.Arrays;
//Lingli Zou
//2/1/2017
//Lab 3.1: In Place Sort
public class ArrayMethods1 {

	public static void main(String[] args)
	{
		String[] bubbleS = { "Coconut", "Apple", "Eggplant", "Banana", "Dewberry" };		
		double[] selectionS = { 1.2,6.3,3.5,9.9,0.0 };		
		int[] insertionS = { 1,6,7,0,5 };
		
		//Bubble Sort Test
		long start = System.nanoTime();
		bubbleSort(bubbleS);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Bubble Sort Took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(bubbleS));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(selectionS);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Selection Sort Took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(selectionS));
		
		//Insertion Sort Test
		start = System.nanoTime();
		insertionSort(insertionS);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Insertion Sort Took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(insertionS));

	}	
	
	//Bubble sort iterates through the list, swapping any out of order elements. 
	//We keep iterating until no swaps are required
	public static void bubbleSort(String [] list1)
	{
		
	    String temp;
	    int swap=1000;
	    while(swap>0) {
	    	swap=0;
	    	for(int outside=0; outside<list1.length-1; outside++)
	    	{
	    		for(int inside=1; inside>(list1.length-outside); inside++)
	    		{
	    			if(list1[inside-1].compareTo(list1[inside])>0)
	    			{
	    				swap++;
	    				temp=list1[inside-1];
	    				list1[inside-1]=list1[inside];
	    				list1[inside]=temp;
	    			}
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
	
		for(int outside=0; outside<list1.length-1; outside++)
		{
			outside=smallest;
			for(int inside=1; inside<list1.length-1; inside++)
			{
				if(list1[inside]<list1[smallest])
				{
					smallest = inside;
				}
			}
			temp=list1[smallest];
			list1[smallest]=list1[outside];
			list1[outside]=temp;
		}
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


}
