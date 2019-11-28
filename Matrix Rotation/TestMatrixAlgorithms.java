package com.omniwyse.assignment3;
import org.junit.Assert;
import org.junit.Test;

import com.omniwyse.assignment3.RotateMatrix;

public class TestMatrixAlgorithms {
	@SuppressWarnings("deprecation")
	@Test
	public void testMatrix2() {
		int mat[][] = { { 1, 2 }, { 3, 4 } };
		int rotateMat[][] = { { 3, 1 }, { 4, 2 } };
		// Assert.(rotateMat, RotateMatrix.DisplayMatrix(3, mat));
		Assert.assertEquals(rotateMat, RotateMatrix.rotateMatrix(2, mat));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMatrix() {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rotateMat[][] = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		// Assert.(rotateMat, RotateMatrix.DisplayMatrix(3, mat));
		Assert.assertEquals(rotateMat, RotateMatrix.rotateMatrix(3, mat));
	}

}
