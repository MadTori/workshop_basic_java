
/**
 * Escreva a descrição da classe Programa aqui.
 * 
 * Nicolas Loiseau 
 *
 */
public class Program
{
    public static void main(String[] args){
        int nb_donation = 0;
            int total_donation = 0;
            Teclado teclado = new Teclado();
            Donation doner_info = new Donation();

            System.out.println("Donor name:");
            doner_info.nomeDoador = teclado.leString();
            System.out.println("Donor amount:");
            doner_info.valor = teclado.leDouble();
            System.out.println("Do you want to report a new donation?");
            int result = teclado.leInt();
            if (result == 1) {
                total_donation += doner_info.valor;
                nb_donation += 1;
            }
            System.out.println("Total donation amount: " + total_donation + " Number of donations: " + nb_donation);
    }
}
