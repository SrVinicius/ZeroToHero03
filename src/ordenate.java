import java.util.Scanner;

public class ordenate {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); 
        int aux;
        int i;
        int vetor[] = new int[3];
        for(i=0;i<3;i++){
            System.out.println("Informe um numero: ");
            vetor[i] = in.nextInt();
        }
        for(i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Seguem os numeros fornecidos em ordem crescente: \n");
        for(i=0;i<3;i++){
            System.out.println(vetor[i]);
        }
    }
}

