package main;

import java.util.ArrayList;

public class  Average {
     public static double average(ArrayList arr) {
    	 arr.size();
    	 int n = arr.size();
    	 int i=0;
         int sum=0;
 		 for(i=0;i<n;i++){
             	
 			 Object object = arr.get(i);
 			 int parseInt = Integer.parseInt(object.toString());
 			 sum+=parseInt;
		    }
 		 double	average = sum/n;
 		 return average;
     }
}
