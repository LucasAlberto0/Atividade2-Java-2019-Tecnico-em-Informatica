//Lucas Alberto TIN3
//2. Elabore um programa que preencha um array de 10 posições digitaos pelo
//usuário(valores inteiros), calcule e mostre:
//a) A quantidade de números pares.
//b) Quais os números pares.
//c) A quantidade de números ímpares.
//d) Quais os números ímpares
package tarefa6.pkg2;
import java.util.Scanner;
public class Tarefa62 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in)/
		int[] num = new int[10];
		int i,qp=0,qi=0;
		System.out.println("Tarefa6 - Exercício2");
		System.out.println("--------------------\n");
		for(i=0; i<=9; i++)
		{
			System.out.printl("Digite o"+(i+1)+"º valor: ");
			num[i] = ler.nextInt();
		}
		for(i=0; i<=9; i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]+" é par");
				qp++;
			}
		}
		System.out.println("\nQuantidade de Números Pares: "+qp);
		for(i=0; i<=9; i++)
		{
			if(num[i]%2==1)
			{
				System.out.println(num[i]+" é Ímpar");
				qp++;
			}
		}
		System.out.println("\nQuantidade de Números Ímpares: "+qp);
	}
}
