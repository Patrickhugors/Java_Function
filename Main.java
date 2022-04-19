  import java.util.Scanner;
  public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int tamVetor, i, soma = 0;
		sc = new Scanner(System.in);
	 
		System.out.print("Qual será o tamanho do Vetor? ");
		tamVetor = sc.nextInt();	
		
		int [] a = new int[tamVetor];
		
		System.out.print("Digite " + tamVetor + " elementos para o Vetor  : ");
		for (i = 0; i < tamVetor; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < tamVetor; i++)
		{
			if(a[i] % 2 != 0)
			{
				soma = soma + a[i]; 
			}
		}		
		System.out.println("A soma dos numeros ímpares contidos no Vetor é: " + soma);
	}
}
