package Estudos.Java.Conversor;

import java.util.Scanner;

public class Main{

public static double Converter(double cotacao, double dolares){
    double reais = 1.6 * (cotacao * dolares);
    return reais;
  }

  public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    System.out.println("Qual é a cotação do dólar? ");
    double cotacao = in.nextDouble();
    System.out.println("Quantos dolares você vai comprar? ");
    double dolares = in.nextDouble();
    double reais = Converter(cotacao, dolares);
    System.out.println("Valor a pagar: " + reais);

    in.close();
  }
}