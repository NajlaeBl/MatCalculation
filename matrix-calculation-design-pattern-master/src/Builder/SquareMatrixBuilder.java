package Builder;

import singleton.Matrix;
import singleton.RectangularMatrix;
import singleton.SquareMatrix;

public class SquareMatrixBuilder implements MatrixBuilder {
	private SquareMatrix matrix;

	public SquareMatrixBuilder(SquareMatrix matrix) {
		this.matrix = matrix;
	}

	@Override
	public SquareMatrixBuilder setnbrLinesColumns(int nbrLinesColumns) {
		this.matrix.setNbrLinesColumns(nbrLinesColumns);
		return this;
	}

	@Override
	public SquareMatrixBuilder setnbrLines(int nbrLines) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public SquareMatrixBuilder setnbrColumns(int nbrColumns) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public Matrix getMatrix() {
		return this.matrix;
	}

}
