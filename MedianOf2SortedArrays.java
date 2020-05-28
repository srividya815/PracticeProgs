package com.vids.may20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianOf2SortedArrays {

	public static void main(String[] args) {
		int[] array1 = {2 ,3 ,6 ,7, 9};
		int[] array2 = {-1 ,4, 8, 10};
		
		List<Integer> newList = Stream.of(Arrays.stream(array1).boxed().collect(Collectors.toList()),
					Arrays.stream(array2).boxed().collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
		
		newList.stream().forEach(System.out::print);
		int median =0;
		int val = newList.size()/2;
		if(newList.size() %2 ==0){//even
			median = (newList.get(val-1) + newList.get(val))/2; 
		}else{//odd
			median = newList.get(val)/2;
		}
		
		System.out.println("Median-"+median);
	}

}
