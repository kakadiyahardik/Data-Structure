package Sorting;

public class Quick {

	public int partition(int []ar,int l,int r)
	{
		int pivot=ar[r];
		
		int i=l;
		
		for(int j=l;j<=r-1;j++)
		{
			if(ar[j]<=pivot)
			{
				
				int val=ar[i];
				ar[i]=ar[j];
				ar[j]=val;
				i++;
				
			}
		}
		
		int vl=ar[i];
		ar[i]=ar[r];
		ar[r]=vl;
		
		return i;
	}
	
	public void quickSort(int []ar,int l,int r)
	{
		if(l<r)
		{
			int p=partition(ar,l,r);
			
			quickSort(ar,l,p-1);
			quickSort(ar,p+1,r);
		}
	}
}
