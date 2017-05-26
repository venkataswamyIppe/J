package com.unit.testing.example;

public class Calculation {
	
	public static int findMax(int arr[]) {
		/*//wrong logic 
		int max = 0;*/
		//Correct program logic
		 int max=arr[0];//arr[0] instead of 0
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

}
