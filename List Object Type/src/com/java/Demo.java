package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Students> list = new ArrayList();
		
		list.add(new Students(101,"Gauttam",50));
		list.add(new Students(102,"James",60));
		list.add(new Students(103,"Dennis",70));
		list.add(new Students(104,"Tim",80));
		
		Iterator<Students> itr = list.iterator();
		
				
		while(itr.hasNext())
		{
			Object ele = itr.next();
			System.out.println(ele);
		}
		
		
	}

	
}
