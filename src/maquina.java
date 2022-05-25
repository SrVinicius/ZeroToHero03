import java.util.Scanner;

public class maquina {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor inserir a quantidade total da producao: ");
        int producao  = in.nextInt();
        System.out.println("Favor inserir a quantidade total de pecas defeituosas: ");
        int defeituosas  = in.nextInt();
        if (defeituosas > ((producao*10)/100)){
            System.out.println("Atencao! A maquina precisa de manutencao!");
        }
        else{
            System.out.println("Relaxe! Por enquanto a maquina nao precisa de manutencao!");
        }
        in.close();
    }
}
