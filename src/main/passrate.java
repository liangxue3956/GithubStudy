package main;

import java.util.ArrayList;
import java.util.List;

public class passrate {
	public double passrate01(List<String>arrzxxList) {
		List<String>arr1=new ArrayList<String>();
		
		for(int i=0;i<arrzxxList.size();i++) {
			
			if(arrzxxList.get(i).compareTo("60")>0)//STring类型比较，若第一个大，返回大于0的值
			{
				arr1.add(arrzxxList.get(i));
				
			}
			
		}
	return	(Double.valueOf(arr1.size())/arrzxxList.size())*100;
		
	
	}

}
