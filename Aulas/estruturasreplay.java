package Aulas;
import java.util.Scanner;
public class estruturasreplay {
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        int idades;
        int cont = 0;

        for(int i = 0; i <= 15; idades++){
            System.out.println("Informe sua idade:");
            idades = entrada.nextInt();

            if(idades <= 12){
                cont++;
            }
        }
        System.out.println("A quantidade de pessoas com idade menor ou igual a 12 anos é de "+ cont);  
    }
}
