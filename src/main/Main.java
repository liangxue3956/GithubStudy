package main;
import java.util.ArrayList;

public class Main {//�ɼ�ͳ��
	public static void main (String [] args){
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(40);
		arr.add(60);
		arr.add(20);
		arr.add(80);
			
		double average = Average.average(arr);
		System.out.println("ƽ����Ϊ:"+average);
		
		
	}
	
	
	
}
