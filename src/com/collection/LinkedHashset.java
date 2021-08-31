// Linked Hash set use Linked list internally 
// 



package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(1);
		s.add(1);
		s.add(2);
		System.out.println(s.size());
	}

}
