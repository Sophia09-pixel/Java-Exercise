import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id =0; char op; int contIdade = 0,contA=0,contB=0,contC=0,contD=0,contE=0,contPessoas=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a sua idade: ");
		id = entrada.nextInt();
		
		
		while (id !=0){
			System.out.println("Qual a sua opinião em relação ao filme?");
			op = entrada.next().toUpperCase().charAt(0);
			switch(op){
			case 'A':
				contA++;
				break;
			case 'B':
				contB++;
				break;
			case 'C':
				contC++;
				break;
			case 'D':
				contD++;
				break;
			case 'E':
				contE++;
				break;
				
				default:
					System.out.println("Digite uma opção válida:");
					contPessoas--;
				
			}
			contIdade += id;
			contPessoas += 1;
			
			System.out.println("Digite a sua idade: ");
			id = entrada.nextInt();
			
		}
		
		System.out.println("A quantidade de pessoas que responderam a pesquisa foi de: "+contPessoas);
		System.out.println("A média de idade das pessoas que responderam a pesquisa foi de:"+contIdade/contPessoas);
		System.out.println("A porcentagem de cada uma das respostas:");
		System.out.println("Média de respostas A:"+(double)contA/contPessoas);
		System.out.println("Média de respostas B:"+(double)contB/contPessoas);
		System.out.println("Média de respostas C:"+(double)contC/contPessoas);
		System.out.println("Média de respostas D:"+(double)contD/contPessoas);
		System.out.println("Média de respostas E:"+(double)contE/contPessoas);
		

	}

}
