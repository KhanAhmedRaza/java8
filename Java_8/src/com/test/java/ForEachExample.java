package com.test.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0;i < 10; i++) myList.add(i);
		//traversing using iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator value "+i);	
		}
		
		//traversing through forEach
		
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach ananumous class "+t);
			}
		});
		
		//forEach using Consumer Implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}

}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer Implements values "+t);
		
	}
	
	
}
