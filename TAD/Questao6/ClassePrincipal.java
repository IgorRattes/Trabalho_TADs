package Questao6;

public class ClassePrincipal {
	public static void main(String[] args){
		System.out.println("QUESTÃO 6");
		Fila filaParImpar = new Fila(4);
		int[] fila = new int[]{1, 2, 3, 4};
		int[] filaPar = new int[4];
		int[] filaImpar = new int[4];
		filaParImpar.SepararF (fila, filaPar, filaImpar);
		filaParImpar.ExibirF();
	
}
}
