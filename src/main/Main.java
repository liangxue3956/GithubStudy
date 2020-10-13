package main;
import java.util.ArrayList;

import main.Sort;
public class Main {//成绩统计
	@SuppressWarnings("null")
	public static void main (String [] args){
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(80);
		arr.add(60);
		arr.add(20);
		arr.add(80);

			
		double average = Average.average(arr);
		System.out.println("平均分为:"+average);
		
		
		Object[]  strArr =  arr.toArray();//转化为数组
		int[] ll = new int[]{50,80,60,20,80};//创建int数组
		for (int i=0;i<strArr.length;i++){//把数组中下标的数换位Arraylist中的数
			 int a = (int)strArr[i];
//			 System.out.println(a);
			 ll[i]=a;
		 }
		Sort s =new Sort(ll);//调用方法进行排序输出
		s.xue();

	}
	
	

}
