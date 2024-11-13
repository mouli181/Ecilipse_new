package com.kodnest.arrays;

public class TwoSum {
	

	    public static int[] findTwoSum(int[] stocks, int target) {
	        int left = 0;
	        int right = stocks.length - 1;

	        while (left < right) {
	            int sum = stocks[left] + stocks[right];

	            if (sum == target) {
	                return new int[]{left, right};
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        // No solution found
	        return new int[]{};
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] stocks = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = findTwoSum(stocks, target);

	        if (result.length == 2) {
	            System.out.println("Indices of the two stocks: [" + result[0] + ", " + result[1] + "]");
	        } else {
	            System.out.println("No valid solution found.");
	        }
	    }
	}


