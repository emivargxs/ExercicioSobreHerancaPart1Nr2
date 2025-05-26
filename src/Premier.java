public class Premier extends Executive{
    public Premier(String cpf, String nome, String assento, double custoPassagem, int milhas){
    super(cpf, nome, assento, custoPassagem, milhas);
    }

    @Override
    public double defineAssento(String a){
        return 0.0;
    }

    @Override
    public double custoBagagem(int qtdade, int[] pesos){
        double total = 0;
        for(int i = 0; i < qtdade; i++){
            int peso = pesos[i];
            if(i >=2){ //cobra a partir da terceira.
            total = total + peso * 0.50; 
            total = total * 0.50; //desconto aplicado 
            }
            //para as duas bagagens nao é cobrado nada.
        }
        return total;
    }

    @Override
     public int getMilhas(){
        return (int) (getCustoPassagem() * 0.2);
    }    
}
