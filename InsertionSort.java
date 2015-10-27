
public class InsertionSort 
{
	public static void sort(int[] A)
	{
		for(int i = 1; i < A.length; i++)
		{
			int temp = 0;
			int j = i;
			while(j > 0 && A[j - 1] > A[j])
			{
				temp = A[j - 1];
				A[j - 1] = A[j];
				A[j] = temp;
				
				j--;
			}
		}
		
		for(int i = 0; i < A.length; i++)
		{
			System.out.println(A[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr =  {9,8,7,6,5,4,3,22,1};
		sort(arr);
	}
}
