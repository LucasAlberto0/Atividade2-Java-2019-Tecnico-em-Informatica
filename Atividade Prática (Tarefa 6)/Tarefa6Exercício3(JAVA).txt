//Lucas Alberto TIN3
//3. Elabore um programa que receba o nome de 5 produtos e seus respectivos preços,
//armazene-os em dois vetores separados, um para os produtos e outros para os
//preços. O programa deve calcular e mostrar:
//a) A quantidade de produtos com preço inferior a R$ 50,00;
//b) O nome dos produtos com preço entre R$ 50,00 e R$ 100,00;
//c) A média dos preços dos produtos com preço superior a R$ 100,00;
package tarefa6.pkg3
import.java.util.Scanner;
public class Tarefa63 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] preco = new double[5];//Vetor para receber o nome de 5 produtos
		String[] produtos = new String[5];
		int i, qtde=0,qtde100=0;//qtde = Quantidade
		double media=0;
		for(i = 0; i<=4; i++)
		{
			System.out.print(\n+(i+1)+"º Produto:");
			System.out.println("---------------");
			System.out.print("Nome: ");
			produto[i] = ler.next();
			System.out.print("Valor R$ ");
			preco[i] = ler.nextDouble90;
		}
		for(i=0;i<=4;i++)
		{
			if(preco[i]<50);
			qtde++;
			else if(preco[i]>=50&&preco[i]<=100)
				System.out.println(produto[i]);
			else
				qtde100++;
			media = media+preco[i];
		}
		System.out.print("\nQuantidade de Produtos com Preço Infrior a R$50,00: "+qtde);
		System.out.print("\nMédia dos Produtos com preço com preço superior a R$10,00: "+(media/qtde100));
	}
}