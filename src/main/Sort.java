package main;

import java.util.ArrayList;

public class Sort {
	public ArrayList Sort1(ArrayList arr){
		int len= arr.size();
		for(int i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){//ע��ڶ���ѭ��������
				//ð�ݷ�����α����
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
                	}
    		}        
       }
		return arr;
}
}