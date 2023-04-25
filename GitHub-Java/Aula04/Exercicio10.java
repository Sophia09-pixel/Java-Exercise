package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		double divida=0, total=0,juros=0,valorParcela=0,perc=0;
	
		
		System.out.println("Informe o valor inicial da divida:");
		divida = entrada.nextDouble();
		
		System.out.println("O preço final parcelado em 1 X é de "+divida+" com parcelas de "+divida);
		
	
		 
		 for(int j=3;j<13;j+=3) {
				perc+=5;
				total = divida + (divida * perc/100);
				System.out.println("O preço final parcelado em "+j+" X é de "+numFormatado.format(total)+" com parcelas de "+numFormatado.format(total/j));
			}
		 
		 
		 
		 
		

	}
}
