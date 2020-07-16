package MultiplicationStratigy;
import Strategy.Multiplication;
import singleton.Matrix;

public class IterativeMultiplication implements Multiplication {
	
	private Matrix matrix1;
	private Matrix matrix2;
	private int[][] m1;
	private int[][] m2;
	
	public IterativeMultiplication(Matrix matrix1,Matrix matrix2) {
		this.matrix1=matrix1;
		this.matrix2=matrix2;
		
		this.m1=matrix1.getMatrix();
		this.m2=matrix2.getMatrix();
	}

	@Override
	public Matrix  calculate() {
		if(verify()) {
			int result[][]=new int[this.m1.length][this.m2[0].length];
			System.out.println("::::::::Calculate MutlpIterative::::::::");
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					int pseudoResult=0;
					for (int k = 0; k < this.m1[0].length; k++) {
						
						pseudoResult=pseudoResult+this.m1[i][k]*this.m2[k][j];
						
					}
					result[i][j]=pseudoResult;
					System.out.print(result[i][j]+" , ");
				}
				System.out.println("");
			}
			System.out.println("::::::::End::::::::");
			Matrix matrixResult= this.matrix1.Clone();
			matrixResult.setNbrColumns(result[0].length);
			matrixResult.setNbrLines(result.length);
			matrixResult.setNbrLinesColumns(result.length);
			matrixResult.serMatrix(result);
			return matrixResult;
		}else {
			System.out.println("we cannot make this operation");
			return null;
		}	
	}
	
	@Override
	public boolean verify() {
		if(this.m1[0].length==this.m2.length) {
			return true;
		}
		return false;
	}

	
}
