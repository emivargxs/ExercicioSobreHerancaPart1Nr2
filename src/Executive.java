public class Executive extends Passagem {
    private int milhas;

    public Executive(String cpf, String nome, String assento, double custoPassagem, int milhas){
        super(cpf, nome, assento, custoPassagem);
        this.milhas = milhas;
    }
    
    @Override
    public double custoBagagem(int qtdade, int[] pesos){
        double total = 0;
        for(int i = 0; i < qtdade; i++){
            int peso = pesos[i];
            if(i >=2){ //cobra a partir da terceira.
            total = total + peso * 0.5; 
            }
            //para as duas bagagens nao é cobrado nada.
        }
        return total;
    }

    public int getMilhas(){
        return (int) (getCustoPassagem() * 0.1);
    }    
}
/*
 Na categoria Executive duas bagagens são isentas de custo
 */

 /*
  e a viagem dá direito a 10%
do custo da passagem em milhas.

  */