package Builder;

import singleton.Matrix;
import singleton.MatrixLine;

public class MatrixLineBuilder implements MatrixBuilder {
	private MatrixLine matrix;
	public MatrixLineBuilder(MatrixLine matrix) {
		this.matrix=matrix;
	}
	
	@Override
	public MatrixLineBuilder setnbrColumns(int nbrColumns ) {
		this.matrix.setNbrColumns(nbrColumns);
		return this;
	}
	
	@Override
	public MatrixLineBuilder setnbrLines(int nbrLines) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public MatrixLineBuilder setnbrLinesColumns(int nbrLinesColumns) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public Matrix getMatrix() {
		return this.matrix;
	}
	
	
}
