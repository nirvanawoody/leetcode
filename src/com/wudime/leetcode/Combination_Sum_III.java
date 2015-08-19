package com.wudime.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
	public static void main(String[] args) {
		List<List<Integer>> result = combinationSum3(3, 9);
		System.out.println(result);
	}
	
	
	public static List<List<Integer>> combinationSum3(int k, int n) {  
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    List<Integer> tmp = new ArrayList<Integer>();
	    com(k, n, result, tmp, 1);
	    return result;  
	}  
	
	public static void com(int k,int n,List<List<Integer>> result,List<Integer> tmp,int start){
		if(n==0&&tmp.size() == k){
			result.add(new ArrayList<Integer>(tmp));
		}
		for(int i = start;i<=9;i++){
			if(n-i<0){
				break;
			}
			if(tmp.size() >k){
				break;
			}
			tmp.add(i);
			com(k, n-i, result, tmp, i+1);
			tmp.remove(tmp.size()-1);
		}
		
	}
}
