package Clients;
import Strategy.Addition;
import Strategy.Context;
import singleton.Matrix;

public class Client extends Thread {
	private Matrix matrix;
	 public Client(Matrix matrix) {
		this.matrix=matrix;
	}

	@Override
	public void run() {
		matrix.generate();
		Matrix matrix1=matrix.Clone();
		matrix1.generate();
		Matrix matrix3=new Context(new Addition(matrix1, matrix)).calculate();
	}

}
