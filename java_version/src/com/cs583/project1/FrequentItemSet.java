package com.cs583.project1;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FrequentItemSet {
	
	Set<Long> itemSet;
	
	float actualCount;
	
	float tailCount;
	
	float MIS;
	
	public FrequentItemSet() {
		itemSet = new TreeSet<Long>();
		actualCount = 0;
		tailCount = 0;
		MIS = 0;
	}
	
	public FrequentItemSet(String items) {
		itemSet = new HashSet<Long>();
		actualCount = 0;
		tailCount = 0;
		MIS = 0;
		
		StringTokenizer st = new StringTokenizer(items, ",");
		while(st.hasMoreTokens())
		   itemSet.add(Long.valueOf(st.nextToken()));		
	}
	
	public void setItemSet(Set<Long> itemSet) {
		this.itemSet = itemSet;
	}
	
	public Set<Long> getItemSet() {
		return itemSet;
	}
	
	public Set<Long> getTailItemSet() {
		return itemSet.stream()
				   .skip(1)
				   .collect(Collectors.toSet());
	}
	
	public void setCount(float count) {
		this.actualCount = count;
	}
	
	public float getCount() {
		return actualCount;
	}
	
	public void setTailCount(float tailCount) {
		this.tailCount = tailCount;
	}
	
	public float getTailCount() {
		return tailCount;
	}
	
	public void setMIS(float MIS) {
		this.MIS = MIS;
	}
	
	public float getMIS() {
		return MIS;
	}
	
	public float getSupport(float transactionCount) {
		return actualCount / transactionCount;
	}
}
