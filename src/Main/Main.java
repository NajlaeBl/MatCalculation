package Main;

import Builder.MatrixBuilderConnecter;
import Clients.Client;
import Factory.FactoryMatrix;
import MultiplicationStratigy.ContextMultip;
import MultiplicationStratigy.IterativeMultiplication;
import MultiplicationStratigy.RecursiveMultiplication;
import Strategy.Addition;
import Strategy.Context;
import Strategy.Substraction;
import singleton.Matrix;
import singleton.RectangularMatrix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix matrix1=new MatrixBuilderConnecter(new FactoryMatrix(2).getMatrix())
				.getMatrixBuilder().setnbrLines(5)
				.setnbrColumns(4).setnbrLinesColumns(5)
				.getMatrix();
		
		matrix1.generate();
		
		Matrix matrix2=matrix1.Clone();
		matrix2.generate();
		
		//matrix1.Afficher();
		
		
		/*System.out.println(":::::verifying output:::::");
		System.out.println("description: "+matrix.getDescription());
		System.out.println("nbrcolumns: "+((RectangularMatrix)matrix).getNbrcolumns());
		System.out.println("nbrLines: "+((RectangularMatrix)matrix).getNbrLines());*/
		
		Matrix matrix3=new Context(new Addition(matrix1, matrix2)).calculate();
		Matrix matrix4=new Context(new Substraction(matrix1, matrix2)).calculate();
		
		Matrix matrix5=new Context(new ContextMultip(new IterativeMultiplication(matrix1, matrix2))).calculate();
		Matrix matrix6=new Context(new ContextMultip(new RecursiveMultiplication(matrix1, matrix2))).calculate();
		matrix6.Afficher();
		
		
		/*
		
		Matrix matrix7=matrix1.Clone();
		Matrix matrix8=matrix1.Clone();
		
		
		Client cl1=new Client(matrix7);
		Client cl2=new Client(matrix8);
		
		System.out.println("Client threads");
		cl1.start();
		cl2.start();*/
		

	}

}
