
package aula2;

import java.util.Scanner;


public class Aula2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = scan.next();
        
        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();
        
        System.out.println("Qual é o seu peso?");
        float peso = scan.nextFloat();
        
        System.out.println("Qual é a sua altura?");
        float altura = scan.nextFloat();
        
        float resultado = peso / (altura * altura);
        String aviso;
        if(resultado < 18.5){
           aviso = "Abaixo do peso";
        }else if(resultado >=18.5 && resultado < 25){
           aviso = "Peso normal";
        }else if(resultado >=25 && resultado < 30){
           aviso = "Sobre peso";
        }else{
           aviso = "Obesidade"; 
        } 
        
        System.out.println(" Nome: " + nome +
                "\n Idade: " + idade + " anos" +
                "\n Peso: " + peso + "kg" +
                "\n Altura: " + altura + "m" +
                "\n Resultado: " + resultado + "kg/m²" +
                "\n Aviso: " + aviso);
        
    }
    
}
