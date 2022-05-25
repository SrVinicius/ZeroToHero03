import java.util.Scanner;
import java.text.DecimalFormat;

public class folha {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor inserir a quantidade de folhas: ");
        int folhas  = in.nextInt();
        if (folhas > 100){
            double total = (folhas*0.20);
            System.out.println("O total a ser pago sera: "+ (new DecimalFormat(".##").format(total)) + " reais");
        }else{
            double total = folhas*0.25;
            System.out.println("O total a ser pago sera: "+ (new DecimalFormat(".##").format(total)) + " reais");
        }
        in.close();
    }
}
