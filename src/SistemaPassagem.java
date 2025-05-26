public class SistemaPassagem {
    public static void main(String[] args) throws Exception {
    
        int[] pesos = {20, 15, 10}; // três malas

        // Instanciando passagens de diferentes tipos
        Passagem economy = new Economy("12345678900", "João Silva", "15B", 500.00);
        Passagem executive = new Executive("98765432100", "Maria Souza", "4A", 850.00);
        Passagem premier = new Premier("55555555555", "Carlos Lima", "1A", 1200.00);

        // Emitindo "comprovantes" de passagem
        emitirPassagem(economy, pesos);
        emitirPassagem(executive, pesos);
        emitirPassagem(premier, pesos);
    }

    // Método para imprimir os dados da passagem
    public static void emitirPassagem(Passagem p, int[] pesos) {
        System.out.println("========== PASSAGEM EMITIDA ==========");
        System.out.println("NOME: " + p.getNome());
        System.out.println("CPF: " + p.getCPF());
        System.out.println("ASSENTO: " + p.getAssento());
        System.out.printf("CUSTO DA PASSAGEM: R$ %.2f\n", p.getCustoPassagem());
        System.out.printf("CUSTO DE BAGAGEM: R$ %.2f\n", p.custoBagagem(pesos.length, pesos));
        System.out.printf("CUSTO DE ASSENTO: R$ %.2f\n", p.defineAssento(p.getAssento()));

        // Verifica se tem milhas (se for Executive ou Premier)
        if (p instanceof Executive) {
            Executive ex = (Executive) p;
            System.out.println("MILHAS GERADAS: " + ex.getMilhas());
        }

        System.out.println("=======================================\n");
    }

    
    }

