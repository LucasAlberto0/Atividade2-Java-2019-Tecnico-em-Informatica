//Lucas Alberto TIN3
//1. Elabore um programa que preecha um array de 10 posições digitados pelo
//usuário(valores interos), ao final o programa deve subtrair 1 dos números impares
//e adicionar 1 aos números pares. Exibir em tela os novos valores do array.
package tarefa6.pkg
public class Tarefa6
	
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int[] num = new int[10];
	int i;
	System.out.println("Tarefa6 - exercicio'");
	System.out.println("---------------------\n");
	for(i=0; i<=9; i++)
	{
		System.out.printl("Digite o"+(i+1)+"º valor: ");
		num[i] = ler.nextInt();
		if(num[i] % 2 == 0)
		{
			System.out.println("O número é Par: "+num[1]" ==>"+(num[i]+1));
		}
		else
		{
			System.out.println("O número é Ímpar: "+num[1]" ==>"+(num[i]-1));
		}