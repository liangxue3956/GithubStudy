package main;
import java.util.ArrayList;
import java.util.List;

import main.Sort;
public class Main {//�ɼ�ͳ��
	@SuppressWarnings("null")
	public static void main (String [] args){
		/************************�ɼ�������********************
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
		System.out.println("�ɼ�������:"+rate+"%");
		*****************************************************/		
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(80);
		arr.add(60);
		arr.add(20);
		arr.add(80);
		//�ɼ�������
		double passrate = (double) Passrate.passrate(arr);
		System.out.println("�����ʣ�"+passrate+"%");
		//ƽ����
		double average = Average.average(arr);
		System.out.println("ƽ����Ϊ:"+average);
		//ð������
		Object[]  strArr =  arr.toArray();//ת��Ϊ����
		int[] ll = new int[]{50,80,60,20,80};//����int����
		for (int i=0;i<strArr.length;i++){//���������±������λArraylist�е���
			 int a = (int)strArr[i];
//			 System.out.println(a);
			 ll[i]=a;
		 }
		Sort s =new Sort(ll);//���÷��������������
		s.xue();
		//�ɼ����ֵ
		//String lage;
		//zhuizhi chen = new zhuizhi();
		//lage=chen.zuizhi(arr);		
		//System.out.println("��߳ɼ�Ϊ:"+lage);


	}


}
