package Aulas;
import java.util.Scanner;
public class etringulo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe o primeiro numero:");
        a = entrada.nextInt();
        System.out.println("Informe o segundo numero:");
        b = entrada.nextInt();
        System.out.println("Informe o terceiro numero:");
        c = entrada.nextInt();

        if( (a<b+c) && (b<c+a) && (c<b+a) ){
            if(a==b && b==c){
                System.out.println("É um triângulo equilátero");
            }
            else if(a!=b && b!=c && a!=c){
                System.out.println("É um triângulo escaleno");
            }
            else{
                System.out.println("É um triângulo isóceles");
            }
        }
        else{
            System.out.println("Não é um triângulo");
        }

    }
}
