package Heap;

import java.util.Scanner;

public class HeapTester 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
	/*	HeapImplement h=new HeapImplement(10);
		
		for(int i=0;i<10;i++)
		{
			int val=sc.nextInt();
			h.insert(val);
		}
		h.delete();
		h.print();*/
		
		HeapSort h=new HeapSort();
		int arr[]={9,1,6,8,4,0,5,7,3};
		h.sort(arr);
		h.print(arr);
		
		sc.close();
	}

}
