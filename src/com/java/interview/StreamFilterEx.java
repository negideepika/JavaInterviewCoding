package com.java.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

	public static void main(String[] args) {
		List<String> listData=Arrays.asList("Deepika","Deepika","Deepa","Ankita","Anuradha","Anchal","Nikky");
		List<String> sortedList=listData.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<String> uniqueData= sortedList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueData);
        List<String> startWithD= listData.stream().filter(list-> list.startsWith("D")).collect(Collectors.toList());
	     System.out.println(startWithD);
	
	}

}
