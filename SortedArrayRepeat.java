package com.vids.may14;

import java.util.HashSet;
import java.util.Set;

public class SortedArrayRepeat {


   
    private static void check(int[] arr1, int[] arr2, int[] arr3){
       Set<Integer> testSet1 = new HashSet<>();
       Set<Integer> testSet2 = new HashSet<>();
       
       for(int i=0; i<arr1.length; i++){
           testSet1.add(arr1[i]);
       }
       
       for(int i=0; i<arr2.length; i++){
           testSet2.add(arr2[i]);
       }
   
       for(int i=0; i<arr3.length; i++){
            if(testSet1.contains(arr3[i])== true && testSet2.contains(arr3[i])== true){
                System.out.println(arr3[i]);
            }
        }    
   
    }
	
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		//int[] arr2 = {1,2,3,4,5};
		//int[] arr3 = {1,2,3,4,5};
		int[] arr2 = {1,2,5,7,9};
		int[] arr3 = {1,3,4,5,8};

		check(arr1, arr2, arr3);

	}

}
