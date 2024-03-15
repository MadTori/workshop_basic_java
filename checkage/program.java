
/**
 * Write the class description here.
 * 
 * Nicolas Loiseau 
 * 
 */

public class program
{
    public static void main(String[] args)
    {
      Teclado teclado = new Teclado();
      idade idade2 = new idade();
      int borned_year = teclado.leInt();
      int current_year = teclado.leInt();
      
      int result = idade2.verificar(borned_year, current_year);
      
      System.out.println("age = " + result);
    }
}
