package Sorting;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int ar[]=new int[5];
		//MergeSort m=new MergeSort();
		Quick q=new Quick();
		
		
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		//m.sort(ar, 0, 4);
		q.quickSort(ar, 0, 4);

		for(int i=0;i<5;i++)
			System.out.println(ar[i]);

	}

}
