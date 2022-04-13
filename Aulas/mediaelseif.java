package Aulas;
import java.util.Scanner;

public class mediaelseif {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float n1, n2, media;
        
        System.out.println("Informe a primeira nota:");
        n1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota:");
        n2 = entrada.nextFloat();

        media = (n1+n2)/2;

        if(media>=7){
            System.out.println("Parabéns, você foi aprovado com média "+media);
        }
        else if(media>=4){
            System.out.println("Sua média é "+media +" você está na prova final");
        }
        else{
            System.out.println("Sua média é "+media +" você foi reprovado");
        }
    }
    
}
