package main;
import java.util.ArrayList;
import java.util.List;

import main.Sort;
public class Main {//成绩统计
	@SuppressWarnings("null")
	public static void main (String [] args){
		/************************成绩及格率********************
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("50");
		arr.add("80");
		arr.add("60");
		arr.add("20");
		arr.add("80");
		List<String>arrzxxList=new ArrayList<String>();
		double rate=0.00;		
		passrate  pass = new passrate();
		rate=pass.passrate01(arr);
		System.out.println("成绩及格率:"+rate+"%");
		*****************************************************/		
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(80);
		arr.add(60);
		arr.add(20);
		arr.add(80);
		//成绩及格率
		double passrate = (double) Passrate.passrate(arr);
		System.out.println("及格率："+passrate+"%");
		//平均分
		double average = Average.average(arr);
		System.out.println("平均分为:"+average);
		//冒泡排序
		Object[]  strArr =  arr.toArray();//转化为数组
		int[] ll = new int[]{50,80,60,20,80};//创建int数组
		for (int i=0;i<strArr.length;i++){//把数组中下标的数换位Arraylist中的数
			 int a = (int)strArr[i];
//			 System.out.println(a);
			 ll[i]=a;
		 }
		Sort s =new Sort(ll);//调用方法进行排序输出
		s.xue();
		//成绩最大值
		//String lage;
		//zhuizhi chen = new zhuizhi();
		//lage=chen.zuizhi(arr);		
		//System.out.println("最高成绩为:"+lage);


	}


}
