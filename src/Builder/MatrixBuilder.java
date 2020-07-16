package Builder;

import singleton.Matrix;

public interface MatrixBuilder {
	
	public MatrixBuilder setnbrLines(int nbrLines );
	public MatrixBuilder setnbrColumns(int nbrColumns );
	public MatrixBuilder setnbrLinesColumns(int nbrLinesColumns );
	public Matrix getMatrix();

}
