package com.vids.may13;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {11, 34, 66, 75};
		int[] arr2 = {1, 5, 19, 50, 89, 100};
		
		int[] result = new int[arr1.length + arr2.length]; 
		int i=0, j=0, k=0;
		while(i < arr1.length && j < arr2.length){
			//System.out.println("In while -"+arr1[i] +"\t arr2="+arr2[j]);
			if(arr1[i] < arr2[j]){
				result[k] = arr1[i];
				k++;
				i++;
			}else{
				result[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i < arr1.length){
			result[k] = arr1[i];
			i++;
			k++;
		}


		while(j < arr2.length){
	//	System.out.println(j+ " is index a2[j]" + arr2[j] +" k is"+k);
			result[k] = arr2[j];
			j++;
			k++;
		}

		for(int x : arr1){
			System.out.print(x+", ");
		}
		System.out.println("");
		for(int x : arr2){
			System.out.print(x+", ");
		}
		System.out.println("");
		for(int x : result){
			System.out.print(x+", ");
		}
	}

}
