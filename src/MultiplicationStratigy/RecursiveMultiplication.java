package MultiplicationStratigy;

import Strategy.Multiplication;
import singleton.Matrix;

public class RecursiveMultiplication implements Multiplication {
	private Matrix matrix1;
	private Matrix matrix2;
	private int[][] m1;
	private int[][] m2;
	private  int i = 0, j = 0, k = 0;

	public RecursiveMultiplication(Matrix matrix1, Matrix matrix2) {
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;

		this.m1 = matrix1.getMatrix();
		this.m2 = matrix2.getMatrix();
	}

	@Override
	public Matrix calculate() {
		if (verify()) {
			int result[][] = new int[this.m1.length][this.m2[0].length];
			System.out.println("::::::::Calculate Mutlp Recursive::::::::");
			this.multiplyMatrixRec(this.m1.length, this.m1[0].length, this.m1, this.m2.length, this.m2[0].length, this.m2,
					result);
			System.out.println("::::::::End::::::::");
			Matrix matrixResult = this.matrix1.Clone();
			matrixResult.setNbrColumns(result[0].length);
			matrixResult.setNbrLines(result.length);
			matrixResult.setNbrLinesColumns(result.length);
			matrixResult.serMatrix(result);
			return matrixResult;
		} else {
			System.out.println("we cannot make this operation");
			return null;
		}
	}

	@Override
	public boolean verify() {
		if (this.m1[0].length == this.m2.length) {
			return true;
		}
		return false;
	}

	public void multiplyMatrixRec(int row1, int col1, int A[][], int row2, int col2, int B[][], int C[][]) {

		if (i >= row1)
			return;


		if (j < col2) {
			if (k < col1) {
				C[i][j] += A[i][k] * B[k][j];
				k++;

				multiplyMatrixRec(row1, col1, A, row2, col2, B, C);
			}

			k = 0;
			j++;
			multiplyMatrixRec(row1, col1, A, row2, col2, B, C);
		}

		j = 0;
		i++;
		multiplyMatrixRec(row1, col1, A, row2, col2, B, C);
	}

}
