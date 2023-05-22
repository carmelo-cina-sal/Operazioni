import java.util.Scanner;
public class Operazioni {

    public static void main(String[] args) {
      int scelta = 0;
      System.out.println("Selezionare l'operazione da effettuare");
      System.out.println("1-somma tra due numeri");
      System.out.println("2-differenza tra due numeri");
      System.out.println("3-prodotto tra due numeri");
      Scanner in = new Scanner(System.in);
      scelta = in.nextInt();

      System.out.println("Dammi il primo numero:");
      int primo = in.nextInt();
      System.out.println("Dammi il secondo numero:");
      int secondo = in.nextInt();

      Operazioni f1 = new Operazioni();


      
      switch (scelta){
        case 1: System.out.println(primo-secondo); 
                break;
        case 2: System.out.println(primo-secondo);; 
                break;
        case 3: System.out.println(primo*secondo);; 
                break;
        default: System.out.println("Funzionalità non prevista!");
      }
    }   
}