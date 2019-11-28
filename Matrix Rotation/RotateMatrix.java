package com.omniwyse.assignment3;

public class RotateMatrix {
	public static int[][] rotateMatrix(int size, int matrix[][]) {
		int last = size - 1;
		int level = 0;
		while (level < size / 2) {
			//to rotate the matrix in anti-clockwise direction...
			/*for (int i = level; i < last; i++) {
				int temp = matrix[level][i];
				matrix[level][i] = matrix[i][last];
				matrix[i][last] = matrix[last][last - i + level];
				matrix[last][last - i + level] = matrix[last - i + level][level];
				matrix[last - i + level][level] = temp;
			}*/
			
			//to rotate the matrix in clockwise direction.
			for (int i = level; i < last; i++) {
				int temp = matrix[level][i];
				matrix[level][i] = matrix[last - i + level][level] ;
				matrix[last - i + level][level] = matrix[last][last - i + level];
				matrix[last][last - i + level] = matrix[i][last];
				matrix[i][last]= temp;
			}
			
			level++;
			last--;
		}

		matrix = displayMatrix(size, matrix);
		return matrix;
	}

	public static int[][] displayMatrix(int size, int matrix[][]) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
		return matrix;
	}
	}
