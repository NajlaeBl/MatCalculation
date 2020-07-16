package Builder;

import singleton.Matrix;
import singleton.MatrixColumnes;
import singleton.MatrixLine;
import singleton.RectangularMatrix;
import singleton.SquareMatrix;

public class MatrixBuilderConnecter {
	private MatrixBuilder matrixBuilder;

	public MatrixBuilderConnecter(Matrix matrix) {
		if (matrix.getDescription() == 0) {
			this.matrixBuilder = new MatrixLineBuilder((MatrixLine) matrix);
		} else if (matrix.getDescription() == 1) {
			this.matrixBuilder = new MatrixColumnsBuilder((MatrixColumnes) matrix);
		} else if (matrix.getDescription() == 2) {
			this.matrixBuilder = new SquareMatrixBuilder((SquareMatrix) matrix);
		} else if (matrix.getDescription() == 3) {
			this.matrixBuilder=new RectangularMatrixBuilder((RectangularMatrix)matrix);
		} else {
			System.out.print("nbr out of range");
		}

	}
	public MatrixBuilder getMatrixBuilder() {
		return this.matrixBuilder;
	}
}
