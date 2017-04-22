package Heap;

public class HeapSort
{
	public void sort(int arr[])
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
			heapify(arr,n,i);
		
		for(int i=n-1;i>=0;i--)
		{
			int tm=arr[i];
			arr[i]=arr[0];
			arr[0]=tm;
			heapify(arr,i,0);
		}
	}
	
	public void heapify(int arr[],int n,int i)
	{
		int l=2*i+1;
		int r=2*i+2;
		int large=i;
		
		if(l<n && arr[l]>arr[i])
			large=l;
		
		if(r<n && arr[r]>arr[large])
			large=r;
		if(large!=i)
		{
			int tm=arr[i];
			arr[i]=arr[large];
			arr[large]=tm;
			
			heapify(arr,n,large);
		}
	}
	
	public void print(int []ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
