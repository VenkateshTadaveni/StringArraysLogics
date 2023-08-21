package com.numbersLogics;

import java.util.Arrays;

public class ClimbingStars {
	
	public static int climbingStairs(int stairSteps) {
	
		if(stairSteps<=1) {
		
		int [] ways=new int[stairSteps+1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=stairSteps;i++) {
			ways[i]=ways[i-2]+ways[i-1];
		
		}
		System.out.println(ways[stairSteps]);

		return ways[stairSteps];
		
		}
		return stairSteps;
	}

	public static void main(String[] args) {
		ClimbingStars.climbingStairs(2);

	}

}

