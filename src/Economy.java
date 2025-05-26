public class Economy extends Passagem {
    public Economy(String cpf, String nome, String assento, double custoPassagem){
        super(cpf, nome, assento, custoPassagem);
    }

    @Override 
       public double custoBagagem(int qtdade, int[] pesos){
        double total = 0;
        for(int i = 0; i < qtdade; i++){
            int peso = pesos[i];
            total = total + peso * 0.50; 
            total = total + 10.00;
        }
        return total;
    }
    
}
/*
 * Na categoria Economy, além do custo normal das bagagens, é cobrado um adicional de
R$10,00 por bagagem.
 */