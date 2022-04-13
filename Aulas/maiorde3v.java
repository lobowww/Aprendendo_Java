package Aulas;
import java.util.Scanner;
public class maiorde3v {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Informe o primeiro número:");
        n1 =  entrada.nextInt();
        System.out.println("Informe o segundo número:");
        n2 =  entrada.nextInt();
        System.out.println("Informe o terceiro número:");
        n3 =  entrada.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("O maior é "+n1);
        }
        else if(n2>n1 && n1>n3){
            System.out.println("O maior é "+n2);
        }
        else{
            System.out.println("O maior é"+n3);
        }

    }
    
}
