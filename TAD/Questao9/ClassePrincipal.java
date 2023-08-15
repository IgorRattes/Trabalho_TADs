package Questao9;

public class ClassePrincipal {
	public static void main(String[] args) {
		
		Fila f1= new Fila(6);
		f1.inserirFila(3);
		f1.inserirFila(4);
		f1.inserirFila(1);
		f1.inserirFila(10);
		f1.inserirFila(9);
		f1.inserirFila(7);
		f1.ExibirFilas();
		f1.ordenarFilaComPilhas(null);
		f1.ExibirFilas();
	}	
}
