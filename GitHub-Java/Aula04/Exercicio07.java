import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matricula = 0, presenca = 0, nota1=0,nota2=0,nota3=0,aluno=0,i=0,media=0;
		int contRep =0,contAp=0,contRepPre=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos:");
		aluno = entrada.nextInt();
		 
		for(i = 0; i<aluno;i++){
			System.out.println("Digite a matricula do aluno: ");
			matricula = entrada.nextInt();
			
			System.out.println("Digite a frequencia do aluno: ");
			presenca = entrada.nextInt();
			
			System.out.println("Digite a 1° nota do aluno:");
			nota1 = entrada.nextInt();
			
			System.out.println("Digite a 2° nota do aluno:");
			nota2 = entrada.nextInt();
			
			System.out.println("Digite a 3° nota do aluno:");
			nota3 = entrada.nextInt();
			
			media = (nota1 + nota2 + nota3)/3;
			
			if(presenca <40){
				System.out.println(+matricula+"reprovado por frequência abaixo do necessáriao");
				contRepPre++;
			}
			
			if(media > 6 && presenca >=40){
				System.out.println(+matricula+" Aprovado com média de "+media);
				contAp++;
				
			}else{
				System.out.println(+matricula+" Reprovado com média de: "+media);
				contRep++;
			}
			
			
			
		}
		
		System.out.println("Número de alunos aprovados:"+contAp);
		System.out.println("Número de alunos reprovados:"+contRep);
		System.out.println("Número de alunos reprovados por frequencia abaixo do necessário:"+contRepPre); 
		
		

	}

}
