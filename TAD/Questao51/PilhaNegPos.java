package Questao51;

public class PilhaNegPos {
	 private int[] Pilha;
	    private int ultimaPosicaoPositivo;
	    private int ultimaPosicaoNegativo;

	    public PilhaNegPos(){
	        Pilha = new int[4];
	        ultimaPosicaoPositivo = Pilha.length -1;
	        ultimaPosicaoNegativo = 0;
	    }
	    public PilhaNegPos(int tam){
	        Pilha = new int[tam];
	        ultimaPosicaoPositivo = tam -1;
	        ultimaPosicaoNegativo = 0;
	    }

	    public void InserirP(int n){
	    	if(ultimaPosicaoPositivo >= Pilha.length || ultimaPosicaoNegativo < 0 || ultimaPosicaoPositivo == ultimaPosicaoNegativo-1) {
	    		System.out.println("Não é possível fazer inserção do termo: "+n+"\n");
	    	}
	    	else {
	        //Posição para n negativo
	    		if(n < 0) { 
	    			Pilha[ultimaPosicaoNegativo] = n;
	    			ultimaPosicaoNegativo++;
	    		}
	    	//Caso não seja negativo insere na posição dos positivos
	    		else {
	    			Pilha[ultimaPosicaoPositivo] = n;
	    			ultimaPosicaoPositivo--;
	    		}
	    	}
	    }

	    public void ExibirP(){
	        for(int i = 0; i<Pilha.length; i++){
	            System.out.println("Posicao: " + i + " Elemento: " + Pilha[i]);
	        }
	    }

}
