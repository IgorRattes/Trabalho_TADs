package Questao3;

public class Lista {
	//Declarando variaveis
	private String[] Array;
    private int QMaxima;
    private int InicioL = 0;
    
    //Construtor Vazio
    public Lista() {
    	QMaxima = 5;
    	Array = new String[QMaxima];
    	
    }
    
    //Construtor com o Tamanho da Lista
    public Lista(int tamMaximo) {
    	QMaxima = tamMaximo;
    	Array = new String[tamMaximo];
    	
    }

    //Incerindo no inicio da lista
    public void InserirInicio(String s) {
    	//Verificando se o Inicio e maior que o tamanho do Array sendo verdade não é possivel inserir
    	if(InicioL >= Array.length) {
    		System.out.println("Nao e posivel inserir");
    	}
    	
    	//Modificando as posições das informações dentro do array
    	for(int i = InicioL; i> 0; i--) {
    		Array[i] = Array[i - 1];
    	}
    	
    	//Inserindo na posição 0 "no inicio" a String s
    	Array[0] = s;
    	//Acrescentando 1 na posição do inicio
    	InicioL++;
    }    
    //Inserindo no Final da lista
    public void InserirFim(String s) {
    	//Verificando se o Inicio e maior que o tamanho do Array sendo verdade não é possivel inserir
    	if(InicioL >= Array.length)
    		System.out.println("Nao e posivel inserir");

    	//Inserindo no Final do Array
    	Array[InicioL] = s;
    	//Acrescentando 1 na posição do inicio
    	InicioL++;
    }
    public void inverte () {
    	int cont=0;
    	int n = Array.length;
    	if (InicioL==0) {
    		System.out.println("Nao há valores no Array");
    	}
    	else {
            for (int i = 0; i < n / 2; i++) {
                String temp = Array[i];
                Array[i] = Array[n - 1 - i];
                Array[n - 1 - i] = temp;
                cont++;
            }
    	}
    	System.out.println("Numero de Movimentações: "+cont+"\n");
 
        	
    }
    
    //Inserindo na posição passada pelo usuário
    public void InserirPosicao(String s, int pos) {
    	//Verificando se o Inicio e maior que o tamanho do Array sendo verdade não é possivel inserir ou a posição é menor que 0 ou maior que a posição inicio
    	if (InicioL >= Array.length || pos < 0 || pos > InicioL)
    		System.out.println("Nao e posivel inserir");
    	//Modificando as posições das informações dentro do array para deixar livre a posição desejada
    	for (int i = InicioL; i > pos; i--){
    		Array[i] = Array[i-1];
    	}
    	//Inserindo na posição escolhida a String s
    	Array[pos] = s;
    	//Acrescentando 1 na posição do inicio
    	InicioL++;
    }
    
    //Removendo no Inicio da Lista
    public String RemoverInicio() {
    	//Verificando se há itens na lista para serem removidos
    	if(InicioL == 0) {
    		System.out.println("Nao e posivel remover");
    	}
    	//Armazenando o array na posição 0 dentro da variavel resp
    	String resp = Array[0];
    	//Decrementando o valor da variavel inicio para remover
    	InicioL--;
    	//Movimentando os dados dentro do Array para finalizarmos a exclusão
    	for(int i = 0; i<InicioL; i++) {
    		Array[i] = Array[i+1];
    	}
    	//Retornando o valor excluido
    	return resp;
    }

    //Removendo no Final da Lista
    public String RemoverFim() {
    	//Verificando se há itens na lista para serem removidos
    	if(InicioL == 0) {
    		System.out.println("Nao e posivel remover");
    	}
    	//Retornando o Array com uma posição a menos (a posição excluida)
    	return Array[--InicioL];
    }
    
    //Removendo na Posição desejada
    public String RemoverPosicao(int pos) {
    	//Verificando se há itens na lista para serem removidos dentro do Array
    	if(InicioL == 0 || pos < 0 || pos >= InicioL) {
    		System.out.println("Nao e posivel remover");	
    	}
    	//Armazenando o conteudo da posição desejada na variavel resp
    	String resp = Array[pos];
    	//Decrementando uma posição na variavel inicio
    	InicioL--;
    	//Movendo os dados para realizar a exclusão na posição desejada
    	for(int i = pos; i< InicioL; i++) {
    		Array[i] = Array[i+1];
    	}
    	//retornando o dado excluido
    	return resp;
    	}

    //Inserindo o valor de N2 após encontrar o N1
	public void inserirN1N2(String n1, String n2) {
		for(int i=0; i<QMaxima; i++) {
			if(Array[i].equalsIgnoreCase(n1)) {
				Array[i+1]=n2;
			}
		}
		
	}
	
    //Mostrando a Lista
    public void Mostrar() {
    	//Mostrando todos os dados da Lista
    	for(int i = 0; i<Array.length; i++) {
            System.out.println("Posição = " + i + " Elemento: " + Array[i]);
    	}
    }
}
