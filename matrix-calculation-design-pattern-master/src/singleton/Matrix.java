package singleton;



public interface Matrix {

	public void generate();

	public int getDescription();
	public void  setNbrLines(int nbrLines );
	public void  setNbrColumns(int nbrColumns );
	public void setNbrLinesColumns(int nbrLinesColumns );
	public int getNbrLines();
	public int getNbrcolumns();
	public Matrix Clone();
	public void Afficher();
	public int[][] getMatrix();
	public void serMatrix(int[][] matrix);
	
	
	

}
