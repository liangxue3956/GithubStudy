package main;
import java.util.ArrayList;

import main.Sort;
public class Main {//�ɼ�ͳ��
	@SuppressWarnings("null")
	public static void main (String [] args){
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(80);
		arr.add(60);
		arr.add(20);
		arr.add(80);
		Object[]  strArr =  arr.toArray();//ת��Ϊ����
		int[] ll = new int[]{50,80,60,20,80};//����int����
		for (int i=0;i<strArr.length;i++){//���������±������λArraylist�е���
			 int a = (int)strArr[i];
//			 System.out.println(a);
			 ll[i]=a;
		 }
		Sort s =new Sort(ll);//���÷��������������
		s.xue();
	}
 
}
