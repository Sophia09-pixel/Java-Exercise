import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");
		
		double preCarro = 0,total=0,perc=0;
		
		System.out.println("Digite o preço do carro:");
		preCarro = entrada.nextDouble();
		
		//a)
		System.out.println("Preço final á vista com desconto de 20%:"+preCarro * 0.8);
		
		//b)
		for(int i = 6;i < 66; i+=6){
			perc+=3;
			total = preCarro + (preCarro * perc/100);
			System.out.println("O preço final parcelado em "+i+" X é de "+formataMoeda.format(total)+" com parcelas de "+formataMoeda.format(total/i)); 
		}

	}

}
