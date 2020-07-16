package Builder;

import singleton.Matrix;
import singleton.MatrixColumnes;
import singleton.MatrixLine;
import singleton.RectangularMatrix;

public class RectangularMatrixBuilder implements MatrixBuilder {
	private RectangularMatrix matrix;

	public RectangularMatrixBuilder(RectangularMatrix matrix) {

		this.matrix = matrix;
	}

	@Override
	public RectangularMatrixBuilder setnbrLines(int nbrLines) {
		this.matrix.setNbrLines(nbrLines);
		return this;
	}

	@Override
	public RectangularMatrixBuilder setnbrLinesColumns(int nbrLinesColumns) {
		System.out.println("you can't use this finction for this matrix");
		return this;
	}

	@Override
	public RectangularMatrixBuilder setnbrColumns(int nbrColumns) {
		this.matrix.setNbrColumns(nbrColumns);
		return this;
	}

	@Override
	public Matrix getMatrix() {
		return this.matrix;
	}

}
