public class Passagem{
    private String cpf;
    private String nome;
    private String assento;
    private double custoPassagem;

    public Passagem(String cpf, String nome, String assento, double custoPassagem){
        this.cpf =cpf;
        this.nome = nome;
        this.assento = assento;
        this.custoPassagem = custoPassagem;
    }

    public String getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getAssento(){
        return assento;
    }

    public double getCustoPassagem(){
        return custoPassagem;
    }

    
    public double custoBagagem(int qtdade, int[] pesos){
        double total = 0;
        for(int i = 0; i < qtdade; i++){
            int peso = pesos[i];
            total = total + peso * 0.50; 
        }
        return total;
    }
    public double defineAssento(String a){
        return 5.00;
    }

    
}