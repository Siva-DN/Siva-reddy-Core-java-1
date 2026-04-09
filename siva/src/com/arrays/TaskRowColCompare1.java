package com.arrays;

public class TaskRowColCompare1 {


	
			    public static void main(String[] args) {

			        int[][] matrix = {
			                {1, 2},
			                {1, 9},
			                {4, 8},
			                {2, 6}
			        };

			        int n = matrix.length;

			        for (int i = 0; i < n; i++) {

			            

			            boolean insideAnother = false;

			            for (int j = 0; j < n; j++) {
			                if (i == j) continue;

			               

			                // strictly inside
			                if (matrix[i][0]>matrix[j][0]) {
			                    insideAnother = true;
			                    break;
			                }
			            }

			            if (insideAnother)
			                System.out.print("1");
			            else
			                System.out.print("0");
			        }
			    }
			}
