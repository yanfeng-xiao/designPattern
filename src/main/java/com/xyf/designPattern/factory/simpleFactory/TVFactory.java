package com.xyf.designPattern.factory.simpleFactory;

import com.xyf.designPattern.factory.HairTV;
import com.xyf.designPattern.factory.HisenseTV;
import com.xyf.designPattern.factory.TV;

public class TVFactory {
	
	public static TV create(TVType type){
		if(type == TVType.HAIR){
			return new HairTV();
		}else if(type == TVType.HISENSE){
			return new HisenseTV();
		}else{
			return null;
		}
	}

}
