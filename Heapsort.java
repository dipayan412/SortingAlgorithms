package Heapsort;

public class Heapsort 
{
	private static int heapSize;
	
	
	public static void main(String[] args) 
	{
		int[] arr = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
		doHeapSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void doHeapSort(int [] arr)
	{
		buildMaxHeap(arr);
		for(int i = (arr.length - 1); i >= 1; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapSize--;
			maxHeapify(arr, 0);
		}
	}
	
	public static void buildMaxHeap(int[] arr)
	{
		heapSize = arr.length;
		for(int i = (arr.length / 2); i >= 0; i--)
		{
			maxHeapify(arr, i);
		}
	}
	
	public static void maxHeapify(int [] arr, int i)
	{
		int l = left(i);
		int r = right(i);
		int largest;
		if(l < heapSize && arr[l] > arr[i])
		{
			largest = l;
		}
		else
		{
			largest = i;
		}
		
		if(r < heapSize && arr[r] > arr[largest])
		{
			largest = r;
		}
		
		if(largest != i)
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			maxHeapify(arr, largest);
		}
	}
	
	public static int parent(int i)
	{
		return i / 2;
	}
	
	public static int left(int i)
	{
		return 2 * i;
	}
	
	public static int right(int i)
	{
		return (2 * i) + 1;
	}
}
