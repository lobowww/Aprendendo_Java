package Aulas;
import java.util.Scanner;
public class CalculadoraImc{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double p, h, imc;

        System.out.println("Informe seu peso:");
        p = entrada.nextDouble();
        System.out.println("Informe sua altura:");
        h = entrada.nextDouble();

        imc = p/(h*h);

        if(imc <= 18.5){
            System.out.println("Seu IMC é igual a "+ imc +", quer dizer que você está abaixo do peso.");
        }
        else if((imc >= 18.5) && (imc <= 25)){
            System.out.println("Seu IMC é igual a "+imc+", quer dizer que você está com peso normal.");
        }
        else if((imc >= 25)&&(imc <= 30)){
            System.out.println("Seu IMC é igual a "+imc+", quer dizer que você está acima do peso");
        }
        else if(imc >= 30){
            System.out.println("Seu IMC é igual a "+imc+", quer dizer que você está obeso");
        }
    }
}
