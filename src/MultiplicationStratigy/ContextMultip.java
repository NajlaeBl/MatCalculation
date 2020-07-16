package MultiplicationStratigy;

import Strategy.Multiplication;
import Strategy.Strategy;
import singleton.Matrix;

public class ContextMultip implements Strategy {
	private Multiplication multipl;
	public ContextMultip(Multiplication multp) {
		this.multipl=multp;
	}
	
	@Override
	public Matrix calculate() {
		return this.multipl.calculate();
		
	}

	@Override
	public boolean verify() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
