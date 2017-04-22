package Heap;


class HeapImplement
{
	private int ind,size;
	private int heap[];
	
	public HeapImplement(int size)
	{
		ind=0;
		this.size=size;
		heap=new int[size];
	}
	
	public int parent(int i)
	{
		return ((i-1)/2);
	}
	
	public int left(int i)
	{
		return (i*2+1);
	}
	public int right(int i)
	{
		return (i*2+2);
	}
	
	public void swap(int a,int b)
	{
		int tm=heap[a];
		heap[a]=heap[b];
		heap[b]=tm;
	}
	
	public void insert(int val)
	{
		if(ind==size)
		{
			System.out.println("Over Flow");
			return;
		}
		
		int i=ind;
		heap[ind++]=val;
		
		while(i!=0 && heap[parent(i)]>heap[i])
		{
			swap(parent(i),i);
			i=parent(i);
		}
	}
	
	public int delete()
	{
		if(ind<=0)
		{
			System.out.println("heap is empty");
			return -1;
		}
		
		if(ind==1)
		{
			ind=0;
			return heap[ind];
		}
		
		int min=heap[0];
		ind--;
		heap[0]=heap[ind];
		heapify(0);
		
		return min;
	}
	
	public void heapify(int i)
	{
		int l=left(i);
		int r=right(i);
		int small=i;
		if(l<ind && heap[i]>heap[l])
			small=l;
		
		if(r<ind && heap[small]>heap[r])
			small=r;
		
		if(small!=i)
		{
			swap(small,i);
			heapify(small);
		}
	}
	
	public void print()
	{
		for(int i=0;i<ind;i++)
		{
			System.out.println(heap[i]);
		}
	}
}
