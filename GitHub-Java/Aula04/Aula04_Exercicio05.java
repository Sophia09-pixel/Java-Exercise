import java.util.Scanner;

public class Aula04_Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int num = 0, numMaior = 0, numMenor = 0;

		for (int c = 1; c < 11; c++) {
			System.out.print(c + "° número:");
			num = e.nextInt();

			if (c == 1) {
				numMaior = num;
				numMenor = num;
			} else {
				if(num>numMaior){
					numMaior = num;
				}
				if(num<numMenor){
					numMenor=num;
				}

			}
			

		} // for
		System.out.println("Maior número:"+numMaior);
		System.out.println("Menor número:"+numMenor);

	}// void

}// class
