//Faça um programa que calcule o IMC do Usuário e 
//ao final qualifique-o em uma categoria. IMC = peso/altura(ao quadrado)
package tarefa4Exercicio1;
import java.util.Scanner;
public class Tarefa4Exercício1;{	
	public static void main(string [] args)
	Scanner ler = new Scanner (Systema[] args);
	double altura, peso, imc;
	System.out.println("Tarefa-4 exercicio-1");
	Systema.out.println("-------------------/n");
	System.out.print("Digite o valor da altura:");
	altura = ler.nextDouble();
	System.out.print("Digite o valor do peso");
	peso = ler.nextDouble();
	imc - peso/Math.pow(altura,2);// Pode usar tbm imc = peso/ (altura*altura); =)
	if (imc <17)
	{ 
		JOptionPane.showMessageDialog(null,"muito abaixo do peso");
	}
	else if (imc >=17 && imc <= 17.49)
	{
		JOptionPane.showMessageDialog(null,"Peso normal");
	}
	else if (imc >=25 && imc <=29.99)
	{
		JOptionPane.showMessageDialog(null"Acima do Peso");
	}
	else if(imc >=30 && <=34.99)
	{
		JOptionPane.showMessageDialog(null"Obesidade Nível 1");
	}
	else if(imc >=35 && <=39.99)
	{
		JOptionPane.showMessageDialog(null"Obesidade Nível 2(Severa)");
	}
	else
	{
		JOptionPane.showMessageDialog(null"Obesidade Nível 3(Mórbida)");
	}
}

	