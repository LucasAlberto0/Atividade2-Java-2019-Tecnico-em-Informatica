//Faça um programa que mostre o menu de opções a seguir, receba a opção
//do usuário e os dados necessários para executar cada operação.
//Obrigatório o uso do Switch/case.
package tarefa4Exercicio2;
import java.util.Scanner;
public class Tarefa4Exercício2;{	
	public static void main(string [] args)
	Scanner ler = new Scanner (System[]args);
			int r;
			int num1,num2;
			double num3,num4;
			
			while (true){
			System.out.print("Menu de Opções:\n\n");
            System.out.print("|----------------------------------------|\n");
            System.out.print("|  Opção 1 - Somar dois Números          |\n");
            System.out.print("|  Opção 2 - Subtrair dois números       |\n");
            System.out.print("|  Opção 3 - Multiplicar dois números    |\n");
            System.out.print("|  Opção 4 - Dividir dois números        |\n");
            System.out.print("|  Opção 5 - Raiz quadrada de um número  |\n");
			System.out.print("|  Opção 6 - Sair           	    	   |\n");
			System.out.print("|----------------------------------------|\n");
            System.out.print("Digite uma opção: ");

			int opção == 1,2,3,4,5,6;
			if (opção == 6) {
				System.out.print("\nAté Logo!");
				menu.close();
			}
			switch (opcao) {
            case 1:
                System.out.print("\nOpção Somar dois números Selecionado");
				System.out.print("\nDigite o numero 1");
				num1 = ler.nextDouble();
				System.out.print("\nDigite o numero 2");
				num2 = ler.nextDouble
                num1 + num2 = r;
				System.out.print("O resultado é:"+r);
				break;

            case 2:
                System.out.print("\nOpção Subtrair dois números  Selecionado\n");
				System.out.print("\nDigite o numero 1");
				num1 = ler.nextDouble();
				System.out.print("\nDigite o numero 2");
				num2 = ler.nextDouble
                r = num1 - num2;
				System.out.print("O resultado é:"+r);
                
				break;

            case 3:
                System.out.print("\nOpção Multiplicar dois números \n");
                System.out.print("\nDigite o numero 1");
				num1 = ler.nextDouble();
				System.out.print("\nDigite o numero 2");
				num2 = ler.nextDouble
                r = num1 * num2;
				System.out.print("O resultado é:"+r);
				break;
			case 4:
				System.out.print("\nOpção Dividir dois números \n");
				System.out.print("\nDigite o numero 1");
				num3 = ler.nextDouble();
				System.out.print("\nDigite o numero 2");
				num4 = ler.nextDouble
                r = num3 / num4 ;
				System.out.print("O resultado é:"+r);
				break;
			default:
			    
				System.out.print("\nOpção Raiz quadrada de um número \n");
				System.out.print("\nDigite o numero 1");
				num1 = ler.nextDouble();
                r = Math.sqrt(num1);
				System.out.print("O resultado é:"+r);
				break;
			}
		}
}
		
      