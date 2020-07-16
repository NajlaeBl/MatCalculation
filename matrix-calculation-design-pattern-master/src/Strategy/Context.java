package Strategy;

import singleton.Matrix;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	public Matrix calculate() {
		return this.strategy.calculate();
	}

}
