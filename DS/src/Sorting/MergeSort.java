package Sorting;

import java.util.Arrays;

public class MergeSort
{
	
	public void merge(int ar[],int l,int m,int r)
	{
		int f=m;
		int s=r;
		
		int []na=Arrays.copyOf(ar, ar.length);
		
		int i=0,j=m+1,k=l;
		
		while(i<=f && j<s)
		{
			if(na[i]<na[j])
			{
				ar[k]=na[i];
				i++;
			}
			else
			{
				ar[k]=na[j];
				j++;
			}
			k++;
		}
		
		if(i<=f)
		{
			while(i<=f)
			{
				ar[k++]=na[i++];
			}
		}
		
		if(j<s)
		{
			while(j<s)
			{
				ar[k++]=na[j++];
			}
		}
	}
	public void sort(int []ar,int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			
			sort(ar,l,m);
			sort(ar,m+1,r);
			
			merge(ar,l,m,r);
		}
	}
}
