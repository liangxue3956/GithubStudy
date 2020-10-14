package main;

import java.util.ArrayList;
import java.util.List;

public class Passrate {
	public static double passrate (ArrayList arr) {
		int n =arr.size();
		int i =0;
		double k=0;
		for(i=0;i<n;i++) {
			int d1=(int) arr.get(i);
			
			if(d1>60||d1==60) {
				k=k+1;
				
			}
			
		}
		double passrate = k/n*100;
		
		return passrate;
		
		
	}
}
	/*public double passrate01(List<String>arrzxxList) {
		List<String>arr1=new ArrayList<String>();
		
		for(int i=0;i<arrzxxList.size();i++) {
			
			if(arrzxxList.get(i).compareTo("60")>0)//STring类型比较，若第一个大，返回大于0的值
			{
				arr1.add(arrzxxList.get(i));
				
			}
			
		}
	return	(Double.valueOf(arr1.size())/arrzxxList.size())*100;
		
	
	}*/
	


