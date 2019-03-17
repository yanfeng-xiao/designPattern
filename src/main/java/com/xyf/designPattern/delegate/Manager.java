package com.xyf.designPattern.delegate;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Workable {
	
	private List<Workable> list = new ArrayList<Workable>();
	
	public Manager(){
		list.add(new Worker("zhangsan"));
		list.add(new Worker("lisi"));
	}

	@Override
	public void work() {
		for(Workable worker:list){
			worker.work();
		}
	}

}
