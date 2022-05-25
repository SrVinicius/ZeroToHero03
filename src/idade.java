import java.util.Scanner;

public class idade {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Ola! Por favor, inserir a idade do nadador: ");
        int idadenadador  = in.nextInt();
        if(idadenadador <= 10){
          System.out.println("Sua categoria eh: Infantil");  
        }else if(idadenadador > 17){
            System.out.println("Sua categoria eh: Senior");
        }else{
            System.out.println("Sua categoria eh: Juvenil");
        }
        in.close();
    }
}
