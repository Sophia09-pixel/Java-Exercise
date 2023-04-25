import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");

		String resp = "sim";
		int cont = 1,pag=0;
		double pe =0,total=0;

		// Repeti��o Clientes

		while (resp.equalsIgnoreCase("sim")) {

			System.out.println(cont + "� Cliente");
			total=0;
			
			//Repeti��o para controlar itens
			System.out.println("Digite o pre�o:");
			pe=entrada.nextDouble();
			while(pe !=0){
				total+=pe;
				
				System.out.println("Digite o pre�o:");
				pe = entrada.nextDouble();
			}//fecha itens
			System.out.println("Valor total:"+total);
			
			//Pagamento
			System.out.println("Digite o c�digo de pagamento: ");
			pag = entrada.nextInt();
			
			while(pag<1||pag>4){
				System.out.println("Digite 1,2,3 ou 4");
				pag = entrada.nextInt();
			}
			
			if(pag ==1){
				total = total*0.9;
				System.out.println("Valor final:"+total); 
			}else if(pag==2){
				total = total * 0.95;
				System.out.println("Valor final:"+total); 
			}else if(pag == 3){
				total = total /2;
				System.out.println("Valor final 2x:"+total); 
			}else if(pag ==4){
				total = (total * 1.10)/3;
			}
	
			System.out.println("Deseja cadastrar novo cliente?");
			resp = entrada.next();
			cont++;
			
			//Valida��o resp
			while(!(resp.equalsIgnoreCase("sim"))&&!(resp.equalsIgnoreCase("n�o"))){
				System.out.println("Deseja cadastrar novo cliente sim/n�o?");
				resp = entrada.next();
			}//while valida��o
			
			
		}//resp

	}

}
