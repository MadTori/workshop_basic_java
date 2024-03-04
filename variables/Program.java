
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
        
        double[]idades = new double[10000];
        int contagem = 0;
        double ultimaIdadeDigitada = 0;
        
        System.out.println("Informe valores de idades de pessoas. Informe um vaor negativo para sair: ");
        
        do{
            ultimaIdadeDigitada = teclado.leDouble();
            if(ultimaIdadeDigitada >= 0){
                idades[contagem] = ultimaIdadeDigitada;
                contagem = contagem + 1;
            }
        }while(ultimaIdadeDigitada >= 0);
        
        int quantidadeIdadesInformadas = contagem;
        double somaIdades = 0;
        contagem = 0;
        
        while(contagem < quantidadeIdadesInformadas){
            somaIdades = somaIdades + idades[contagem];
            contagem = contagem + 1;
        }
        
        double media = ultimaIdadeDigitada / quantidadeIdadesInformadas;
        
        System.out.println("Soma das idades informadas: " + somaIdades);
        System.out.println("A média das idades é: " + media);
        
    }
}
