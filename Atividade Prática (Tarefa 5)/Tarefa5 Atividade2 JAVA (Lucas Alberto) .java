//Lucas Alberto TIN3
//2.Faça um programa que receba a idade de 10 pessoas e que calcule 
//e mostre a quantidade 
//de pessoas com idade maior ou igual a 18 anos.
//Obrigatório o uso da estrutura for.
package Tarefa5Atividade2;
import javax.swing.JOptionPane; 
public class Tarefa5Atividade2 
{
		   public static void main(String[] args) {
		   int idade;
		   int cont = 0;//contador
		    for (int c = 1; c <= 10 c++) {
 
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
 
            if (idade >= 18) {
                cont = cont + 1;
				}	
			}
 
			System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é de " + cont);
		}
		   
}
	
