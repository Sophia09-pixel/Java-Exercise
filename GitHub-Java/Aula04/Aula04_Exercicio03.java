import java.util.Scanner;

public class Aula04_Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int canal=0,num=0,totNum=0,cont4=0,cont5=0,cont7=0,cont12=0;
		
		System.out.println("Digite o número do canal: ");
		canal = e.nextInt();
		
		
		while(canal!=0){
			switch(canal){
			case 4:
				System.out.println("Digite o número de pessoas: ");
				num = e.nextInt();
				cont4++;
				cont4=cont4+num;
				break;
			case 5:
				System.out.println("Digite o número de pessoas: ");
				num = e.nextInt();
				cont5++;
				cont5=cont5+num;
				break;
				
			case 7:
				System.out.println("Digite o número de pessoas: ");
				num = e.nextInt();
				cont7++;
				cont7=cont7+num;
				break;
			case 12:
				System.out.println("Digite o número de pessoas: ");
				num = e.nextInt();
				cont12++;
				cont12=cont12+num;
				break;
				
				
					
			}
			totNum += totNum + num;
			System.out.println("Digite o número do canal");
			canal = e.nextInt();
			
		}
		if(totNum != 0 ){
			System.out.println("Canal 4:"+(double)cont4/totNum*100);
			System.out.println("Canal 5:"+(double)cont5/totNum*100);
			System.out.println("Canal 7:"+(double)cont7/totNum*100);
			System.out.println("Canal 12:"+(double)cont12/totNum*100);
		}

	}

}
