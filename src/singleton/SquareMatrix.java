package singleton;

public class SquareMatrix implements Matrix {
	private int nbrLinesColumns;
	private int description;
	private int[][] matrix;
	private static SquareMatrix instance;

	private SquareMatrix() {
		this.description = 2;
	}

	public static Matrix getInstance() {
		if (instance == null) {
			instance = new SquareMatrix();
		}
		return instance;

	}

	@Override
	public void setNbrLines(int nbrLines) {
		System.out.println("you cannot use this function for this case");

	}

	@Override
	public void setNbrColumns(int nbrColumns) {
		System.out.println("you cannot use this function for this case");

	}

	@Override
	public int getNbrLines() {
		// TODO Auto-generated method stub
		return this.nbrLinesColumns;
	}

	@Override
	public int getNbrcolumns() {
		// TODO Auto-generated method stub
		return this.nbrLinesColumns;
	}

	@Override
	public void generate() {
		this.matrix=new int[this.nbrLinesColumns][this.nbrLinesColumns];
		System.out.println("::::::::::::::::");
		for (int i = 0; i < this.nbrLinesColumns; i++) {
			for (int j = 0; j < this.nbrLinesColumns; j++) {
				matrix[i][j]=(int)(Math.random()*(100));
				System.out.print(matrix[i][j]+" , ");
			}
			System.out.println("");
		}
		System.out.println("::::::::::::::::::::::");
		

	}
	
	@Override
	public void Afficher() {
		System.out.println("::::::::Affichage::::::");
		for (int i = 0; i < this.nbrLinesColumns; i++) {
			for (int j = 0; j < this.nbrLinesColumns; j++) {
				System.out.print(matrix[i][j]+" , ");
			}
			System.out.println("");
		}
		System.out.println(":::::::::::End Affichage:::::::::::");
		
	}


	public int getNbrLinesColumns() {
		return nbrLinesColumns;
	}

	public void setNbrLinesColumns(int nbrLinesColumns) {
		this.nbrLinesColumns = nbrLinesColumns;
	}

	@Override
	public int getDescription() {
		return this.description;
	}
	
	
	@Override
	public Matrix Clone() {
		Matrix m =new SquareMatrix();
		m.setNbrLinesColumns(this.nbrLinesColumns);
		return m;
	}
	
	@Override
	public int[][] getMatrix() {
		return this.matrix;
	}

	@Override
	public void serMatrix(int[][] matrix) {
		this.matrix=matrix;
		
	}

}
