package com.interview;
import java.util.Arrays;


public class ZeroLogic {

//	public static void main(String[] args)
//	{
//		int[] arr={1,0,4,5,0,0,0,2,4,6,0,3,0,3,3};
//		int len=arr.length-1;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=len; j>=0;j--)
//			{
//				if(arr[i]==0 && arr[j]!=0)
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			
//		}
//		for(int k=0; k<arr.length;k++)
//			System.out.println(arr[k]);
//	}
	public static void main(String[] args){
		 int count=0;
		 int temp;
		 int arr[] = {0,0,1,0,4,5,0,0,0,2,4,6,0,3,0,3,3};
		 int size = arr.length;
		 for(int i=0;i<=size-1;i++){
			 if(arr[i]==0){
			 for(int j=0;j<size-1;j++){
				 if(arr[j]==0){
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 count++;
				 }
			 }
			 
			 }
			  
		 }
		System.out.println(Arrays.toString(arr));	
		 }

}