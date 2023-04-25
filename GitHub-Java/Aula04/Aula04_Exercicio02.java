import java.util.Scanner;

public class Aula04_Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int voto = 0, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, cand5 = 0, cand6 = 0,cont=0;

		System.out.println("Digite o seu voto: ");
		voto = e.nextInt();

		while (voto != 0) {

			switch (voto) {
			case 1:
				cand1++;
				break;
			case 2:
				cand2++;
				break;
			case 3:
				cand3++;
				break;
			case 4:
				cand4++;
				break;
			case 5:
				cand5++;
				break;
			case 6:
				cand6++;
				break;
			
				default:
					System.out.println("Digite um voto Válido!");
					cont = cont -1;
					
			}
			
			System.out.println("Digite o seu voto: ");
			voto = e.nextInt();
			cont++;

		}
		System.out.println("Candidato 1:"+cand1);
		System.out.println("Candidato 2:"+cand2);
		System.out.println("Candidato 3:"+cand3);
		System.out.println("Candidato 4:"+cand4);
		System.out.println("Votos Nulos:"+cand5);
		System.out.println("Votos em Branco:"+cand6);
		System.out.println("Porcentagem de votos em branco: "+(double)cand6/cont*100+"%");
		System.out.println("Porcentagem de votos nulos: "+(double)cand5/cont*100+"%");
	}

}
