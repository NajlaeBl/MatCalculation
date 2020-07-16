package Strategy;

import singleton.Matrix;

public class Addition implements Strategy {
	private Matrix matrix1;
	private Matrix matrix2;
	private int[][] m1;
	private int[][] m2;
	public Addition(Matrix matrix1,Matrix matrix2) {
		this.matrix1=matrix1;
		this.matrix2=matrix2;
		
		this.m1=matrix1.getMatrix();
		this.m2=matrix2.getMatrix();
	}

	@Override
	public Matrix calculate() {
		if(verify()) {
			int result[][]=new int[this.m1.length][this.m1[0].length];
			System.out.println("::::::::Calculate Add::::::::");
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					result[i][j]=this.m1[i][j]+this.m2[i][j];
					System.out.print(result[i][j]+" , ");
				}
				System.out.println("");
			}
			System.out.println("::::::::End::::::::");
			Matrix matrixResult= this.matrix1.Clone();
			matrixResult.setNbrColumns(this.m1[0].length);
			matrixResult.setNbrLines(this.m1.length);
			matrixResult.setNbrLinesColumns(this.m1.length);
			return matrixResult;
		}else {
			System.out.println("we cannot make this operation");
			return null;
		}	
	}
	
	@Override
	public boolean verify() {
		if(this.m1[0].length==this.m2[0].length) {
			if(this.m1.length==this.m2.length) {
				return true;
			}
			return false;
		}
		return false;
	}

}
