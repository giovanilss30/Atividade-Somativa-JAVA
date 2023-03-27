package Somativa;

import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);

    public void exercicio1(){
        System.out.println("Digite O Primeiro Numero:");
        double  n1 = sc.nextDouble();

        System.out.println("Digite O Segundo Numero:");
        double n2 = sc.nextDouble();

        System.out.println("Digite A Operação Aritmetica Que Deseja Realizar: 1: Multiplicação , 2: Divisão , 3: Adição e 4: Subtração:");
        double op = sc.nextDouble();

        if (op==2 && n2==0){
            System.out.println("Não Foi Possivel Realizar A Divisão Por 0, Digite Outro Número! ");

        } else if (op==1) {
            double result1 = n1*n2;
            System.out.println("O Resultado Da Operação Requisitada Foi De : " + result1);

        } else if (op==2){
            double result2 = n1/n2;
            System.out.println("O Resultado Da Operação Requisitada Foi De : " + result2);

        } else if (op==3){
            double result3 = n1+n2;
            System.out.println("O Resultado Da Operação Requisitada Foi De : " + result3);

        } else {
            double result4 = n1-n2;
            System.out.println("O Resultado Da Operação Requisitada Foi De : " + result4);

        }
    
        
    }

    /*========================================================================================================================================================================= */

    public void exercicio2(){
        System.out.println("Digite O Numero De Matricula Do Aluno Para Que Seja Definido Seu Time. ");
        int mat = sc.nextInt();

        if (mat % 4 == 0 ){
            System.out.println("Voce Está No Time do Chris. Parabéns"); 
        } else  if (mat % 4 == 1 ){
            System.out.println("Voce Está No Time do Greg. Parabéns"); 
        } else  if (mat % 4 == 2 ){
            System.out.println("Voce Está No Time do Caruso. Parabéns"); 
        } else {
            System.out.println("Voce Está No Time do Jerome. Parabéns");
        }

    }


    /*=========================================================================================================================================================================== */

    public void exercicio3(){
        System.out.println("Qual A Quantidade De Morangos Que Deseja Comprar Hoje? (Em Kg)");
        double morangos = sc.nextDouble();

        System.out.println("Qual A Quantidade De Maças Que Deseja Comprar Hoje? (Em Kg)");
        double macas = sc.nextDouble();

        System.out.println("Qual A Quantidade De Bananas Que Deseja Comprar Hoje? (Em Kg)");
        double bananas = sc.nextDouble();

        double totalKg = morangos + macas + bananas;

        double morangosPreco = morangos*3.50;
        double macasPreco = morangos*2.30;
        double bananasPreco = bananas*1.80;

        double totalPreco = morangosPreco + macasPreco + bananasPreco;

        if (totalKg>15 || totalPreco>30) {
            double desconto = totalPreco*0.1;
            double precoFinal = totalPreco-desconto;
            System.out.println("O Preço Da Sua Compra Foi De: R$" + totalPreco + " Porem Voce Obteve Um Desconto De: R$" + desconto + " Portanto O Preço Final Da Sua Compra Foi De: R$" + precoFinal ) ;

        } else {
            System.out.println("O Preço Da Sua Compra Foi De: R$" + totalPreco);
        }

}
}

 

