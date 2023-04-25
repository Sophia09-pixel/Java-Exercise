import java.util.Scanner;

public class Aula04_Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		int idade=0,cont=0,tot1=0,tot2=0,tot3=0,tot4=0,tot5=0;
		
		for(cont = 0;cont<5;cont++){
			System.out.println("Digite a idade:");
			idade = e.nextInt();
			
			if(idade <= 15){
				tot1++;
			}else{
				if(idade >= 16 && idade <= 30){
					tot2++;
				}else{
					if(idade >= 31 && idade <= 45){
						tot3++;
					}else{
						if(idade >= 46 && idade <= 60){
							tot4++;
						}else{
							tot5++;
						}
					}
				}
			}
		}
		System.out.println("1° Faixa Etária: "+tot1);
		System.out.println("2° Faixa Etária: "+tot2);
		System.out.println("3° Faixa Etária: "+tot3);
		System.out.println("4° Faixa Etária: "+tot4);
		System.out.println("5° Faixa Etária: "+tot5);
		System.out.println("A porcentagem da 1° faixa é de: "+(double)tot1/5*100);

	}

}
