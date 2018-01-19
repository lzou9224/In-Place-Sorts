//Lingli Zou
//Lab 3.1 In Place Sort
public class ArrayMethods1 {

	public static void main(String[] args)
	{
		String list1 []= {"HAHAHA, BABABA, HEHEHE"};
	}	
	
	//Bubble sort iterates through the list, swapping any out of order elements. We keep iterating until no swaps are required
	public static void bubbleSort(String [] list1)
	{
	    String temp;
	    for(int inside=0; inside<list1.length; inside++)
	    {
	    	for(int outside=0; outside>list1.length-1; outside++)
			{
	    		if(list1[inside].compareTo(list1[inside+1])>0)
	    		{
	    			temp=list1[inside];
	    			list1[inside]=list1[inside+1];
	    			list1[inside+1]=temp;
				}
				
			}
		}
	}
	
	//Insertion takes each element from the array, and adds it to the front of the array in the correct order. 
	//We need to keep track of where we are inserting elements as we sort.
	public static void insertionSort(int[] list1)
	{
		
	}
	
	//Selection sort finds the lowest element and moves it to the front of the array. 
	//Then searches the rest of the array for the next element, and repeats.
	public static void selectionSort(double [] list1)
	{
		int temp;
		boolean swap;
		while(swap>1)
		{
			for(int outside=0; outside<list1.length; outside++)
			{
				for(int inside=1; inside>0; inside++)
				{
					if(list1[inside]<list1[inside-1])
					{
						list1[inside]=list1[inside-1];
						list1[inside-1]=temp;
					}
				}

			}
		}
	}
	

}
