
/**
 * Escreva a descrição da classe Programa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Programa
{
    public static void main(String[] args){
        Teclado teclado = new Teclado();
        
        Doacao[] doacoes = new Doacao[10000];
        int indice = 0;
        int continuar = 2;
        
        do{
            Doacao doacao = new Doacao();
            
            System.out.println("Informe o nome do doador:");
            doacao.nomeDoador = teclado.leString();
            
            System.out.println("Informe o valor da doação:");
            doacao.valor = teclado.leDouble();
            
            doacoes[indice] = doacao;
            indice = indice + 1;
            
            System.out.println("Deseja informar uma nova doação?(1 para sim e 2 para não):");
            continuar = teclado.leInt();
            
        }while(continuar == 1);
        
        int quantidadeDoacoes = indice;
        double somaDoacoes = 0;
        indice = 0;
        
        while(indice < quantidadeDoacoes){
            somaDoacoes = somaDoacoes + doacoes[indice].valor;
            indice = indice + 1;
        }
        
        System.out.println("Valor total das doações: " + somaDoacoes);
        System.out.println("Quantidade de doações: " + quantidadeDoacoes);
    }
}
