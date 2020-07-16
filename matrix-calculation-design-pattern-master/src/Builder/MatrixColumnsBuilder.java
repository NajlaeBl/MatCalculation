package Builder;

import singleton.Matrix;
import singleton.MatrixColumnes;
import singleton.MatrixLine;

public class MatrixColumnsBuilder implements MatrixBuilder {
	
	private MatrixColumnes matrix;
	public MatrixColumnsBuilder (MatrixColumnes matrix) {

		this.matrix=matrix;
	}
	
	@Override
	public MatrixColumnsBuilder setnbrLines(int nbrLines ) {
		this.matrix.setNbrLines(nbrLines);
		return this;
	}
	@Override
	public MatrixColumnsBuilder setnbrColumns(int nbrColumns) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public MatrixColumnsBuilder setnbrLinesColumns(int nbrLinesColumns) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public Matrix getMatrix() {
		return this.matrix;
	}

}
