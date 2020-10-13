package main;

import java.util.ArrayList;
import java.util.Arrays;
 
public class Sort {
	public Sort(int[] numbers) {
		for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        } 
		for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
	}
	public void xue(){}

 
}
/*if((int)arr.get(j)>(int)arr.get(j+1)){
	int temp=(int)arr.get(j);*/