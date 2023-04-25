import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade=0,cont50=0,contAltura = 0, cont40 = 0;
		double altura = 0, peso =0,somaAltura = 0;
		char sexo;
		
		//Scanner
		Scanner entrada  = new Scanner(System.in);
		
		//Estrutura-de-Reptição
		
		for(int cont = 0;cont <4;cont++){
			System.out.println("Digite o nome:");
			nome = entrada.next();
			
			System.out.println("Digite a idade:");
			idade = entrada.nextInt();
			
			System.out.println("Digite a altura:");
			altura = entrada.nextDouble();
			
			System.out.println("Digite o peso:");
			peso = entrada.nextDouble();
			
			System.out.println("Digite o sexo (F/M):");
			sexo=entrada.next().toUpperCase().charAt(0);
			
			
			
			if(idade > 50){
				cont50++;
				
			}
			
			if(idade > 10 && idade < 20){
				contAltura++;
				somaAltura += altura;
				
			}
			
			if(peso <40){
				cont40++;
				
			}
			
			
		}//fecha repetição
		System.out.println("Número de pessoas com idade maior que 50:"+cont50);
		System.out.println("Média das alturas de pessoas entre 10 e 20 anos: "+somaAltura/contAltura);
		System.out.println("Porcentagem de pessoas com o peso inferior a 40Kg: "+(double)cont40/4*100);

	}

}
