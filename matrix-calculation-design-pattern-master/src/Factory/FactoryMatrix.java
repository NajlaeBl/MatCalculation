package Factory;

import singleton.Matrix;
import singleton.MatrixColumnes;
import singleton.MatrixLine;
import singleton.RectangularMatrix;
import singleton.SquareMatrix;

public class FactoryMatrix {
	private Matrix matrix;
	public FactoryMatrix(int nbr) {
		if(nbr==0) {
			matrix=MatrixLine.getInstance();
		}else if(nbr==1) {
			matrix=MatrixColumnes.getInstance();
		}else if(nbr==2) {
			matrix=SquareMatrix.getInstance();
		}else if(nbr==3) {
			matrix=RectangularMatrix.getInstance();
		}else {
			System.out.print("nbr out of range");
		}
		
	}
	public Matrix getMatrix() {
		return matrix;
	}
	

}
