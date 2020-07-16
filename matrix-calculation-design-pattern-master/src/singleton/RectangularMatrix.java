package singleton;

public class RectangularMatrix implements Matrix {
	

	private int nbrLines;
	private int nbrcolumns;
	private int description;
	private int[][] matrix;
	private static RectangularMatrix instance;

	private RectangularMatrix() {
		this.description = 3;

	}

	public static Matrix getInstance() {
		if (instance == null) {
			instance = new RectangularMatrix();
		}
		return instance;

	}

	@Override
	public void generate() {
		this.matrix=new int[this.nbrLines][this.nbrcolumns];
		System.out.println("::::::::::::::::");
		for (int i = 0; i < this.nbrLines; i++) {
			for (int j = 0; j < this.nbrcolumns; j++) {
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
		for (int i = 0; i < this.nbrLines; i++) {
			for (int j = 0; j < this.nbrcolumns; j++) {
				System.out.print(matrix[i][j]+" , ");
			}
			System.out.println("");
		}
		System.out.println(":::::::::::End Affichage:::::::::::");
		
	}

	@Override
	public int getNbrLines() {
		return nbrLines;
	}
	@Override
	public int getNbrcolumns() {
		return nbrcolumns;
	}

	
	

	@Override
	public int getDescription() {
		return this.description;
	}
	
	@Override
	public void setNbrLines(int nbrLines) {
		this.nbrLines = nbrLines;
	}
	
	

	@Override
	public void setNbrLinesColumns(int nbrLinesColumns) {
		System.out.println("you cannot use this function for this case");
		
	}
	@Override
	public void setNbrColumns(int nbrcolumns) {
		this.nbrcolumns = nbrcolumns;
	}

	@Override
	public Matrix Clone() {
		Matrix m =new RectangularMatrix();
		m.setNbrColumns(this.nbrcolumns);
		m.setNbrLines(this.nbrLines);
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
