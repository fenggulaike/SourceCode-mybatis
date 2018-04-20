package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static List<ListInfo> algorTest(List<Integer> list){
		
		List<ListInfo> listArr = new ArrayList<ListInfo>();
		int sum = 0;
		ListInfo listInfo = null;
		for(int i = 0; i < list.size(); i++ ){
			listInfo = new ListInfo();
			
			sum = list.get(i);
			listInfo.setData(sum);
			listInfo.setFromIndex(i);
			listInfo.setToIndex(i);
			
			for(int j = i+1; j<list.size(); j++){
				int temp = sum + list.get(j);
				if(temp > sum){
					listInfo.setData(temp);
					listInfo.setFromIndex(i);
					listInfo.setToIndex(j);
				}
				sum = temp;
			}
			
			listArr.add(listInfo);
			
		}
		return listArr;
	}
	
	public static int algorSimpleTest(List<Integer> list){
		
		int maxData=0;
		int sum = 0;
		int maxDataTemp = 0;
		
		for(int i = 0; i < list.size(); i++ ){
			sum = list.get(i);
			maxDataTemp = sum;
			for(int j = i+1; j<list.size(); j++){
				sum = sum + list.get(j);
				if(sum > maxDataTemp){
					maxDataTemp = sum;
				}
			}
			if(maxDataTemp > maxData){
				maxData = maxDataTemp;
			}
		}
		return maxData;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(2);
		list.add(-1);
		list.add(3);
		list.add(1);
		list.add(-2);
		list.add(8);
		list.add(-3);
		/*List<ListInfo> listArr = algorTest(list);
		System.out.println(listArr);*/
		
		int resultData = algorSimpleTest(list);
		System.out.println(resultData);
		
	}

}
