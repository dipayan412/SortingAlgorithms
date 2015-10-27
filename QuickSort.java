package QuickSort;

public class QuickSort1 
{

	public static void main(String[] args) 
	{
		int[] arr = {10,9,8,7,5,4};
		doQuickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}
	
	public static void doQuickSort(int[] arr, int p, int r)
	{
		if(p < r)
		{
			int q = partition(arr, p, r);
			doQuickSort(arr, p, q-1);
			doQuickSort(arr, q+1, r);
		}
	}
	
	public static int partition(int[] arr, int p, int r)
	{
		int x = arr[r];
		int i = p - 1;
		for(int j = p; j < r; j++)
		{
			if(arr[j] < x)
			{
				i++;
				swap(arr, j, i);
			}
		}
		swap(arr, (i+1), r);
		return (i + 1);
	}
	
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void swap(int[] arr, int p, int q)
	{
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
	}
}